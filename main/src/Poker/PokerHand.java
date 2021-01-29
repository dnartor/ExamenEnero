package Poker;

import java.util.ArrayList;

public class PokerHand {

    ArrayList<Card> cards=new ArrayList();
    int value=1;

    public PokerHand(String cards) {
        String[] cardsString = cards.split(" ");
        for (String card : cardsString) {
            this.cards.add(new Card(card));
        }
        selfCombination();
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

    public void selfCombination(){
        int sameNumber=1;
        for(int i = 0; i< cards.size();i++){
            for(int j = i+1;j<cards.size();j++){
                if(cards.get(i).getNumValue().equals(cards.get(j).getNumValue())){
                    sameNumber++;
                    break;
                }
            }
        }
        value=sameNumber;
    }

    public int getValue() {
        return value;
    }

    public boolean compareWith(PokerHand handToCompare){
        return false;
    }
}
