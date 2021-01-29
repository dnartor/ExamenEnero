import Poker.PokerHand;
import Poker.Enums.Result;
import Poker.Enums.Values;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PokerHand_ {

    private PokerHand pokerHand;
    private String cartas = "[KS, 2H, 5C, JD, TD]";
    private PokerHand pokerHandWithPair;
    private PokerHand pokerHandWithThree;
    private PokerHand pokerHandWithPoker;
    private PokerHand pokerHandWithBlackColor;
    private PokerHand pokerHandWithRedColor;


    @Before
    public void init(){
        pokerHand = new PokerHand("KS 2H 5C JD TD");
        pokerHandWithPair = new PokerHand("KS KH 2S 4D TD");
        pokerHandWithThree = new PokerHand("KS KH 2S KD TD");
        pokerHandWithPoker = new PokerHand("KS KH 2S KD KD");
        pokerHandWithBlackColor = new PokerHand("KS KC 1S 1C 2S");
        pokerHandWithRedColor = new PokerHand("KH KD 1H 1D 2H");

    }
    @Test
    public void comprobeConstructor(){
        assertTrue(cartas.equals(pokerHand.toString()));
    }

    @Test
    public void comprobeValue(){
        assertEquals(Values.TWO,pokerHandWithPair.getValue());
        assertEquals(Values.THREE,pokerHandWithThree.getValue());
        assertEquals(Values.POKER,pokerHandWithPoker.getValue());

    }

    @Test
    public void compareWithHands(){
        assertEquals(Result.Win,pokerHandWithThree.compareWith(pokerHandWithPair));
        assertEquals(Result.Tie,pokerHandWithPair.compareWith(pokerHandWithPair));
        assertEquals(Result.Loss,pokerHandWithThree.compareWith(pokerHandWithPoker));
    }

    @Test
    public void comprobeColors(){
        assertTrue(pokerHandWithBlackColor.getSameColor());
        assertTrue(pokerHandWithRedColor.getSameColor());

    }
}
