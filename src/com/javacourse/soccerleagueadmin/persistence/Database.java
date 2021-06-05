package com.javacourse.soccerleagueadmin.persistence;

import com.javacourse.soccerleagueadmin.dto.Coach;
import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.dto.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Database {
    private List<Player> players;
    private List<Team> teams;
    private List<Coach> coaches;

    public Database(){
        setPlayers(new ArrayList<>());
        setTeams(new LinkedList<>());
        setCoaches(new ArrayList<>());
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
