package com.spring.playersstatistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.playersstatistics.confuge.PlayersStatisticsConfiguration;
import com.spring.playersstatistics.model.PlayersStatistics;

@RestController
@RequestMapping("/players-management")
public class PlayersStatisticsController {

    @Autowired
    private PlayersStatisticsConfiguration playersStatisticsConfiguration;

    // local /players-management/statistics
    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){
        return new PlayersStatistics(playersStatisticsConfiguration.getNumberTeams(),playersStatisticsConfiguration.getNumberPlayers(),playersStatisticsConfiguration.getCountry());
    }
}
