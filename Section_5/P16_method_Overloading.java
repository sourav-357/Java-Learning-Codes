
// The method overloading in details
package Section_5;

public class P16_method_Overloading {
     public static void main(String[] args) {

          // Using the first method we just created
          int newScore = calculateScore("abc", 500);
          System.out.println("New score is " + newScore);

          // using the second method we created with different parameters -->> Method overloading
          System.out.println("New Score for the unnamed player is " + calculateScore(200));
     }

     // now creating a new method 
     public static int calculateScore(String playerName, int score) {
          System.out.println("Player " + playerName + " scored " + score + " points");
          return score * 1000;
     }

     // again creating a new method 
     public static int calculateScore(int score) {
          System.out.println("Unnamed player scored " + score + " points");
          return score * 1000;
     }
}