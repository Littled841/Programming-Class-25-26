public class asignment32c {
    //Matthew Dempsey wrote this
    //This prgram is for assignment 3.2
    public static void main(String[] args) {
     game game1=new game("Minecraft","Computer game");
     Boardgame game2=new Boardgame ("Game of life");
     CardGame game3=new CardGame ("Exploding Kittens");
    System.out.println(game1);
    System.out.println(game2);
    System.out.println(game3);
     game1.NewHighScore(200000,"Matt");
      game2.NewHighScore(200000,"Matt");
    game3.PlayCard();
    game3.PlayCard();
    }
}