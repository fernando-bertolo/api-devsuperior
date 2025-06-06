package br.dev.bertolo.apidevsuperior.controllers;

import br.dev.bertolo.apidevsuperior.dto.GameDTO;
import br.dev.bertolo.apidevsuperior.dto.GameMinDTO;
import br.dev.bertolo.apidevsuperior.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = this.gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(
            @PathVariable Long id
    ) {
        return this.gameService.findById(id);
    }
}
