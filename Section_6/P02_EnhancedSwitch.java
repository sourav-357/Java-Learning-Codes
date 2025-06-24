package Section_6;

public class P02_EnhancedSwitch {
     public static void main(String[] args) {
       // Normal method to do is the if-else method
       int value = 3;
       if (value == 1) {
           System.out.println("Value was 1");
       } else if (value == 2) {
           System.out.println("Value was 2");
       } else {
           System.out.println("Was not 1 or 2");
       }

        int switchValue = 3;
        // This time using the modern Java Switch case
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }
        // Printing the value
        String month = "XYZ";
        // System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    
}
