package org.acme.model.poc;


import java.time.LocalDate;

public class TestObject {
    private Long id;
    private Integer nr;
    private String name;
    private LocalDate birthDate;
    private TestEnum testEnum;
    private Boolean isReal;
    private Double price;
    private Float fullPrice;

    public TestObject() {
    }

    public TestObject(Long id, Integer nr, String name, LocalDate birthDate, TestEnum testEnum, Boolean isReal, Double price, Float fullPrice) {
        this.id = id;
        this.nr = nr;
        this.name = name;
        this.birthDate = birthDate;
        this.testEnum = testEnum;
        this.isReal = isReal;
        this.price = price;
        this.fullPrice = fullPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public TestEnum getTestEnum() {
        return testEnum;
    }

    public void setTestEnum(TestEnum testEnum) {
        this.testEnum = testEnum;
    }

    public Boolean getReal() {
        return isReal;
    }

    public void setReal(Boolean real) {
        isReal = real;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Float getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Float fullPrice) {
        this.fullPrice = fullPrice;
    }
}
