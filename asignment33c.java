//Matthew Dempsey wrote this
//This is for asignment 3.3
import java.util.ArrayList;
import java.util.Collections;

public class asignment33c {
    

 public static void main(String[] args) {
    ArrayList<game> gameList=new ArrayList<game>();
     game game1=new game("Minecraft","Computer game");
     Boardgame game2=new Boardgame ("Game of life");
     CardGame game3=new CardGame ("Exploding Kittens");
     game game4=new game("Forza Horizon 4", "Computer game");
     Boardgame game5= new Boardgame("Trouble");
     CardGame game6= new CardGame("Uno");
    gameList.add(game1);
    gameList.add(game2);
    gameList.add(game3);
    gameList.add(game4);
    gameList.add(game5);
    gameList.add(game6);
    System.out.println(game1);
    System.out.println(game2);
    System.out.println(game3);
    System.out.println(gameList);
     game1.NewHighScore(200000,"Matt");
      game2.NewHighScore(200000,"Matt");
    game3.PlayCard();
    game3.PlayCard();
    Collections.sort(gameList);
    System.out.println(gameList);
    }
    }