package com.javacourse.soccerleagueadmin.persistence;

import com.javacourse.soccerleagueadmin.dto.Player;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Player> players = new ArrayList<>();

    public int createPlayer(Player player){
        int returnCode = -1;

        returnCode = players.add(player)     ? 1 : -1;

        return returnCode;
    }
}
