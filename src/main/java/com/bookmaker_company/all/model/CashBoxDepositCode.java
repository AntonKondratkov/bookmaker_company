package com.bookmaker_company.all.model;

import java.math.BigDecimal;
import java.util.UUID;

public class CashBoxDepositCode {
    private BigDecimal delta;
    private UUID id;
    private UUID cashBoxId;
    private String code;

    public BigDecimal getDelta() {
        return delta;
    }

    public void setDelta(BigDecimal delta) {
        this.delta = delta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCashBoxId() {
        return cashBoxId;
    }

    public void setCashBoxId(UUID cashBoxId) {
        this.cashBoxId = cashBoxId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
