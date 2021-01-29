package Poker;

public class Card {

    private String numValue;
    private String figure;
    public Card(String card){
        numValue=Character.toString(card.charAt(0));
        figure=Character.toString(card.charAt(1));
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
