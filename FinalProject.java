//Matthew Dempsey wrote this
//This prgram is for assignment 4.4a
public class FinalProject {
    public static void main(String[] args) {
        deck gameDeck=new deck();
        //gameDeck.toString();
        gameDeck.shuffle();
        //gameDeck.toString();
        while (gameDeck.HasMoreCardsLeft()){
        System.out.println("Player 1 plays "+gameDeck.PlayPlayer1());
         System.out.println("Player 2 plays "+gameDeck.PlayPlayer2());
         System.out.println(gameDeck.WhoWon());
        }
        System.out.println(gameDeck.WhoWonGame());
    }
}
