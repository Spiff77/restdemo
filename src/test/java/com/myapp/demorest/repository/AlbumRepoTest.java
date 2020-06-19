package com.myapp.demorest.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myapp.demorest.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class AlbumRepoTest {

    @Autowired
    ArtistRepo artistRepo;

    @Autowired
    MockMvc mockMvc;

    @Test
    void findByNameContaining() throws Exception {
        ObjectMapper mapper = new ObjectMapper();  Album myProduct = new Album();
        String myJSON = mapper.writeValueAsString(myProduct);

        this.mockMvc.perform(
                post("/albums")
                .content(myJSON)
                .contentType(MediaType.APPLICATION_JSON)
        )
        .andExpect(status().isCreated());


    }
}
