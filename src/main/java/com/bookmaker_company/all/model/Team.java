package com.bookmaker_company.all.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Team {
    private UUID id;
    private String teamName;
    private BigDecimal raiting;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public BigDecimal getRaiting() {
        return raiting;
    }

    public void setRaiting(BigDecimal raiting) {
        this.raiting = raiting;
    }
}
