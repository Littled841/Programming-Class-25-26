public class CardGame extends game {
     //Matthew Dempsey wrote this
     //This prgram is for assignment 3.2
    int AmountOfCards=6;
    public CardGame(String title) {
        super(title, "Board game");
}

 public void NewHighScore(int NewHighScore, String name) {
    System.out.println("Can't print high score on a board game");
 }
 public void PrintHighScore(){
    System.out.println("Can't print high score on a board game");
 }
 public void ShuffleCards(){
    System.out.println("Deck is shuffled");
}
public void PlayCard(){
    AmountOfCards--;
    System.out.println("We have "+AmountOfCards+" left to play");
    }
    }