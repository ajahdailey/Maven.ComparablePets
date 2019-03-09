package io.zipcoder;

abstract public class Pet {
    private String name;
    abstract public String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
