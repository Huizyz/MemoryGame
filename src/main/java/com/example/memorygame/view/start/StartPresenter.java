package com.example.memorygame.view.start;

import com.example.memorygame.model.memory.Game;
import com.example.memorygame.view.memory.MemoryPresenter;
import com.example.memorygame.view.memory.MemoryView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class StartPresenter {
        private StartView view;
        public StartPresenter(StartView view) {
                this.view = view;
                addEventHandlers();
                updateView();
        }

        private void addEventHandlers() {
                view.getBtnMemory().setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                                MemoryView memoryView = new MemoryView();
                                Game game = new Game();
                                MemoryPresenter memoryPresenter = new MemoryPresenter(game, memoryView);
                                view.getScene().setRoot(memoryView);
                        }
                });
        }

        private void updateView() {
        }
}
