package com.example.memorygame.model.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private int difficulty;
    private List<Card> cards = new ArrayList<>();

    public Board() {
        this.difficulty = 1;
        generateCards(this.getDifficulty()*3+1);
        // 0 = 2 pairs, 1 = 4, 2 = 7, 3 = 10, ...
        printCards();
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    public boolean sameCard(Card card1, Card card2) {
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


    public void printCards() {
        for (int i = 0; i < this.getCards().size(); i++) {
            System.out.print(this.getCards().get(i).getValue()+" ");
        }
    }


}
