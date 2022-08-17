package com.example.account.model;

public class Account {
    private String zip;
    private String last4CardNumber;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLast4CardNumber() {
        return last4CardNumber;
    }

    public void setLast4CardNumber(String last4CardNumber) {
        this.last4CardNumber = last4CardNumber;
    }

    public String getMonthYearExpiry() {
        return monthYearExpiry;
    }

    public void setMonthYearExpiry(String monthYearExpiry) {
        this.monthYearExpiry = monthYearExpiry;
    }

    private String monthYearExpiry;

}
