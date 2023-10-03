import java.util.Scanner;
public class MethodsExercises {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) { // Check if the divisor is zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static int modulus(int a, int b) {
        if (b == 0) { // Check if the divisor is zero
            throw new ArithmeticException("Cannot divide by zero"); // Throw an exception
        }
        return a % b; // Return the remainder of a and b
    }

    // Test the methods and verify the output
    public static void main(String[] args) {
//        variables for testing
        int x = 10;
        int y = 5;
        int z = 0;

        // results
        System.out.println("x + y = " + add(x, y)); // x + y = 15
        System.out.println("x - y = " + subtract(x, y)); // x - y = 5
        System.out.println("x * y = " + multiply(x, y)); // x * y = 50
        System.out.println("x / y = " + divide(x, y)); // x / y = 2
        System.out.println("x % y = " + modulus(x, y)); // x % y = 0

        // Try to divide by zero and catch the exception
        try {
            System.out.println("x / z = " + divide(x, z)); // This will cause an error
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Cannot divide by zero

        }
    }
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the number of sides for a pair of dice: ");
//            int sides = sc.nextInt();
//            String choice = "y";
//            while (choice.equalsIgnoreCase("y")) {
//                System.out.println("Rolling the dice...");
//                int die1 = rollDice(sides);
//                int die2 = rollDice(sides);
//                System.out.println("The results are: " + die1 + " and " + die2);
//                System.out.print("Do you want to roll the dice again? (y/n): ");
//                choice = sc.next();
//            }
//            System.out.println("Thank you");
//        }
//
//        // This method uses the .random method of the java.lang.Math class to generate a random number between 1 and the given number of sides.
//        // It returns the result as an integer.
//        public static int rollDice ( int sides){
//            return (int) (Math.random() * sides) + 1;
//        }
//    }



