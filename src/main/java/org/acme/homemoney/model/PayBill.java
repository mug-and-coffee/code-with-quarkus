package org.acme.homemoney.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayBill {

    private Long id;
    private final List<FullEntry> entries = new ArrayList<>();
    private String shop;
    private LocalDate date;
    private PayedBy payedBy;
    private Double price;

    public PayBill(Long id, List<FullEntry> entries, String shop, LocalDate date, PayedBy payedBy, Double price) {
        this.id = id;
        this.entries.addAll(entries);
        this.shop = shop;
        this.date = date;
        this.payedBy = payedBy;
        this.price = price;
    }

    public PayBill() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FullEntry> getEntries() {
        return entries;
    }

    public void addEntries(List<FullEntry> entries) {
        this.entries.addAll(entries);
    }

    public void removeEntries(List<FullEntry> entries) {
        this.entries.removeAll(entries);
    }

    public void addEntry(FullEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(FullEntry entry) {
        this.entries.remove(entry);
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public PayedBy getPayedBy() {
        return payedBy;
    }

    public void setPayedBy(PayedBy payedBy) {
        this.payedBy = payedBy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
