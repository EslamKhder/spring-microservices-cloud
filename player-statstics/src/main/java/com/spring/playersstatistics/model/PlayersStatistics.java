package com.spring.playersstatistics.model;

public class PlayersStatistics {

    private String numberTeams;
    private String numberPlayers;
    private String country;

    public PlayersStatistics() {
    }

    public PlayersStatistics(String numberTeams, String numberPlayers, String country) {
        this.numberTeams = numberTeams;
        this.numberPlayers = numberPlayers;
        this.country = country;
    }

    public String getNumberTeams() {
        return numberTeams;
    }

    public void setNumberTeams(String numberTeams) {
        this.numberTeams = numberTeams;
    }

    public String getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(String numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
