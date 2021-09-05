package com.spring.football.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.football.model.PlayerTeam;

@Repository
public interface PlayerTemDao extends JpaRepository<PlayerTeam,Long> {

    PlayerTeam findByFromAndTo(String from,String to);
}
