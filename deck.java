//Matthew Dempsey wrote this
//This prgram is for assignment 4.4a
import java.util.ArrayList;
import java.util.Collections;

public class deck {
    ArrayList<card> Deck= new ArrayList();
    ArrayList<card> Player1= new ArrayList();
    ArrayList<card> Player2= new ArrayList();
    card tempCard;
    public deck(){
    for (int x=2;x<=14;x++){
        tempCard=new card(x, "Diamonds");
        Deck.add(tempCard);
        tempCard=new card(x, "Hearts");
        Deck.add(tempCard);
        tempCard=new card(x, "Spades");
        Deck.add(tempCard);
        tempCard=new card(x, "Clubs");
        Deck.add(tempCard);
        }
    }
    public void shuffle(){
        Collections.shuffle(Deck);
    } 
    public String toString(){
    for (int x=0;x<Deck.size();x++){
    System.out.println(Deck.get(x));
    }
    return "";
}   
public String PlayPlayer1(){
    tempCard=Deck.remove(0);
    Player1.add(0,tempCard);
    return tempCard.toString();
}
    public String PlayPlayer2(){
        Player2.add(0,Deck.remove(0));
        return Player2.get(0).toString();
    }
    public String WhoWon(){
    if(Player1.get(0).getValue()>Player2.get(0).getValue()){
    Player1.add(0,Player2.remove(0));    
    return "Player 1 wins";   
    }
    if(Player1.get(0).getValue()<Player2.get(0).getValue()){   
    Player2.add(0,Player1.remove(0));
    return "Player 2 wins";
    }
    System.out.println("There was a tie. Play more cards.");
    if (Deck.isEmpty()){
    System.out.println("Out of cards."); 
    return "Game over.";   
    }
    System.out.println("Player 1 plays "+PlayPlayer1());
    System.out.println("Player 2 plays "+PlayPlayer2());
     if(Player1.get(0).getValue()>Player2.get(0).getValue()){
    Player1.add(0,Player2.remove(0));
    Player1.add(0,Player2.remove(0));     
    return "Player 1 wins";   
    }
    if(Player1.get(0).getValue()<Player2.get(0).getValue()){   
    Player2.add(0,Player1.remove(0));
    Player2.add(0,Player1.remove(0));
    return "Player 2 wins";
    }
    return "Tie";
    }
    public boolean HasMoreCardsLeft(){
    if (Deck.isEmpty()){
    return false;
    }
    return true;        
}
    public String WhoWonGame(){
    if(Player1.size()>Player2.size()){
    return "Player 1 won the game";
    }        
    if(Player2.size()>Player1.size()){
    return "Player 2 won the game";
    }
    return "Game was a tie";        
}
}