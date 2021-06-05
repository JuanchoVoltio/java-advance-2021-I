package com.javacourse.soccerleagueadmin.business.simulator;

public interface Simulator {

    void simulateMatch();

    boolean simulateShooting();

    boolean determineOffSide();

    default Integer addExtraTime(){
        //TODO: Generar un número aleatorio entre 1 y 10
        throw new UnsupportedOperationException("Not implemented yet");
    }


}
