import java.util.Scanner;

public class MethodsExercises {
    public static Scanner localScanner = new Scanner(System.in);

    public static int addition(int x, int y) {

        return x + y;
    }

    public static int subtraction(int x, int y) {

        return x - y;
    }

    public static int multiplication(int x, int y) {

        return x * y;
    }

    public static int division(int x, int y) {

        return x / y;
    }

    public static int modulo(int x, int y) {

        return x % y;
    }

    //Multiply without using operator

    public static int multiplyLoop(int x, int y) {
        int bucket = 0;

        for (int i = 0; i < y; i++) {
            bucket += x;
        }

        return bucket;
    }

    // recursion multiply bonus

    public static int recursionMultiply(int x, int y, int bucket) {

        if (y == 0) {
            return bucket;
        }

        bucket += x;

        y--;

        return recursionMultiply(x, y, bucket);
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Please enter a number between: %d-%d%n", min, max);

        int userIntAnswer = localScanner.nextInt();

        if (userIntAnswer < min || userIntAnswer > max) {
            System.out.println("Incorrect input detected - please try again");

            return getInteger(min, max);
        }

        return userIntAnswer;
    }


        public class FactorialCalculator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    int myUsersNum = getInteger(scanner, 1, 10);
                    int mathBucket = 1;

                    System.out.printf("%d! = ", myUsersNum);
                    for (int i = 1; i <= myUsersNum; i++) {
                        mathBucket *= i;
                        System.out.print(i);
                        if (i < myUsersNum) {
                            System.out.print(" x ");
                        }
                    }

                    System.out.printf(" = %d%n", mathBucket);
                    System.out.print("Do you want to continue? (y/n): ");
                    String choice = scanner.next();

                    if (!choice.equalsIgnoreCase("y")) {
                        break;
                    }
                }

                scanner.close();
            }

            public static int getInteger(Scanner scanner, int min, int max) {
                int value;
                while (true) {
                    System.out.printf("Enter an integer between %d and %d: ", min, max);
                    if (scanner.hasNextInt()) {
                        value = scanner.nextInt();
                        if (value >= min && value <= max) {
                            break;
                        } else {
                            System.out.println("Please enter a valid integer within the specified range.");
                        }
                    } else {
                        System.out.println("Please enter a valid integer.");
                        scanner.next();
                    }
                }
                return value;
            }
        }





    public static void diceRolling() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides for a pair of dice: "); // Prompt the user to enter the number of sides for a pair of dice
        int sides = sc.nextInt(); // Get the user input as an integer

        String choice = "y"; // Initialize the choice as "y" to start the loop
        while (choice.equalsIgnoreCase("y")) {
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);
            System.out.println("You rolled a " + dice1 + " and a " + dice2);
            System.out.print("Do you want to roll the dice again? (y/n): ");
            choice = sc.next();
        }
    }

    public static int rollDice(int sides) {
        return (int) (Math.random() * sides) + 1;
    }

}





