package Poker;

import java.util.ArrayList;

public class PokerHand {

    ArrayList<Card> cards=new ArrayList();

    public PokerHand(String cards) {
        String[] cardsString = cards.split(" ");
        for (String card : cardsString) {
            this.cards.add(new Card(card));
        }
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public String toString(){
        String res="";
        for(Card card:cards){
            res+= card.toString()+" ";
        }
        return cards.toString().trim();
    }

    public boolean compareWith(PokerHand handToCompare){
        return false;
    }
}
