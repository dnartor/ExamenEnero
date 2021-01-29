import Poker.PokerHand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PokerHand_ {

    PokerHand pokerHand;
    @Before
    public void init(){
        pokerHand = new PokerHand("KS 2H 5C JD TD");
    }
    @Test
    public void comprobeConstructor(){
        String cartas = "KS 2H 5C JD TD";
        String cartaspokerHand="";
        for(String carta : pokerHand.getCards()) {
            cartaspokerHand += carta + " ";
        }
        assertTrue(cartas.equals(cartaspokerHand.trim()));
    }
}
