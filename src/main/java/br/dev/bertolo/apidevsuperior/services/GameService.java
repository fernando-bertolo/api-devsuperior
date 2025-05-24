package br.dev.bertolo.apidevsuperior.services;

import br.dev.bertolo.apidevsuperior.dto.GameDTO;
import br.dev.bertolo.apidevsuperior.dto.GameMinDTO;
import br.dev.bertolo.apidevsuperior.entities.Game;
import br.dev.bertolo.apidevsuperior.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

//    public GameService(GameRepository gameRepository) {
//      this.gameRepository = gameRepository;
//    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> gameEntity = this.gameRepository.findAll();
        List<GameMinDTO> dto = gameEntity.stream().map(GameMinDTO::new).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game entity = this.gameRepository.findById(id).get();
        return new GameDTO(entity);
    }
}
