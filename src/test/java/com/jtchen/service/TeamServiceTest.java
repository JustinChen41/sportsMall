package com.jtchen.service;

import com.jtchen.BaseTest;
import com.jtchen.dao.TeamDao;
import com.jtchen.dto.TeamExecution;
import com.jtchen.entity.Team;
import com.jtchen.enums.TeamStateEnum;
import com.jtchen.exceptions.TeamOperationException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/17 0017 21:31
 */
public class TeamServiceTest extends BaseTest {

    @Autowired
    private TeamService teamService;

    @Test
    public void testQueryTeam(){
        Team team = teamService.queryTeamById(2);
        System.out.println("球队名称："+team.getTeamChineseName());
    }

    @Test
    public void testAddTeam() throws TeamOperationException, FileNotFoundException{
        Team team = new Team();
        team.setTeamChineseName("洛杉矶湖人队");
        team.setTeamEnglishName("L.A. Lakers");
        team.setTeamAddress("加利福尼亚州洛杉矶市");
        team.setTeamBoss("吉姆·巴斯");
        team.setTeamCoach("卢克·沃顿");
        team.setTeamDescription("洛杉矶湖人队（Los Angeles Lakers）是一个位于美国加利福尼亚州洛杉矶的篮球俱乐部，1947年成立于明尼阿波利斯，1960年搬迁到了洛杉矶。湖人这个名字来源于明尼阿波利斯的别称——千湖之地，指在美国东北五大湖工作或者居住的人。");
        team.setTeamAssociation("NBA");
        team.setTeamHomeCourt("斯台普斯球馆（STAPLES Center)");
        team.setTeamFoundTime("1947年");
        team.setTeamHonor("2008-2010年获得两连冠 \n" +
                "1999-2002年获得队史第二个三连冠 \n" +
                "1980年代在埃尔文·约翰逊带领下获5个冠军 \n" +
                "1951-1954年获得队史第一个三连冠");
        team.setTeamWikiUrl("https://baike.baidu.com/item/%E6%B4%9B%E6%9D%89%E7%9F%B6%E6%B9%96%E4%BA%BA%E9%98%9F/406453?fr=aladdin&fromid=11156694&fromtitle=%E6%B9%96%E4%BA%BA");
        team.setPriority(2);
        File file = new File("F:\\myProjects\\images\\warriors.jpg");
        InputStream inputStream = new FileInputStream(file);
        TeamExecution teamExecution = teamService.saveTeam(team, inputStream, file.getName());
        assertEquals(TeamStateEnum.SUCCESS.getState(), teamExecution.getState());
    }
    @Test
    public void testModifyTeam() throws TeamOperationException, FileNotFoundException {
        Team team = new Team();
        team.setTeamId(2);
        File file = new File("F:\\myProjects\\images\\timg.jpg");
        InputStream inputStream = new FileInputStream(file);
        TeamExecution teamExecution = teamService.modifyTeam(team, inputStream, file.getName());
        assertEquals(TeamStateEnum.SUCCESS.getState(), teamExecution.getState());
        System.out.println("新图片地址： "+ teamExecution.getTeam().getTeamLogo());
    }
}
