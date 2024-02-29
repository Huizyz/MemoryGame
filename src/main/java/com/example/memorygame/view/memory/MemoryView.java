package com.example.memorygame.view.memory;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

public class MemoryView extends BorderPane {
    private Label lblNaam;
    private Label lblHighScore;
    private Button btnExit;
    public MemoryView() {
        initializeNodes();
        layoutNodes();
    }

    private void layoutNodes() {
        //TOP
        Region empty = new Region();
        HBox hbTop = new HBox(lblNaam, empty, lblHighScore);
        empty.setMaxWidth(Double.MAX_VALUE);
        hbTop.setAlignment(Pos.CENTER);
        hbTop.setSpacing(100);
        setTop(hbTop);
    }

    private void initializeNodes() {
        lblNaam = new Label("Naam");
        lblHighScore = new Label("HS");
        btnExit = new Button("exit");
    }
}
