package com.example.memorygame;

import com.example.memorygame.view.start.StartPresenter;
import com.example.memorygame.view.start.StartView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    private final int STAGE_WIDTH = 800;
    private final int STAGE_HEIGHT = 600;
    @Override
    public void start(Stage stage) throws Exception {
        StartView startView = new StartView();
        StartPresenter startPresenter = new StartPresenter(startView);
        Scene scene = new Scene(startView);
        stage.setScene(scene);
        stage.setTitle("Memory Game");
        stage.setWidth(STAGE_WIDTH);
        stage.setHeight(STAGE_HEIGHT);
        stage.setMinWidth(STAGE_WIDTH);
        stage.setMinHeight(STAGE_HEIGHT);
        stage.show();
    }
}
