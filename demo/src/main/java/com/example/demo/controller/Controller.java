package com.example.demo.controller;

import com.example.demo.genre.Genre;
import com.example.demo.service.genreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private genreService myService;

    @RequestMapping("/genres")
    public List<Genre> getAllGenres() {
    return myService.getAllGenres();
    }
}
