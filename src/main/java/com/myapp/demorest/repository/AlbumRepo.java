package com.myapp.demorest.repository;

import com.myapp.demorest.model.Album;
import com.myapp.demorest.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path="albums")
public interface AlbumRepo extends JpaRepository<Album, Integer> {

    @RestResource(path = "nameContains")
    public Page<Album> findByNameContaining(@Param("name") String name, Pageable p);
}
