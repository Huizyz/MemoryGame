package com.example.memorygame.view.memory;

import com.example.memorygame.model.memory.Game;

public class MemoryPresenter {
private Game model;
private MemoryView view;
    public MemoryPresenter(Game model, MemoryView memoryView) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateview();
    }

    private void updateview() {
        //TODO view updaten
    }

    private void addEventHandlers() {
        //TODO eventhandles aanroepen
    }
}
