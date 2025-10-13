//Matthew Dempsey wrote this
//This program is for 2.4c assignment
public class game {
String title;
int HighScore;
String HowToScorePoints;
String TypeOfGame;
String HighScoreHolder;
    public game (String title2, String TypeOfGame){
        this.title=title2;
        this.TypeOfGame=TypeOfGame;
        HighScore=0;
        HighScoreHolder="Nobody";
    }
        public void NewHighScore(int NewHighScore, String name) {
            HighScore=NewHighScore;
            HighScoreHolder=name;
            System.out.println("Congratulations "+name+" On the new high score ");
        }
        public String toString (){
            return "The title of the game is "+title;
        }
        public void PrintHighScore(){
            System.out.println("The high score is "+HighScore);
            System.out.println("The curent high score holder is "+HighScoreHolder);
        }
}
