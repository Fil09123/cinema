package com.intellecta.cinema;

import java.util.ArrayList;

public class Viewer {
    private String name;
    private int age;
    private int count;
    private ArrayList<Cinema> films;

    public Viewer(String name, int age, ArrayList<Cinema> films){
        this.name = name;
        this.age = age;
        this.count = films.size();
        this.films = films;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Cinema> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Cinema> films) {
        this.films = films;
        count = films.size();
    }
}
