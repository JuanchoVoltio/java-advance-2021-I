package com.javacourse.soccerleagueadmin.business;

import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.persistence.Database;

public class Business {
    private Database database = new Database();
    public boolean savePlayer(Player player){
        boolean isSaved = false;

        int idReturn = -1;

        if(validatePlayer(player)) {
            idReturn = database.createPlayer(player);
        }

        isSaved = idReturn > 0;

        return isSaved;
    }

    private boolean validatePlayer(Player player){
        boolean isValid = false;
        return isValid;
    }
}
