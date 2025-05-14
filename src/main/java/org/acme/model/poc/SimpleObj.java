package org.acme.model.poc;

public class SimpleObj {

    private String value;
    private int id;

    public SimpleObj(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public SimpleObj() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
