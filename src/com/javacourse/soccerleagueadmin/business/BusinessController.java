package com.javacourse.soccerleagueadmin.business;

import com.javacourse.soccerleagueadmin.dto.DTO;
import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.dto.Team;
import com.javacourse.soccerleagueadmin.persistence.Database;

public class BusinessController {

    public boolean createItem(DTO dto, Database database){
        boolean successful = false;

        if(dto instanceof Player) {
            Player p = (Player) dto;

            System.out.println("Intentado insertar al jugador " + p.getName() + ", el jugador es un "+ p.getPosition().getDescription() + " ....");

            successful = database.create(p);

        }else if(dto instanceof Team){

        }

        return successful;
    }
}
