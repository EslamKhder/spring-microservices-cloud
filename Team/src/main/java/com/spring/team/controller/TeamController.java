package com.spring.team.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.team.config.ApiCall;
import com.spring.team.model.Team;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @Autowired
    private ApiCall apiCall;

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from,@PathVariable String to){
        Map<String,String> urlAttribute = new HashMap<>();
        urlAttribute.put("from",from);
        urlAttribute.put("to",to);
        ResponseEntity<Team> teamResponseEntity = new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{from}/player/{to}",
                Team.class,
                urlAttribute
        );
        Team teamResponse = teamResponseEntity.getBody();
        Team team = new Team(teamResponse.getId(),teamResponse.getFrom(),teamResponse.getTo(),teamResponse.getMoneyTeam(),"NONE","50");
        return team;
    }
    @GetMapping("/teamNew/{from}/player/{to}")
    public Team teamWithPlayerNew(@PathVariable String from,@PathVariable String to){

        Team teamResponse = apiCall.getFootballPlayer(from,to);
        teamResponse.setNote("No");
        teamResponse.setNumberTeam("20");
        //Team team = new Team(teamResponse.getId(),teamResponse.getFrom(),teamResponse.getTo(),teamResponse.getMoneyTeam(),"NONE","50");
        return teamResponse;
    }
}
