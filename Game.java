public class Game{
  private Player player1;
  private Player player2;
  private Card starterCard;

  public Game(){
    player1 = new Player();
    player2 = new Player();
    starterCard = stock.deal();

  }

  /*public Player play(){
    int winner=0;
    while (stock.size()>=0 || player1.playerHand().size() == 0 || player2.playerHand().size() == 0){
      if (player1.takeTurn() != null){
        player1.takeTurn();
      }
      else if(player1.takeTurn() == null){
        player1.deal();
      }
      else if (player2.takeTurn() != null){
        player2.takeTurn();
      }
      else if(player2.takeTurn() == null){
        player2.deal();
      }
    }
    if (player1.playerHand().size() == 0 || (player1.playerHand().size() > player2.playerHand().size() && stock.size() == 0)){
      winner = 1;
    }
    else if (player2.playerHand().size() == 0 || (player2.playerHand().size() > player1.playerHand().size() && stock.size() == 0)){
      winner = 2;
    }
    else{
      winner = 3;
    }
    return winner;
  }*/

  /*public String toString(){
    return play();
  }*/
  public static void main(String args[]){
    Game game = new Game();
    System.out.println(stock());
  }
}
