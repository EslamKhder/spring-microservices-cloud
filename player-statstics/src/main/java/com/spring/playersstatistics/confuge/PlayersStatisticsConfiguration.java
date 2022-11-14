package com.spring.playersstatistics.confuge;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("players.statistics")
public class PlayersStatisticsConfiguration {

    private String numberTeams;
    private String numberPlayers;
    private String country;

    public PlayersStatisticsConfiguration() {
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
