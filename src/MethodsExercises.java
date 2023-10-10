import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing arithmetic methods
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(9, 4));
        System.out.println("Multiplication: " + multiply(7, 2));
        System.out.println("Division: " + divide(10, 2));
        System.out.println("Modulus: " + modulus(17, 4));

        // Testing getInteger method
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Valid input: " + userInput);

        // Testing factorial method
        System.out.print("Enter an integer from 1 to 10: ");
        int number = getInteger(1, 10);
        long factorial = calculateFactorial(number);
        System.out.println(number + "! = " + factorial);
    }

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
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Invalid input. Please try again.");
            return getInteger(min, max);
        }

        return userInput;
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}