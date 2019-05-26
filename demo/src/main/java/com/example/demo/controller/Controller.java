package com.example.demo.controller;

import com.example.demo.genre.Genre;
import com.example.demo.service.genreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private genreService myService;

    @RequestMapping("/genres")
    public List<Genre> getAllGenres() {
        return myService.getAllGenres();
    }

    @RequestMapping("/genres/{type}")
    public Genre getGenre(@PathVariable String type) {
        return myService.getGenre(type);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/genres")
    public void addGenre(@RequestBody Genre genre){
        myService.addGenre(genre);
    }


}
