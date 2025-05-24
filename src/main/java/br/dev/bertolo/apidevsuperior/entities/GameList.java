package br.dev.bertolo.apidevsuperior.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GameList() {}

    public GameList(Long id, String name) {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
