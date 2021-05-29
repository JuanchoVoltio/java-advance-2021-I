package com.javacourse.soccerleagueadmin.persistence;

import com.javacourse.soccerleagueadmin.dto.Coach;
import com.javacourse.soccerleagueadmin.dto.DTO;
import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.dto.Team;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Player> players;
    private List<Team> teams;
    private List<Coach> coaches;

    public Database(){
        players = new ArrayList<>();
        teams = new ArrayList<>();
        coaches = new ArrayList<>();
    }


    public boolean create(DTO dto){
        boolean notDuplicated = true;

        if(dto instanceof Player) {
            for (DTO current : players) {
                if (current.getId().equals(dto.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
            if (notDuplicated) {
                players.add((Player)dto);
            }
        }else if(dto instanceof Team){
            for (DTO current : teams) {
                if (current.getId().equals(dto.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
            if (notDuplicated) {
                teams.add((Team)dto);
            }
        }

        return notDuplicated;
    }

    public boolean createMultipleItems(DTO... items){
        boolean ok = false;

        for(DTO current : items){
            ok = create(current);
            if(!ok){
                System.out.println("No se pudo ingresar el " + current.getClass() + " con id: " + current.getId());
            }
        }

        return ok;
    }
}
