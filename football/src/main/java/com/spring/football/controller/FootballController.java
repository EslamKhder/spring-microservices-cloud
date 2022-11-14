package com.spring.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.football.dao.PlayerTemDao;
import com.spring.football.model.PlayerTeam;

@RestController
@RequestMapping("/football-players")
public class FootballController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private PlayerTemDao playerTemDao;


    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from,@PathVariable String to){
        PlayerTeam playerTeam = playerTemDao.findByFromAndTo(from,to);
        playerTeam.setPort(port);
        return playerTeam;
    }
}
