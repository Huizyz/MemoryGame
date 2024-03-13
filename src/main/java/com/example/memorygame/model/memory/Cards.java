package com.example.memorygame.model.memory;

import javafx.scene.image.Image;

public enum Cards {
    A(new Image("C:\\Users\\rayan\\IdeaProjects\\MemoryGameOffline\\MemoryGame-master\\src\\main\\resources\\images\\A.png")),
    B(new Image("C:\\Users\\rayan\\IdeaProjects\\MemoryGameOffline\\MemoryGame-master\\src\\main\\resources\\images\\B.png")),
    C(new Image("C:\\Users\\rayan\\IdeaProjects\\MemoryGameOffline\\MemoryGame-master\\src\\main\\resources\\images\\C.png")),
    D(new Image("C:\\Users\\rayan\\IdeaProjects\\MemoryGameOffline\\MemoryGame-master\\src\\main\\resources\\images\\D.png")),
    E(new Image("C:\\Users\\rayan\\IdeaProjects\\MemoryGameOffline\\MemoryGame-master\\src\\main\\resources\\images\\E.png")),
    F(new Image("images/F")),
    G(new Image("images/G")),
    H(new Image("images/H")),
    I(new Image("images/J")),
    J(new Image("images/J")),
    K(new Image("images/K")),
    L(new Image("images/L")),
    M(new Image("images/M")),
    N(new Image("images/N")),
    O(new Image("images/O")),
    P(new Image("images/P")),
    Q(new Image("images/Q")),
    R(new Image("images/R")),
    S(new Image("images/S")),
    T(new Image("images/T")),
    U(new Image("images/U")),
    V(new Image("images/V")),
    W(new Image("images/W")),
    X(new Image("images/X")),
    Y(new Image("images/Y")),
    Z(new Image("images/Z"));

    private final Image image;

    Cards(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public static Image getImageByIndex(int index) {
        if (index >= 0 && index < Cards.values().length) {
            return Cards.values()[index].getImage();
        }
        throw new IllegalArgumentException("Invalid index");
    }
    public static Cards getEnumByIndex(int index) {
        if (index >= 0 && index < Cards.values().length) {
            return Cards.values()[index];
        }
        throw new IllegalArgumentException("Invalid index");
    }
}
