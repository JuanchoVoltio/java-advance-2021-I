package com.javacourse.soccerleagueadmin.dto;

import com.javacourse.soccerleagueadmin.constants.enums.PlayerPosition;

public class Player extends DTO{
    public static final String POS_GK = "GK";
    public static final String POS_DF = "DF";
    public static final String POS_MD = "MD";
    public static final String POS_FW = "FW";
    private PlayerPosition position;

//    public Player(Integer id, String name, String position){
//        setId(id);
//        setName(name);
//        this.position = position;
//    }

    public Player(Integer id, String name, PlayerPosition position){
        setId(id);
        setName(name);
        this.position = position;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }
}
