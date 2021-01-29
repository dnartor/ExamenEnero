package Poker;

import java.util.ArrayList;

public class PokerHand {

    String[] cards;
    public PokerHand(String cards) {
        this.cards=cards.split(" ");
    }

    public String[] getCards() {
        return cards;
    }
}
