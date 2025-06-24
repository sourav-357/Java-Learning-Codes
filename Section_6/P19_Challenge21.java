/*

*/
package Section_6;

public class P19_Challenge21 {
     public static void printFactors(int number) {
          if (number < 1) {
               System.out.println("Invalid Value");
               return;
          }
          for (int i = 1; i <= number; i++) {
               if (number % i == 0) {
                    System.out.println(i);
               }
          }
     }
     public static void main(String[] args) {
          printFactors(6);
          // Output: 1, 2, 3, 6
          printFactors(32);
          // Output: 1, 2, 4, 8, 16, 32
          printFactors(-1);
          // Output: Invalid Value
     }
}
