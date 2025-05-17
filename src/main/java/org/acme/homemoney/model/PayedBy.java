package org.acme.homemoney.model;

public enum PayedBy {
    LENA("Lena"), ALEX("Alex");
    private String name;

    PayedBy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
