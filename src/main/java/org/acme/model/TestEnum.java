package org.acme.model;

public enum TestEnum {
    ONE("eins"), TWO("zwei"), THREE("drei");
    private String germanValue;

    TestEnum(String germanValue) {
        this.germanValue = germanValue;
    }

    public String getGermanValue() {
        return germanValue;
    }
}
