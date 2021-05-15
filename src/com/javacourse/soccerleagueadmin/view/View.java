package com.javacourse.soccerleagueadmin.view;

import com.javacourse.soccerleagueadmin.business.Business;
import com.javacourse.soccerleagueadmin.dto.Player;

public class View {
    public Player player;

    private Business business = new Business();

    public String savePlayer(Player player){
        String statusReturn;

        boolean statusSave = business.savePlayer(player);

        if(statusSave)
            statusReturn = "The player was saved successfully";
        else
            statusReturn = "Didn't save the player correctly";

        return statusReturn;
    }
}
