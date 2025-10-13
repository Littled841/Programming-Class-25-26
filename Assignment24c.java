//Matthew Dempsey wrote this
//This program is for 2.4c assignment
public class Assignment24c {
public static void main(String[] args) {
    game game1=new game("Minecraft","Computer game");
    System.out.println(game1);
    game1.PrintHighScore();
    game1.NewHighScore(200000,"Matt");
    game1.PrintHighScore();
}
}
