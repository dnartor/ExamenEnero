import Poker.Card;
import Poker.PokerHand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PokerHand_ {

    PokerHand pokerHand;
    String cartas = "[KS, 2H, 5C, JD, TD]";
    @Before
    public void init(){
        pokerHand = new PokerHand("KS 2H 5C JD TD");
    }
    @Test
    public void comprobeConstructor(){
        assertTrue(cartas.equals(pokerHand.toString()));
    }


}
