package Section_5;

public class Program1 {
    public static void main(String[] args) {
        
        double Kilometers = (100 * 1.609334);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;  // added some bonus scores 
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        System.out.println(Kilometers);
    }
}
