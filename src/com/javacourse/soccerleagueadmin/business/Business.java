package com.javacourse.soccerleagueadmin.business;

import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.persistence.Database;

public class Business {
    private Database database = new Database();
    public boolean savePlayer(Player player){
        boolean retorno = false;

        int idReturn = -1;

        if(validatePlayer(player)) {
            idReturn = database.createPlayer(player);
        }

        retorno = idReturn > 0;

        return retorno;
    }

    private boolean validatePlayer(Player player){
        boolean isValid = false;
        return isValid;
    }
}
