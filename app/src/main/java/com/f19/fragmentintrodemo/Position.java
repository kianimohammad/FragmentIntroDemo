package com.f19.fragmentintrodemo;

public class Position {

    private String title;
    private String description;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static final Position[] positions = {
            new Position("ios developer", "developing ios applications"),
            new Position("java developer", "developing java se & ee applications"),
            new Position("android developer", "developing android applications"),
            new Position("firmware designer", "designing firmware for iot systems"),
            new Position("Hotel Manager", "managing hotel")
    };
}
