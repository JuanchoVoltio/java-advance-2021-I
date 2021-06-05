package com.javacourse.soccerleagueadmin.business.simulator;

public class F1Simulator implements Simulator{
    @Override
    public void simulateMatch() {

    }

    @Override
    public boolean simulateShooting() {
        return false;
    }

    @Override
    public boolean determineOffSide() {
        return false;
    }

    @Override
    public Integer addExtraTime() {
        //TODO: Generar un número aleatorio entre 5 y 15
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
