import Poker.Card;
import Poker.PokerHand;
import Poker.Result;
import Poker.Values;
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


    @Before
    public void init(){
        pokerHand = new PokerHand("KS 2H 5C JD TD");
        pokerHandWithPair = new PokerHand("KS KH 2S 4D TD");
        pokerHandWithThree = new PokerHand("KS KH 2S KD TD");
        pokerHandWithPoker = new PokerHand("KS KH 2S KD KD");

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
}
