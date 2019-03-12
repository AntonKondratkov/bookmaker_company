package com.bookmaker_company.all.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Match {
    private UUID id;
    private MatchState matchState;
    private UUID competitionId;
    private Date date;
    private Map<UUID, Integer> competitorsAndScores;
    private Map<UUID, BigDecimal> actualCoefficients;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public MatchState getMatchState() {
        return matchState;
    }

    public void setMatchState(MatchState matchState) {
        this.matchState = matchState;
    }

    public UUID getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(UUID competitionId) {
        this.competitionId = competitionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<UUID, BigDecimal> getActualCoefficients() {
        return actualCoefficients;
    }

    public void setActualCoefficients(Map<UUID, BigDecimal> actualCoefficients) {
        this.actualCoefficients = actualCoefficients;
    }

    public Map<UUID, Integer> getCompetitorsAndScores() {
        return competitorsAndScores;
    }

    public void setCompetitorsAndScores(Map<UUID, Integer> competitorsAndScores) {
        this.competitorsAndScores = competitorsAndScores;
    }

    public Match() {
        matchState = MatchState.On_Hold;
        competitorsAndScores = new HashMap<>(2);
        actualCoefficients = new HashMap<>(2);
    }

}
