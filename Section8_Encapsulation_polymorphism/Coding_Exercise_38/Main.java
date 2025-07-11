package Section8_Encapsulation_polymorphism.Coding_Exercise_38;

public class Main {

     public static void main(String[] args) {
          Printer printer = new Printer(50, true);
          System.out.println(printer.addToner(50));
          System.out.println("Initial page count = " + printer.getPagesPrinted());
          int pagesPrinted = printer.printPages(4);
          System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer "
                    + printer.getPagesPrinted());

          pagesPrinted = printer.printPages(2);
          System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer "
                    + printer.getPagesPrinted());
     }
}
