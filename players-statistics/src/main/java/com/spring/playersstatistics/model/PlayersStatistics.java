package com.spring.playersstatistics.model;

public class PlayersStatistics {

    private int numberTeams;
    private int numberPlayers;
    private String country;

    public PlayersStatistics() {
    }

    public PlayersStatistics(int numberTeams, int numberPlayers, String country) {
        this.numberTeams = numberTeams;
        this.numberPlayers = numberPlayers;
        this.country = country;
    }

    public int getNumberTeams() {
        return numberTeams;
    }

    public void setNumberTeams(int numberTeams) {
        this.numberTeams = numberTeams;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
