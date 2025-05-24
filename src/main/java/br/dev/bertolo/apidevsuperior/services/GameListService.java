package br.dev.bertolo.apidevsuperior.services;

import br.dev.bertolo.apidevsuperior.dto.GameListDTO;
import br.dev.bertolo.apidevsuperior.entities.GameList;
import br.dev.bertolo.apidevsuperior.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = this.gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
