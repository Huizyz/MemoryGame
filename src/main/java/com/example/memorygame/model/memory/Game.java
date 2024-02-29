package com.example.memorygame.model.memory;

import com.example.memorygame.model.Player;

public class Game {
    private Player player;
    private int difficulty;
    private Board board;
    public Game () {
        board = new Board();
        player = new Player();
    }

}
