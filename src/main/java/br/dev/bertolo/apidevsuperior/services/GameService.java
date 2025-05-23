package br.dev.bertolo.apidevsuperior.services;

import br.dev.bertolo.apidevsuperior.dto.GameMinDTO;
import br.dev.bertolo.apidevsuperior.entities.Game;
import br.dev.bertolo.apidevsuperior.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

//    public GameService(GameRepository gameRepository) {
//      this.gameRepository = gameRepository;
//    }

    public List<GameMinDTO> findAll() {
        List<Game> gameEntity = this.gameRepository.findAll();
        List<GameMinDTO> dto = gameEntity.stream().map(GameMinDTO::new).toList();
        return dto;
    }
}
