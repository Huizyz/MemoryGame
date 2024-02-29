package com.example.memorygame.model.memory;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int difficulty = 1;
    private List<Card> cards = new ArrayList<>();

    public Board() {
        generateCards(this.getDifficulty()*3+1);
        // 0 = 2 pairs, 1 = 4, 2 = 7, 3 = 10, ...
    }

    public static boolean sameCard(Card card1, Card card2) {
        return card1.getValue()==card2.getValue();
    }
    private void generateCards(int pairs) {
        for (int i = 0; i < pairs; i++) {
            Card card = new Card(i);
            cards.add(card);
            cards.add(card);
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public static void main(String[] args) {
        Board board = new Board();
        for (int i = 0; i < board.getCards().size(); i++) {
            System.out.print("kaart "+i+": ");
            System.out.println(board.getCards().get(i).getValue());
        }
        System.out.println(sameCard(board.getCards().get(0), board.getCards().get(1)));
    }
}
