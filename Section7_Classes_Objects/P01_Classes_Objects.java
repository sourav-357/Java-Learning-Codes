package Section7_Classes_Objects;

public class P01_Classes_Objects {
     public static void main(String[] args) {

        Car car = new Car();
        
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
