package com.javacourse.soccerleagueadmin.constants.enums;

public enum PlayerPosition {
    GK("Arquero"), DF("Defensa"), MD("Mediocampista"), FW("Delantero");

    private String description;

    private PlayerPosition(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static PlayerPosition getPlayerPositionFromDescription(String description){
        for(PlayerPosition current :PlayerPosition.values()){
            if(current.getDescription().equals(description)){
                return current;
            }
        }

        return null;
    }
}


//MD("Mediocampista") es similar a: PlayerPosition MD = new PlayerPosition("Mediocampista)
