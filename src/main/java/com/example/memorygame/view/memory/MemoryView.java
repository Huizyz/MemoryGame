package com.example.memorygame.view.memory;

import com.example.memorygame.model.memory.Board;
import com.example.memorygame.model.memory.Cards;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.ArrayList;
import java.util.List;

public class MemoryView extends BorderPane {
    private Label lblNaam;
    private Label lblHighScore;
    private Button btnStart;
    private Button btnExit;
    private List<Button> btnsCards = new ArrayList<>();
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

        //CENTER
        GridPane gpCenter = new GridPane();
        for (int i = 0; i < btnsCards.size(); i++) {
            btnsCards.get(i).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            gpCenter.add(btnsCards.get(i), i, 0);
            //GridPane.setVgrow(btnsCards.get(i), Priority.ALWAYS);
            //GridPane.setHgrow(btnsCards.get(i), Priority.ALWAYS);
        }
        setCenter(gpCenter);
        BorderPane.setMargin(gpCenter, new Insets(10,10,0,10));
        gpCenter.setVgap(10);
        gpCenter.setHgap(10);
        gpCenter.setAlignment(Pos.CENTER);

        //BOTTOM
        setBottom(btnStart);
        btnStart.setAlignment(Pos.CENTER);
    }

    private void initializeNodes() {
        lblNaam = new Label("Naam");
        lblHighScore = new Label("HS");
        btnStart = new Button("Start");
        btnExit = new Button("exit");

        Board board = new Board();
        for (int i = 0; i < board.getCards().size(); i++) {
            Image img;
            switch (i+1) {
                case 1, 2:
                    img = new Image("A.png");
                    break;
                case 3,4:
                    img = new Image("B.png");
                    break;
                case 5,6:
                    img = new Image("C.png");
                    break;
                case 7,8:
                    img = new Image("D.png");
                    break;
                case 9,10:
                    img = new Image("E.png");
                    break;
                default:
                    img = new Image("0.png");
            }
            Button btn = new Button();
            btn.setGraphic(new ImageView(img));
            btnsCards.add(btn);
        }
    }

    public List<Button> getBtnsCards() {
        return btnsCards;
    }

    public Button getBtnStart() {
        return this.btnStart;
    }
}
