package com.myapp.demorest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import com.myapp.demorest.config.JsonPropertyView;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(JsonPropertyView.Basic.class)
    public int id;

    @JsonView(JsonPropertyView.Basic.class)
    public String name;

    @JsonView(JsonPropertyView.Basic.class)
    public int year;


    @JsonView(JsonPropertyView.Artist.class)
    @ManyToOne(fetch = FetchType.EAGER)
    public Artist artist;

    public Album() {
    }

    public Album(String name, int year) {
        this.name = name;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
