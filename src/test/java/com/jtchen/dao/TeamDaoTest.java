package com.jtchen.dao;

import com.jtchen.BaseTest;
import com.jtchen.entity.Team;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/15 0015 23:13
 */
public class TeamDaoTest extends BaseTest {

    @Autowired
    private TeamDao teamDao;

    @Test
    public void queryTeam(){
        List<Team> teamList = teamDao.queryTeam();
    }

    @Test
    public void insertTeam(){
        Team team = new Team();
        team.setTeamChineseName("勇士队");
        team.setTeamEnglishName("Golden State Warriors");
        team.setTeamAddress("美国加利福尼亚州奥克兰市");
        team.setTeamBoss("乔·拉科布、皮特·古伯");
        team.setTeamCoach("史蒂夫·科尔");
        team.setTeamDescription("金州勇士队（Golden State Warriors）[1]  于1946年成立并加盟BAA（1949年加盟NBA），是一支属于美国的加利福尼亚州奥克兰市（Oakland, California）的职业篮球队，是美国男篮职业联赛（NBA）西部联盟太平洋赛区的一部分");
        team.setTeamAssociation("NBA");
        team.setTeamHomeCourt("甲骨文球馆（Oracle Arena）");
        team.setTeamFoundTime("1946年");
        team.setTeamHonor("5次NBA总冠军");
        team.setTeamWikiUrl("https://baike.baidu.com/item/%E9%87%91%E5%B7%9E%E5%8B%87%E5%A3%AB%E9%98%9F/3694353?fr=aladdin&fromid=11157138&fromtitle=%E5%8B%87%E5%A3%AB%E9%98%9F");
        team.setTeamLogo("F:/myProjects/images/warriors.jpg");
        team.setPriority(1);
        Date now = new Date();
        team.setCreateTime(now);
        team.setLastEditTime(now);
        teamDao.insertTeam(team);
    }

    @Test
    public void updateTeam(){
        Team team = new Team();
        team.setTeamId(1);
        team.setTeamChineseName("勇士队");
        team.setTeamEnglishName("Golden State Warriors");
        team.setTeamAddress("美国加利福尼亚州奥克兰市");
        team.setTeamBoss("乔·拉科布、皮特·古伯");
        team.setTeamCoach("史蒂夫·科尔");
        team.setTeamDescription("金州勇士队（Golden State Warriors）[1]  于1946年成立并加盟BAA（1949年加盟NBA），是一支属于美国的加利福尼亚州奥克兰市（Oakland, California）的职业篮球队，是美国男篮职业联赛（NBA）西部联盟太平洋赛区的一部分");
        team.setTeamAssociation("NBA");
        team.setTeamHomeCourt("甲骨文球馆（Oracle Arena）");
        team.setTeamFoundTime("1946年");
        team.setTeamHonor("5次NBA总冠军");
        team.setTeamWikiUrl("https://baike.baidu.com/item/%E9%87%91%E5%B7%9E%E5%8B%87%E5%A3%AB%E9%98%9F/3694353?fr=aladdin&fromid=11157138&fromtitle=%E5%8B%87%E5%A3%AB%E9%98%9F");
        team.setTeamLogo("F:/myProjects/images/warriors.jpg");
        team.setPriority(1);
        team.setLastEditTime(new Date());
        teamDao.updateTeam(team);
    }
}
