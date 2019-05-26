package com.example.demo.service;

import com.example.demo.genre.Genre;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class genreService {

    private List<Genre> genres = new  ArrayList<> (Arrays.asList(
            new Genre("Techno", 10),
            new Genre("Country", 4),
            new Genre("Classical", 2),
            new Genre("Dance", 6),
            new Genre("Rock", 8),
            new Genre("Jazz", 6),
            new Genre("Pop", 8),
            new Genre("Hip Hop", 9)));


    public List<Genre> getAllGenres() {
        return genres;
    }

    public Genre getGenre(String type) {
        return genres.stream().filter(t -> t.getType().equalsIgnoreCase(type)).findFirst().get();
    }

    public void addGenre(Genre genre){
        genres.add(genre);
    }


}
