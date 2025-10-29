//Matthew Dempsey wrote this
//This program is for 3.1c assignment
public class Assignment31c {
public static void main(String[] args) {
    game game1=new game("Minecraft","Computer game");
    System.out.println(game1);
    game1.PrintHighScore();
    game1.NewHighScore(200000,"Matt");
    game1.PrintHighScore();
 game game2=new game("Forza Horizon 4","Computer game");
 System.out.println(game2);
 game2.PrintHighScore();
 game2.NewHighScore(30000,"Matt");
 game2.PrintHighScore();
 game game3=new game("Uno","Card game");
System.out.println(game3);
game3.PrintHighScore();
game3.NewHighScore(80,"Matt");
game3.PrintHighScore();
}
}
