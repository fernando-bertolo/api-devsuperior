package br.dev.bertolo.apidevsuperior.repositories;

import br.dev.bertolo.apidevsuperior.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
