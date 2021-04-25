public class Card{
  private int cardValue;
  private int cardSuit;

  /**
   * Creates default card class
   */
  public Card(){
    cardValue = 0;
    cardSuit = 0;
  }

  /**
   * Creates card class
   * @param cardValue
   * @param cardSuit
   */
  public Card(int cardValue, int cardSuit){
    this.cardValue = cardValue;
    this.cardSuit = cardSuit;
  }

  /**
   * IDRK What this does
   * @param c
   */
  public Card(Card c){
    this.cardValue = c.cardValue;
    this.cardSuit = c.cardSuit;
  }

  public static final int SPADES = 1;
  public static final int HEARTS = 2;
  public static final int CLUBS = 3;
  public static final int DIAMONDS = 4;

  public int getCardValue() {
    return cardValue;
  }
  public int getCardSuit() {
    return cardSuit;
  }

  public void setCardValue(int cardValue) {
    this.cardValue = cardValue;
  }
  public void setCardSuit(int cardSuit) {
    this.cardSuit = cardSuit;
  }

  public String toString(){
    String cValue = "";
    String cSuit = "";
    if (cardSuit == 1){
      cSuit = "Spades";
    }
    else if (cardSuit == 2){
      cSuit = "Hearts";
    }
    else if (cardSuit == 3){
      cSuit = "Clubs";
    }
    else if (cardSuit == 4){
      cSuit = "Diamonds";
    }

    if (cardValue == 1){
      cValue = "Ace";
    }
    else if (cardValue == 11){
      cValue = "Jack";
    }
    else if (cardValue == 12){
      cValue = "Queen";
    }
    else if (cardValue == 13){
      cValue = "King";
    }
    else{
      cValue = String.valueOf(cardValue);
    }
    return (cValue + " of " + cSuit);
  }

}
