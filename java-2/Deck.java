import java.util.ArrayList;
import javax.smartcardio.Card;

public class Deck {

    private ArrayList<MCard> cards;
    
    public Deck() {
        this.cards = new ArrayList<MCard>();
    }
    
    public void createFullDeck() {
        for(Suit cardSuit : Suit.values()) {
            for(Value cardValue : Value.values()) {
                //System.out.println(cardValue);
                //System.out.println(" ");
                //System.out.println(cardSuit);
                //MCard tmpCard = new MCard(cardSuit,cardValue);
                this.cards.add(new MCard(cardSuit,cardValue));
            }
        }
    }

    public String toString() {
        String cardListOutput = "";
        int i = 0;
        for(MCard aCard : this.cards) {
            cardListOutput += "\n" + i + "-" + aCard.toString();
            i++;
        }
        return cardListOutput;
    }

} // end class Deck
