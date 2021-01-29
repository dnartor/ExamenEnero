package Poker;

import java.util.ArrayList;

public class PokerHand {

    ArrayList<Card> cards=new ArrayList();
    Values value;

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
        setValue(sameNumber);


    }

    private void setValue(int sameNumber) {
        switch(sameNumber){
            case 1:
                value=Values.ONE;
                break;
            case 2:
                value=Values.TWO;
                break;
            case 3:
                value=Values.THREE;
                break;
            case 4:
                value=Values.POKER;
        }
    }

    public Values getValue() {
        return value;
    }

    public boolean compareWith(PokerHand handToCompare){
        return false;
    }
}
