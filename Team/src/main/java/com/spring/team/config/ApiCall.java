package com.spring.team.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.team.model.Team;

@FeignClient(name = "football-players",url = "localhost:8888")
public interface ApiCall {

    @GetMapping("/football-players/buy/{from}/player/{to}")
    Team getFootballPlayer(@PathVariable String from,@PathVariable String to);
}
