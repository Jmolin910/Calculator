import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
                
                Scanner numScanner = new Scanner(System.in);
                Scanner opScanner = new Scanner(System.in);

                String operator = "";

                System.out.print("First number? ");
                double num1 = numScanner.nextDouble();
        
                System.out.print("Second number? ");
                double num2 = numScanner.nextDouble();
        
                System.out.println("Would you like to add, subtract, multiply, or divide these numbers?");
                operator = opScanner.nextLine();

                if (operator.equals("add"))
                        System.out.println("The sum is " + (num1 + num2));
                
                if (operator.equals("subtract"))
                        System.out.println("The difference is " + (num1 - num2));
                
                if (operator.equals("multiply"))
                        System.out.println("The product is " + (num1 * num2));

                if (operator.equals("divide"))
                        System.out.println("The dividend is " + (num1 / num2));
        }
}