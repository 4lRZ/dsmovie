package com.treinamento.dsmovie.controllers;

import com.treinamento.dsmovie.dto.MovieDTO;
import com.treinamento.dsmovie.dto.ScoreDTO;
import com.treinamento.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

}
