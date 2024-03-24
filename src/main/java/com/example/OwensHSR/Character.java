package com.example.OwensHSR;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Character {

    @Id
    private String name;
    private String path;
    private Integer rarity;
    private String element;
    private String faction;

    public Character(){}

    public Character(String name, String path, Integer rarity, String element, String faction) {
        this.name = name;
        this.path = path;
        this.rarity = rarity;
        this.element = element;
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", rarity=" + rarity +
                ", element='" + element + '\'' +
                ", faction='" + faction + '\'' +
                '}';
    }
}
