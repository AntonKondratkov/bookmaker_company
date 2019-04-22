package com.bookmaker_company.all.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Contact {
    private UUID id;
    private String userName;
    private String position;
    private String internalPhone;
    private String mobilePhone;
    private String email;

    public UUID getId(){
        return getId();
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInternalPhone() {
        return internalPhone;
    }

    public void setInternalPhone(String internalPhone) {
        this.internalPhone = internalPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String teamId) {
        this.email = email;
    }
}
