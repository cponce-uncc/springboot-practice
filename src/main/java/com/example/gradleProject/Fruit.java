package com.example.gradleProject;

public class Fruit {
    private String color;
    private int id;
    private String name;

    public Fruit(String color, int id, String name) {
        this.color = color;
        this.id = id;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
