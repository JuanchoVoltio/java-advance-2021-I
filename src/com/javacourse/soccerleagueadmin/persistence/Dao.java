package com.javacourse.soccerleagueadmin.persistence;

import com.javacourse.soccerleagueadmin.dto.DTO;
import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.dto.Team;

public class Dao<D extends DTO> {

    private Database db = new Database();
    boolean notDuplicated = true;

    public D findById(Integer id){
        D result = null;

        if(result.getClass().equals(Player.class)){
            for (DTO current : db.getPlayers()) {
                if (current.getId().equals(result.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
        }else if(result.getClass().equals(Player.class)){
            for (DTO current : db.getTeams()) {
                if (current.getId().equals(result.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
        }

        return result;
    }

    public boolean create(DTO dto){
        boolean notDuplicated = true;

        if(dto instanceof Player) {
            for (DTO current : db.getPlayers()) {
                if (current.getId().equals(dto.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
            if (notDuplicated) {
                db.getPlayers().add((Player)dto);
            }
        }else if(dto instanceof Team){
            for (DTO current : db.getTeams()) {
                if (current.getId().equals(dto.getId())) {
                    notDuplicated = false;
                    break;
                }
            }
            if (notDuplicated) {
                db.getTeams().add((Team)dto);
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
