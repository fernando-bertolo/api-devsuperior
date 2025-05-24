package br.dev.bertolo.apidevsuperior.controllers;

import br.dev.bertolo.apidevsuperior.dto.GameListDTO;
import br.dev.bertolo.apidevsuperior.dto.GameMinDTO;
import br.dev.bertolo.apidevsuperior.services.GameListService;
import br.dev.bertolo.apidevsuperior.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameListDTO> findAll() {
        return this.gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findAll(
            @PathVariable Long listId
    ) {
        return this.gameService.findByList(listId);
    }
}
