package com.daw.Pokedex.model;

public class Ability {
    private String name;
    private String url;
    // Getters and setters

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Ability(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
