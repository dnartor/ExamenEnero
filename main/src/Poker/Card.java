package Poker;

import Poker.Enums.Numbers;

public class Card {

    private String numValue;
    private String figure;
    private Numbers number;
    public Card(String card){
        numValue=Character.toString(card.charAt(0));
        figure=Character.toString(card.charAt(1));
        setNumber();
    }

    private void setNumber() {
        if ("1".equals(numValue)) {
            number=Numbers.ACE;
        }else if("2".equals(numValue)){
            number=Numbers.TWO;
        }else if("3".equals(numValue)){
            number=Numbers.THREE;
        }else if("4".equals(numValue)){
            number=Numbers.FOUR;
        }else if("5".equals(numValue)){
            number=Numbers.FIVE;
        }else if("6".equals(numValue)){
            number=Numbers.SIX;
        }else if("7".equals(numValue)){
            number=Numbers.SEVEN;
        }else if("8".equals(numValue)){
            number=Numbers.EIGTH;
        }else if("9".equals(numValue)){
            number=Numbers.NINE;
        }else if("10".equals(numValue)){
            number=Numbers.TEN;
        }else if("J".equals(numValue)){
            number=Numbers.JOKER;
        }else if("Q".equals(numValue)){
            number=Numbers.QUEEN;
        }else if("K".equals(numValue)) {
            number = Numbers.KING;
        }
    }

    public String getNumValue() {
        return numValue;
    }

    public String getFigure() {
        return figure;
    }
    public String toString(){
        return numValue+figure;
    }

    public boolean equalsValue(Card cardEqual){
        if(cardEqual.getNumValue().equals(numValue)) return true;
        return false;
    }
}
