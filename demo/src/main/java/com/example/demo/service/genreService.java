package com.example.demo.service;

import com.example.demo.genre.Genre;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class genreService {

    public List<Genre> getAllGenres() {
        return Arrays.asList(
                new Genre("Techno", 10),
                new Genre("Country", 4),
                new Genre("Classical", 2),
                new Genre("Dance", 6),
                new Genre("Rock", 8));

    }
}
