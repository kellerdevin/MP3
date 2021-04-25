import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Player{
  private LinkedList<Card> playerHand = new LinkedList<Card>();
  
  private Card playedCard;
  private Card discardCard;
  private static Deck stock;
  private int discardSuit;

  Random rand = new Random();

  public Player(){
    stock = new Deck();
    for (int k=0; k<5; ++k){
      playerHand.add(stock.deal());
    }
    playedCard = new Card(0,0);
    discardSuit = 0;
    discardCard = stock.deal();
  }
//rand.nextInt(52 + 1);
  public Deck takeTurn(){
    int chance = rand.nextInt(52 + 1);   //WHY 1-10
    if (chance == 1){
      this.newSuit();
      playerHand.remove();
      playerHand.add(stock.deal());
    }
    else if (chance != 1){
      for (int i=0; i<playerHand.size(); i++){
        if (playerHand.get(i).getCardSuit() == discardCard.getCardSuit()){
          discardCard = playedCard;
          playerHand.remove();
          playerHand.add(stock.deal());
        }
        else if (playerHand.get(i).getCardValue() == discardCard.getCardValue()){
          discardCard = playedCard;
          playerHand.remove();
          playerHand.add(stock.deal());
        }
      }
      for (int j=0; j<playerHand.size(); j++){
        if(playerHand.get(j).getCardValue() == 8){
          this.newSuit();
          playerHand.remove();
          playerHand.add(stock.deal());
        }
      }
    }
    else{
      return null;
    }
    return stock;
  }

  public Card newSuit(){
    int i = ThreadLocalRandom.current().nextInt(1, 4 + 1);
    discardCard = new Card(8,i);
    return discardCard;
  }

  
  //THIS IS BROKEN
  public String toString(){
    return playerHand.toString();
  }

  public static void main(String args[]){
    Player player1 = new Player();
    System.out.println(player1.playerHand);
    System.out.println();
    System.out.println();
    System.out.println(stock);

  }
}
