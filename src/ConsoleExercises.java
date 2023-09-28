import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        {
            System.out.format("The value of pi is approximately %.2f%n", pi);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");

            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                System.out.println("You entered: " + userInput);
            } else {
                System.out.println("Not a valid integer input.");
            }

            System.out.print("Enter three words: ");

            String word1 = scanner.next();
            String word2= scanner.next();
            String word3= scanner.next();

            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);

            System.out.println("You entered:");
            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);

            System.out.print("Enter a sentence: ");
            scanner.useDelimiter("\n");
            String sentence = scanner.next();
            System.out.println("You entered: " + sentence);

            System.out.print("Enter the length of the classroom: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the classroom: ");
            double width = scanner.nextDouble();

            double area = length * width;
            double perimeter = 2 * (length + width);
            double volume = area * 10;

            System.out.format("Area: %.2f square units%n", area);
            System.out.format("Perimeter: %.2f units%n", perimeter);
            System.out.format("Volume: %.2f cubic units%n", volume);

            scanner.close();
        }


    }

}