package com.workintech.s17d1.entity;

import java.util.Objects;

public class Animal {

    private int id;
    private String animalName;

    public Animal() {
    }

    public Animal(int id, String animalName) {
        this.id = id;
        this.animalName = animalName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, animalName);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
