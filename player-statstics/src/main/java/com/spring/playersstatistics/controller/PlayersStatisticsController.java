package com.spring.playersstatistics.controller;

import io.github.resilience4j.retry.annotation.Retry;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.playersstatistics.confuge.PlayersStatisticsConfiguration;
import com.spring.playersstatistics.model.PlayersStatistics;

@RestController
@RequestMapping("/players-management")
public class PlayersStatisticsController {

    private Logger logger =
            LoggerFactory.getLogger(PlayersStatisticsController.class);
    @Autowired
    private PlayersStatisticsConfiguration playersStatisticsConfiguration;

    // local /players-management/statistics
    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){
        return new PlayersStatistics(playersStatisticsConfiguration.getNumberTeams(),playersStatisticsConfiguration.getNumberPlayers(),playersStatisticsConfiguration.getCountry());
    }

    @GetMapping("/salary")
    @Retry(name = "requestsTimes",fallbackMethod = "callBack")
    public Integer getSalary(){
        logger.info("Request Done.");
        ResponseEntity<Integer> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:4758/salary", Integer.class
        );
        return responseEntity.getBody();
    }


    public Integer callBack(Exception e){
        return 5000;
    }
}
