package com.example.memorygame.view.start;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class StartView extends BorderPane {

    private Label lblTitle;
    private Button btnMemory;
    private Button btnSimon;
    private TextField txtLogin;
    private Label lblLogin;


    
    public StartView() {
        initializeNodes();
        layoutNodes();
    }

    private void layoutNodes() {
        //TOP
        VBox vbLogin = new VBox(txtLogin, lblLogin);
        vbLogin.setAlignment(Pos.TOP_RIGHT);
        setTop(vbLogin);
        txtLogin.setMaxWidth(50);

        //CENTER
        Region hbRegion = new Region();
        HBox hbBtns = new HBox(btnMemory, hbRegion, btnSimon);
        hbBtns.setAlignment(Pos.CENTER);
        hbRegion.setPrefSize(100, 100);
        Region vbRegion = new Region();
        VBox vbCenter = new VBox(lblTitle, vbRegion, hbBtns);
        vbRegion.setPrefSize(150, 150);
        vbCenter.setAlignment(Pos.CENTER);
        setCenter(vbCenter);


    }

    private void initializeNodes() {
        lblTitle = new Label("Memory Game");
        btnMemory = new Button("Memory");
        btnSimon = new Button("Simon");
        txtLogin = new TextField("Naam");
        lblLogin =new Label("Als je je naam niet invuld zal je highscore niet bijgehouden worden");
    }

    public Button getBtnMemory() {
        return btnMemory;
    }

    public Button getBtnSimon() {
        return btnSimon;
    }

    public TextField getTxtLogin() {
        return txtLogin;
    }
}
