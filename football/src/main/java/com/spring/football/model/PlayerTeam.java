package com.spring.football.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "players")
public class PlayerTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "from_")
    private String from;
    @Column(name = "to_")
    private String to;
    private int moneyPlayer;
    private int moneyTeam;
    private String name;
    @Transient
    private String port;
    public PlayerTeam() {
    }

    public PlayerTeam(long id, String from, String to, int moneyPlayer, int moneyTeam) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.moneyPlayer = moneyPlayer;
        this.moneyTeam = moneyTeam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getMoneyPlayer() {
        return moneyPlayer;
    }

    public void setMoneyPlayer(int moneyPlayer) {
        this.moneyPlayer = moneyPlayer;
    }

    public int getMoneyTeam() {
        return moneyTeam;
    }

    public void setMoneyTeam(int moneyTeam) {
        this.moneyTeam = moneyTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
