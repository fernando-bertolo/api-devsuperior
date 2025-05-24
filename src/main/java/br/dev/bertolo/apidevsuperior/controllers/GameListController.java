package br.dev.bertolo.apidevsuperior.controllers;

import br.dev.bertolo.apidevsuperior.dto.GameListDTO;
import br.dev.bertolo.apidevsuperior.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return this.gameListService.findAll();
    }
}
