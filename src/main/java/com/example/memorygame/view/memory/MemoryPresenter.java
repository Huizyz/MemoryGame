package com.example.memorygame.view.memory;

import com.example.memorygame.model.memory.Board;
import com.example.memorygame.model.memory.Game;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MemoryPresenter {
private Game model;
private MemoryView view;
    public MemoryPresenter(Game model, MemoryView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        //updateview();
    }

    private void updateview() {
        List<Button> btnsCards = view.getBtnsCards();
        for (int i = 0; i < model.getBoard().getCards().size(); i++) {
            btnsCards.get(i).setGraphic(new ImageView(new Image("0.png")));
        }
    }

    private void addEventHandlers() {
        //START
        view.getBtnStart().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                model.getBoard().shuffle();
                updateview();
            }
        });
    }
}
