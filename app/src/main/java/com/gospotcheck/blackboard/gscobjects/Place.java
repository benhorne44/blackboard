package com.gospotcheck.blackboard.gscobjects;

public class Place {

    private String name;
    private int distance;


    public String getName() {
        return name;
    }

    public Place setName(String name) {
        this.name = name;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public Place setDistance(int distance) {
        this.distance = distance;
        return this;
    }
}
