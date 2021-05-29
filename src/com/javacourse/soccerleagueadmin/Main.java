package com.javacourse.soccerleagueadmin;

import com.javacourse.soccerleagueadmin.business.BusinessController;
import com.javacourse.soccerleagueadmin.constants.enums.PlayerPosition;
import com.javacourse.soccerleagueadmin.dto.DTO;
import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.dto.Team;
import com.javacourse.soccerleagueadmin.persistence.Database;

public class Main{

	public static void main(String[] args){
		Database db = new Database();
		BusinessController businessController = new BusinessController();

		Player newPlayer = new Player(1, "Mayer Candelo", PlayerPosition.MD);
		Team newTeam = new Team();
		DTO anotherNewPlayer = new Player(2, "Hamilton Ricard", PlayerPosition.FW);

		businessController.createItem(newPlayer, db);
		businessController.createItem(anotherNewPlayer, db);


		DTO d = newPlayer;
		Player p = (Player)anotherNewPlayer;


		printSum(3, 4);
		printSum(6, 8, 7, 10, 15);

	}

	public static void printSum(int... numbers){
		int result = 0;
		for (int currentValue: numbers) {
			result += currentValue;
		}
		System.out.println(result);
	}



}
