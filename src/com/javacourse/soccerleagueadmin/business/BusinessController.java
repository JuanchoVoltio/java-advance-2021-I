package com.javacourse.soccerleagueadmin.business;

import com.javacourse.soccerleagueadmin.dto.Player;
import com.javacourse.soccerleagueadmin.persistence.Database;

public class BusinessController {
	private final String[] positions = { "arquero", "delantero", "defensa", "mediocampista" };
	private Database database = new Database();

	/*
	 * public boolean savePlayer(Player player){ boolean retorno = false;
	 * 
	 * int idReturn = -1;
	 * 
	 * if(validatePlayer(player)) { idReturn = database.createPlayer(player); }
	 * 
	 * retorno = idReturn > 0;
	 * 
	 * return retorno; }
	 */

	public boolean updatePlayer(Player player) {
		boolean isUpdate = false;

		isUpdate = validatePlayer(player);

		return isUpdate;
	}

	private boolean validatePlayer(Player player) {
		boolean isValid = false;
		isValid = player != null;
		if (isValid) {
			isValid = player.getShirtNumber() >= 0 && player.getShirtNumber() <= 99;
			if (isValid) {
				isValid = player.getPosition() != null;
				if (isValid) {
					for (String position : positions) {
						isValid = position.equals(player.getPosition().toLowerCase());
						if (isValid)
							break;
					}
				}
			}
		}
		return isValid;
	}
}
