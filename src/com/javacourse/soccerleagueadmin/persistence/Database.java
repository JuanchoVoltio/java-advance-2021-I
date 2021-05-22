package com.javacourse.soccerleagueadmin.persistence;

import java.util.List;

import com.javacourse.soccerleagueadmin.dto.Player;

public class Database {
	
	private List<Player> lista;
	
	public Player findPlayer(Integer id) {
		for (Player player : lista) {
			if(player.getId()==id) {
				return player;
			}
		}
		return null;
	}
}
