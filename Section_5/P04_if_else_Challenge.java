package Section_5;

public class P04_if_else_Challenge {
     public static void main(String[] args) {
          
          boolean gameOver = true;
          int score = 2000;
          int levelCompleted = 5;
          int bonus = 100;

          int finalScore = score;
          if (gameOver == true) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score was " + finalScore);
          }
     }
}
