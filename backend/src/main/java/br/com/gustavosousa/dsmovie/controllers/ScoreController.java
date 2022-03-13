package br.com.gustavosousa.dsmovie.controllers;

import br.com.gustavosousa.dsmovie.dto.MovieDTO;
import br.com.gustavosousa.dsmovie.dto.ScoreDTO;
import br.com.gustavosousa.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    // P/ salvar de forma idempotente, não usamos POST e sim PUT
    // isto é, se salvar + de 1 vez a mesma coisa não vai mudar o que foi salvo
    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }



}
