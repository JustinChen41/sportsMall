package com.jtchen.service.impl;

import com.jtchen.dao.TeamDao;
import com.jtchen.dto.TeamExecution;
import com.jtchen.entity.Team;
import com.jtchen.enums.TeamStateEnum;
import com.jtchen.exceptions.TeamOperationException;
import com.jtchen.service.TeamService;
import com.jtchen.util.ImageUtil;
import com.jtchen.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.Date;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/14 0014 23:34
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Override
    public Team queryTeamById(int teamId) {
        return teamDao.queryByTeamId(teamId);
    }

    /**
     * 保存球队信息
     * @param team
     * @param teamImgInputStream
     * @param fileName
     * @return
     */
    @Override
    @Transactional
    public TeamExecution saveTeam(Team team, InputStream teamImgInputStream, String fileName) {
        //空值判断
        if(team == null) {
            return new TeamExecution(TeamStateEnum.NULL_TEAM);
        }
        else {
            //给球队信息赋初始值
            Date now = new Date();
            team.setCreateTime(now);
            team.setLastEditTime(now);
            //添加板块信息
            int effectNum = teamDao.insertTeam(team);
            if (effectNum <= 0){
                throw new TeamOperationException("球队插入失败");//TeamOperationException事务会终止并回滚
            }
            else {
                if (teamImgInputStream != null){
                    try{
                        addTeamImg(team, teamImgInputStream, fileName);
                    }
                    catch (Exception e){
                        throw new TeamOperationException("图片保存异常："+ e.getMessage());
                    }
                    //更新球队信息
                    effectNum = teamDao.updateTeam(team);
                    if (effectNum <= 0){
                        throw new TeamOperationException("更新图片地址失败");
                    }
                }
            }
        }
        return new TeamExecution(TeamStateEnum.SUCCESS, team);
    }

    /**
     * 更新球队信息
     * @param team
     * @param teamImgInputStream
     * @param fileName
     * @return
     */
    @Override
    @Transactional
    public TeamExecution modifyTeam(Team team, InputStream teamImgInputStream, String fileName) {
        if(team == null || team.getTeamId() == null){
            return new TeamExecution(TeamStateEnum.NULL_TEAM);
        }
        else{
            try{
                //1. 判断是否要处理图片
                if(teamImgInputStream != null && fileName != null && !"".equals(fileName)){
                    Team tempTeam = teamDao.queryByTeamId(team.getTeamId());
                    if(tempTeam.getTeamLogo() != null){
                        ImageUtil.deleteFileOrPath(tempTeam.getTeamLogo());
                    }
                    addTeamImg(team, teamImgInputStream, fileName);
                }
                //2. 更新店铺信息
                team.setLastEditTime(new Date());
                int effectNum = teamDao.updateTeam(team);
                if(effectNum <= 0){
                    return new TeamExecution(TeamStateEnum.INNER_ERROR);
                }
                else{
                    team = teamDao.queryByTeamId(team.getTeamId());
                    return new TeamExecution(TeamStateEnum.SUCCESS, team);
                }
            }
            catch (Exception e){
                throw new TeamOperationException("modify error："+e.getMessage());
            }
        }
    }

    private void addTeamImg(Team team, InputStream teamImgInputStream, String fileName) {
        //获取area图片目录的相对值路径
        String dest = PathUtil.getTeamImagePath(team.getTeamId());
        String teamImgAddr = ImageUtil.generateThumbnail(teamImgInputStream, fileName, dest);
        team.setTeamLogo(teamImgAddr);
    }
}
