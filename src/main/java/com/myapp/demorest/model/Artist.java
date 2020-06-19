package com.myapp.demorest.model;


import com.fasterxml.jackson.annotation.JsonView;
import com.myapp.demorest.config.JsonPropertyView;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(JsonPropertyView.Basic.class)
    public int id;

    @JsonView(JsonPropertyView.Basic.class)
    public String firstname;

    @JsonView(JsonPropertyView.Basic.class)
    public String lastname;

    @JsonView(JsonPropertyView.Album.class)
    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Album> albums = new ArrayList<>();


    public Artist() {
    }

    public Artist(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        if (albums != null)
            this.albums = albums;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
