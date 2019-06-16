package top.yzlin.jx3strategystation.action.gamedata;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yzlin.jx3strategystation.entity.game.MenPai;
import top.yzlin.jx3strategystation.service.GameDataService;

import java.util.List;

public class BaseGameDataAction extends ActionSupport {
    String xinFaName;
    private GameDataService gameDataService;

    public void setXinFaName(String xinFaName) {
        this.xinFaName = xinFaName;
    }

    @Autowired
    public void setGameDataService(GameDataService gameDataService) {
        this.gameDataService = gameDataService;
    }

    public List<MenPai> getMenPaiList() {
        return gameDataService.findMenPaiList();
    }
}
