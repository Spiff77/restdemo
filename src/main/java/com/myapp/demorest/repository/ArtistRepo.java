package com.myapp.demorest.repository;

import com.myapp.demorest.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="artists")
public interface ArtistRepo extends JpaRepository<Artist, Integer> {
}
