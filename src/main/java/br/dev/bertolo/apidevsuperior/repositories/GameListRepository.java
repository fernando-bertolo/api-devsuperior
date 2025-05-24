package br.dev.bertolo.apidevsuperior.repositories;

import br.dev.bertolo.apidevsuperior.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
