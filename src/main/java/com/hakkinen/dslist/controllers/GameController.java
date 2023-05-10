package com.hakkinen.dslist.controllers;

import com.hakkinen.dslist.dto.GameDTO;
import com.hakkinen.dslist.dto.GameMinDTO;
import com.hakkinen.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO dto = gameService.findById(id);
        return dto;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> games = gameService.findAll();
        return games;
    }
}
