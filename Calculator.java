import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
                
                Scanner numScanner = new Scanner(System.in);
                Scanner opScanner = new Scanner(System.in);

                String operator = "";

                System.out.print("First number? ");
                int num1 = numScanner.nextInt();
        
                System.out.print("Second number? ");
                int num2 = numScanner.nextInt();
        
                System.out.println("Would you like to add or subtract these numbers?");
                operator = opScanner.nextLine();

                if (operator.equals("add"))
                        System.out.println("The sum is " + (num1 + num2));
                
                if (operator.equals("subtract"))
                        System.out.println("The difference is " + (num1 - num2));
        }
}