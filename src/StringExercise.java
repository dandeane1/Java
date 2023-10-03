
import java.util.Scanner;
public class StringExercise{
    public static void main(String[] args) {
            String message = "We don't need no ";
            String lastWord = "education";
            System.out.println(message + lastWord);
            String newlastWord = lastWord.replace("education", "thought control");
            System.out.println(message + newlastWord);


//        In windows, the main drive is usually C:\
            String message1 = ",the main drive is usually C:\\";
            String text = "In windows";

            System.out.println(text + message1);

            Scanner scanner = new Scanner(System.in);

            // Create a boolean variable to control the loop
            boolean keepTalking = true;

            // Print a welcome message
            System.out.println("Hi, I'm Bob. You can talk to me.");

            // Start a conversation loop
            while (keepTalking) {
                    // Read a line of input from the user
                    String input = scanner.nextLine();

                    // Check if the input is empty
                    if (input.isEmpty()) {

                            System.out.println("Fine. Be that way!");
                    }
                    // Check if the input ends with a question mark
                    else if (input.endsWith("?")) {
                            // Bob answers 'Sure.'
                            System.out.println("Sure.");
                    }
                    // Check if the input ends with an exclamation mark
                    else if (input.endsWith("!")) {
                            // Bob answers 'Whoa, chill out!'
                            System.out.println("Whoa, chill out!");
                    }
                    else if (input.equalsIgnoreCase("bye")) {
                            // Bob says 'Bye.' and ends the conversation
                            System.out.println("Bye.");
                            keepTalking = false;
                    }
                    // Otherwise
                    else {
                            // Bob answers 'Whatever.'
                            System.out.println("Whatever.");
                    }
            }

            // Close the scanner object
            scanner.close();
    }



    }


