package com.bookmaker_company.all.model;

import java.math.BigDecimal;
import java.util.UUID;

public class CashBox {
    private UUID id;
    private BigDecimal sum;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public void increaseSum(BigDecimal term) {
        this.sum = this.sum.add(term);
    }

    public void decreaseSum(BigDecimal subtrahend) {
        this.sum = this.sum.subtract(subtrahend);
    }
}
