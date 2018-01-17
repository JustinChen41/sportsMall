package com.jtchen.dao;

import com.jtchen.BaseTest;
import com.jtchen.entity.Player;
import com.jtchen.entity.Team;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/16 0016 21:55
 */
public class PlayerDaoTest extends BaseTest {

    @Autowired
    private PlayDao playDao;

    @Test
    public void testQueryPlayer(){
        Player player = playDao.queryByPlayerId(1);
        System.out.println("球员中文名： "+player.getPlayerChineseName());
        System.out.println("球员英文名： "+player.getPlayerEnglishName());
        System.out.println("球队中文名："+player.getTeam().getTeamChineseName());
        System.out.println("球队英文名："+player.getTeam().getTeamEnglishName());
    }

    @Test
    public void testInsertPlayer(){
        Player player = new Player();
        player.setPlayerChineseName("克莱·汤普森");
        player.setPlayerEnglishName("Klay Thompson");
        player.setPlayerNationality("美国");
        player.setPlayerBirthPlace("美国加利福尼亚州洛杉矶");
        player.setPlayerBirthday("1990年2月8日");
        player.setPlayerPosition("得分后卫");
        player.setPlayerHeight("2.01米/6英尺7英寸");
        player.setPlayerWeight("93公斤/205磅");
        player.setPlayerNumber("11");
        player.setPlayerHonor("2011-12赛季最佳新秀阵容第一阵容 \n" +
                "2014-15、2015-16赛季最佳阵容第三阵容 \n" +
                "2014-15、2016-17赛季NBA总冠军 \n" +
                "三次入选全明星阵容");
        player.setPlayerDescription("克莱·汤普森于2011年通过选秀进入NBA，新秀赛季入选最佳新秀阵容第一阵容；2014-15、2016-17赛季两次随勇士队获得NBA总冠军；两次入选最佳阵容第三阵容，三次入选全明星阵容。");
        player.setPlayerWikiUrl("https://baike.baidu.com/item/%E5%85%8B%E8%8E%B1%C2%B7%E6%B1%A4%E6%99%AE%E6%A3%AE/2799506?fr=aladdin&fromid=11263647&fromtitle=%E5%85%8B%E8%8E%B1%E6%B1%A4%E6%99%AE%E6%A3%AE");
        player.setPlayerPortrait("");
        player.setPriority(2);
        Date now = new Date();
        player.setCreateTime(now);
        player.setLastEditTime(now);
        Team team = new Team();
        team.setTeamId(1);
        player.setTeam(team);
        playDao.insertPlayer(player);
    }
    @Test
    public void testUpdatePlayer(){
        Player player = new Player();
        player.setPlayerId(1);
        player.setPlayerChineseName("斯蒂芬·库里");
        player.setPlayerEnglishName("Stephen Curry");
        player.setPlayerNationality("美国");
        player.setPlayerBirthPlace("美国俄亥俄州阿克伦");
        player.setPlayerBirthday("1988年3月14日");
        player.setPlayerPosition("控球后卫");
        player.setPlayerHeight("1.91米/6英尺3英寸");
        player.setPlayerWeight("83.9公斤/185磅");
        player.setPlayerNumber("30");
        player.setPlayerHonor("两次NBA常规赛MVP（2014-15赛季；2015-16赛季）\n" +
                "两次入选最佳阵容第一阵容（2014-15赛季；2015-16赛季） 两次NBA总冠军（2014-15赛季；2016-17赛季） \n" +
                "四次入选NBA全明星首发阵容");
        player.setPlayerDescription("斯蒂芬·库里于2009年通过选秀进入NBA后一直效力于勇士队，新秀赛季入选最佳新秀第一阵容；2014-15、2016-17赛季两次随勇士队获得NBA总冠军；两次当选常规赛MVP，两次入选最佳阵容第一阵容，四次入选全明星赛西部首发阵容。");
        player.setPlayerWikiUrl("https://baike.baidu.com/item/%E6%96%AF%E8%92%82%E8%8A%AC%C2%B7%E5%BA%93%E9%87%8C/902812?fr=aladdin&fromid=8916710&fromtitle=%E5%BA%93%E9%87%8C");
        player.setPlayerPortrait("");
        player.setPriority(1);
        Date now = new Date();
        player.setLastEditTime(now);
        Team team = new Team();
        team.setTeamId(1);
        player.setTeam(team);
        playDao.updatePlayer(player);
    }

    @Test
    public void queryPlayerList(){
        List<Player> playerList = playDao.queryPlayerList();
        for(Player player : playerList){
            System.out.println("球员中文名： "+player.getPlayerChineseName());
            System.out.println("球员英文名： "+player.getPlayerEnglishName());
            System.out.println("球队中文名："+player.getTeam().getTeamChineseName());
            System.out.println("球队英文名："+player.getTeam().getTeamEnglishName());
        }
    }
}
