package org.acme.homemoney.model;

import java.time.LocalDate;

public class QuickEntry {

    private Double price;
    private String recipient;
    private String subject;
    private LocalDate date;

    public QuickEntry(Double price, String location, String subject, LocalDate date) {
        this.price = price;
        this.recipient = location;
        this.subject = subject;
        this.date = date;
    }

    public QuickEntry() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "QuickEntry{" +
                "price=" + price +
                ", location='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                '}';
    }
}
