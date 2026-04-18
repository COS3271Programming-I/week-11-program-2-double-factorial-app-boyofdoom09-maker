package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Im {
	
	
	public static void factorialApp(String[] args) {
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
    }

    public static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }

	
	static Scanner userinput = new Scanner(System.in); 
    public static void diceApp(String[] args){
    	Random random = new Random();
    	String choice;
    	System.out.println("Would you like to roll the die?");
    	
    	
    	do {
    	int die_1 = random.nextInt(1, 7);
    	int die_2 = random.nextInt(1, 7);
    	System.out.printf("you rolled a %s and a %s. %n ", die_1, die_2);
    	System.out.println("Total: " + (die_1 + die_2));
    	System.out.println("Would you like to roll again? (y/n)");
    	choice = userinput.next();
    	} while (choice.equalsIgnoreCase("y"));
    	
    	System.out.println("Thank's for playing!");
        }
   
	
public static void displayApp(String[] args) {
		
        String verse = "Do not conform to the pattern of this world, but be transformed by the renewing of your mind.";
        String reference = "Romans 12:2";

        System.out.printf("%-80s%n", verse);
        System.out.printf("%-80s%n", reference);

	}


	
	public static void textArtApp(String[] args) {
		
		String s;
		s =
			"111111111111111111111111111111111111111111111111111111111\n"+
			"111111111111111111111111111111111¶¶¶111111111111111111111\n"+
			"111111111111111111111111111111¶¶¶¶11111111111111111111111\n"+
			"1111111111111111111111111111¶¶¶¶1111111111111111111111111\n"+
			"11111111111111111111111111¶¶¶¶¶¶1111111111111111111111111\n"+
			"111111111111111111111111¶¶¶¶¶¶1111¶¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111\n"+
			"111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111\n"+
			"11111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111111\n"+
			"11111111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111\n"+
			"1111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111111111\n"+
			"111111111111111¶¶¶111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111111\n"+
			"111111111111¶¶¶¶¶11¶¶¶¶¶¶¶¶¶¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111\n"+
			"11111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶1111¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶¶¶1111\n"+
			"1111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111¶11111¶¶¶¶¶¶¶¶¶¶¶¶¶111¶¶¶¶111\n"+
			"11111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111¶¶¶11\n"+
			"1111¶¶¶¶¶¶¶¶111111111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111¶¶1\n"+
			"11111¶¶¶¶¶111111111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111\n"+
			"1111111¶1111111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111111\n"+
			"1111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111111\n"+
			"111111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶¶¶1111111\n"+
			"11111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111¶¶¶¶¶1111111\n"+
			"11111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111¶¶¶¶1111111\n"+
			"111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111¶¶¶¶1111111\n"+
			"1111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111111¶¶¶¶1111111\n"+
			"111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111¶¶¶¶¶¶111111111111111¶¶¶11111111\n"+
			"11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111111111111111111111111111¶¶111111111\n"+
			"1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111111111111¶¶1111111111111111111111\n"+
			"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111111111111111¶¶¶¶11111111111111111\n"+
			"¶¶¶¶¶¶¶¶¶¶1¶¶¶111111111111111111111111¶¶¶¶¶11111111111111\n"+
			"¶¶¶¶¶¶¶¶¶¶11¶¶11111111111111111111111111¶¶¶¶¶¶¶1111111111\n"+
			"¶¶¶¶¶¶¶¶¶¶¶111¶111111111111¶¶¶11111¶¶¶¶111¶¶¶¶¶¶¶11111111\n"+
			"¶¶¶¶¶¶¶¶¶¶¶¶11111111111111111¶¶¶11111¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111\n"+
			"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1111\n"+
			"¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11\n"+
			"¶¶11¶¶¶¶¶¶¶¶¶¶¶¶111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111¶¶¶¶¶¶¶¶¶¶¶¶1\n"+
			"1¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111111¶¶¶¶¶¶¶¶\n"+
			"1111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111111111¶¶¶¶¶¶\n"+
			"1111¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶¶¶¶¶¶11111111111111¶¶¶¶¶\n"+
			"11111¶¶¶11111¶¶¶¶¶¶¶¶¶¶¶¶¶11111¶¶¶¶¶¶¶¶¶¶11111111111111¶¶\n"+
			"1111¶¶¶11111111¶¶¶1¶¶¶¶¶¶¶¶¶11111¶¶¶¶¶11111111111111111¶¶\n"+
			"1111¶¶¶111111111111111¶¶¶¶¶¶¶1111111¶¶¶¶¶¶¶¶111111111111¶\n"+
			"11111¶¶1111111111111111111¶¶¶¶¶1111111111111111111111111¶\n"+
			"111111¶11111111111111111111¶¶¶¶11111111111111111111111111\n"+
			"1111111111111111111111111111¶¶¶11111111111111111111111111\n"+
			"11111111111111111111111111111¶¶11111111111111111111111111\n"+
			"111111111111111111111111111111111111111111111111111111111\n"+
			"111111111111111111111111111111111111111111111111111111111";
			System.out.println(s);
		}

	
	
	
	public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiouy".indexOf(c) != -1;
    }

    public static void oppishApp(String[] args) {
        System.out.println("Enter a word to translate into Oppish: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            int i = 0;

            while (i < word.length()) {
                if (isVowel(word.charAt(i))) {
                    result.append(word.charAt(i));
                    i++;
                } else {
                    int start = i;
                    while (i < word.length() && !isVowel(word.charAt(i))) {
                        i++;
                    }
                    result.append(word.substring(start, i));
                    if (i < word.length()) result.append("opp");
                }
            }

            if (w < words.length - 1) result.append(" ");
        }

        System.out.println(result.toString());
    }

	
	
	public static void fibbonachiSequenceApp(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers would you like to print (1-32)? ");
        int count = scanner.nextInt();

        if (count < 1 || count > 32) {
            System.out.println("Please enter a number between 1 and 32.");
            return;
        }

        long[] fibonacci = new long[count];
        fibonacci[0] = 0;
        if (count > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci numbers:");
        for (long num : fibonacci) {
            System.out.print(num + " ");
        }
    }

	
	public static void encouragementApp(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your first name");
		String first = scanner.nextLine();
		System.out.println("Enter your middle name");
		String middle = scanner.nextLine();
		System.out.println("Enter your last name");
		String last = scanner.nextLine();
		char j = '\u2713';
		System.out.printf("%s %s %s, you're doing great. %s %n", first, middle, last, j);

		
		
	}


	
	public static void calculatorApp(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("enter a number");
	    double firstNumber = scanner.nextDouble();
	    System.out.println("enter second number");
	    double secondNumber = scanner.nextDouble();
	    
	    double sum = firstNumber + secondNumber;
	    double product = firstNumber * secondNumber;
	    double quotient = firstNumber / secondNumber;
	    double power = Math.pow(firstNumber, secondNumber);
	    
	    double result = Math.log(firstNumber) / Math.log(secondNumber);

	    System.out.printf("log base %f of %f is %f%n", secondNumber, firstNumber, result);
	    System.out.printf("The sum of the two numbers is: %f %n", sum);
	    System.out.printf("The product of the two numbers is: %f %n", product);
	    System.out.printf("The quotient of the two numbers is: %f %n", quotient);
	    System.out.printf("The first number to the power of the second number is: %f %n", power);
	    
	}

	    public static double logBaseYApp(double num, double base) {
	        return Math.log(num) / Math.log(base);
	    }
	
	
	 public static void binaryCalculatorApp(String[] args) {
	    	Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter first binary number (x): ");
	        String x = scanner.nextLine();
	        System.out.print("Enter second binary number (y): ");
	        String y = scanner.nextLine();
	        
	        int num1 = Integer.parseInt(x, 2);
	        int num2 = Integer.parseInt(y, 2);
	        
	        int sum = num1 + num2;
	        int difference = num1 - num2;
	        int product = num1 * num2;
	        int quotient = num1 / num2;
	        
	        System.out.println("x + y = " + Integer.toBinaryString(sum));
	        System.out.println("x - y = " + Integer.toBinaryString(difference));
	        System.out.println("x * y = " + Integer.toBinaryString(product));
	        System.out.println("x / y = " + Integer.toBinaryString(quotient));
	 }
   
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    String service;

		    do {
		        System.out.println("\nChoose a service:");
		        System.out.println("dice, display, textart, oppish, fibonacci, encouragement, calculator, binary, factorial");
		        System.out.println("Type 'exit' to quit.");

		        service = scanner.nextLine();

		        if (service.equalsIgnoreCase("dice")) {
		            diceApp(args);

		        } else if (service.equalsIgnoreCase("display")) {
		            displayApp(args);

		        } else if (service.equalsIgnoreCase("textart")) {
		            textArtApp(args);

		        } else if (service.equalsIgnoreCase("oppish")) {
		            oppishApp(args);

		        } else if (service.equalsIgnoreCase("fibonacci")) {
		            fibbonachiSequenceApp(args);

		        } else if (service.equalsIgnoreCase("encouragement")) {
		            encouragementApp(args);

		        } else if (service.equalsIgnoreCase("calculator")) {
		            calculatorApp(args);

		        } else if (service.equalsIgnoreCase("binary")) {
		            binaryCalculatorApp(args);
		            
		        } else if (service.equalsIgnoreCase("factorial")) {
		            factorialApp(args);
		            }

		         else if (!service.equalsIgnoreCase("exit")) {
		            System.out.println("Unknown service.");
		        }

		    } while (!service.equalsIgnoreCase("exit"));

		    System.out.println("Goodbye!");
		    scanner.close();
		}
  
    
    }
