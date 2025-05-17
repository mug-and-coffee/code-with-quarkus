package org.acme.homemoney.model;

import java.time.LocalDate;

public class FullEntry {

    private Long id;
    private Long shoppingId;
    private String subject;
    private String cathegory;
    private String subCathegory;
    private Integer amount;
    private Double price;
    private Double fullPrice;
    private String unit;
    private String quantity;

    public FullEntry(Long id, Long shoppingId, String subject,
                     String cathegory, String subCathegory,
                     Integer amount, Double price, Double fullPrice,
                     String unit, String quantity) {
        this.id = id;
        this.shoppingId = shoppingId;
        this.subject = subject;
        this.cathegory = cathegory;
        this.subCathegory = subCathegory;
        this.amount = amount;
        this.price = price;
        this.fullPrice = fullPrice;
        this.unit = unit;
        this.quantity = quantity;
    }

    public FullEntry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public String getSubCathegory() {
        return subCathegory;
    }

    public void setSubCathegory(String subCathegory) {
        this.subCathegory = subCathegory;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "FullEntry{" +
                "id=" + id +
                ", shoppingId=" + shoppingId +
                ", subject='" + subject + '\'' +
                ", cathegory='" + cathegory + '\'' +
                ", subCathegory='" + subCathegory + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", fullPrice=" + fullPrice +
                ", unit='" + unit + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
