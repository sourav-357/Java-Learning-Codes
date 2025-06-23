package Section_5;

public class P07_Methods_Challenge {

     // Creating the first method 
     public static void displayHighScoreposition ( String playerName, int playerPosition) {
          System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
     }

     // creating the second method
     public static int calculateHighScoreposition (int playerScore) {
          if (playerScore >= 1000) {
               return 1;
          } else if ((playerScore >= 500 ) & (playerScore < 1000)) {
               return 2;
          } else if ((playerScore >= 100) && (playerScore < 500)) {
               return 3;
          } else {
               return 4;
          }
     }
     public static void main(String[] args) {
          
          // initialising requires two variables 
          int score = 500;
          String name = "Sourav";

          // Using the two methods
          int position = calculateHighScoreposition(score);
          displayHighScoreposition(name, position);
     }
}
