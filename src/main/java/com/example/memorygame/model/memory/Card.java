package com.example.memorygame.model.memory;

import javafx.scene.image.Image;

public class Card {
    private Image image;
    private int value;

    public Card(int value) {
//        this.image = Cards.getImageIndex(value);
        this.value = value;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
