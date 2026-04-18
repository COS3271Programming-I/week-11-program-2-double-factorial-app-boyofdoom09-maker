package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Im {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Enter a positive integer (less than 20): ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 0 || number >= 20) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer less than 20.");
            }
        }

        System.out.println("The double factorial of " + number + " is: " + doubleFactorial(number));
        scanner.close();}

    public static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }
		}
