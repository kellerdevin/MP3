import java.util.LinkedList;
import java.util.Random;

public class Deck{
  private LinkedList<Card> deckCards = new LinkedList<Card>();
  private int numCards;

  Random randomNum = new Random();

  public Deck(){
    for (int i=Card.SPADES; i<=Card.DIAMONDS; i++){
      for (int j=1; j<=13; j++){
        deckCards.add(new Card(j,i));
      }
    }
    numCards = 52;
  }

  public Card deal(){
    Card card = deckCards.get(randomNum.nextInt(numCards));
    deckCards.remove(card);
    numCards = numCards - 1;
    return card;
  }

  public String toString(){
    String cardString = "";
    for (int i=0; i<numCards; i++){
      cardString += deckCards.get(i).toString() + "\n";
    }
    return cardString;
  }


}
