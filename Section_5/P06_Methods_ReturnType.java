package Section_5;

public class P06_Methods_ReturnType {

     // defining a method for calculating the scores
     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          int finalScore = score;
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               return finalScore;
          }
          return 0;
     }
     public static void main(String[] args) {
          
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;
          
          // Callimg the method we just created
          System.out.println("This is the first method of calculating scores");
          int calculatedScore = calculateScore(gameOver, score, levelCompleted, bonus);
          System.out.println("The score is " + calculatedScore);
     }
}
