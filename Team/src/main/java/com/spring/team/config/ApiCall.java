package com.spring.team.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.team.model.Team;

//@FeignClient(name = "football-players",url = "localhost:8589")
@FeignClient(name = "football-players")
@RibbonClient(name = "football-players")
public interface ApiCall {

    @GetMapping("/football-players/buy/{from}/player/{to}")
    Team getFootballPlayer(@PathVariable String from, @PathVariable String to);
}
