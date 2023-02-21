import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("First number? ");
                int userInput1 = scanner.nextInt();
        
                System.out.print("Second number? ");
                int userInput2 = scanner.nextInt();
        
                int addition = userInput1 + userInput2;
        
                System.out.println("The sum is " + addition);

        }
}