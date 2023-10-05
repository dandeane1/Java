import java.util.Enumeration;
import java.util.Scanner;
public class ControlFlowExercises {
    //    Create a while loop that runs so long as i is less than or equal to 15
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(+i);
//            i++;
//        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int x = 2;
        do {
            System.out.println(+x);
            x += 2;
        } while (x <= 98);
        System.out.println(+x);


//        Alter your loop to count backwards by 5's from 100 to -10.
        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -5);
        System.out.println(y);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        long z = 2;
        do {
            System.out.println(z);
            z = z * z;
        } while (z <= 1000000);


//        Refactor the previous two exercises to use a for loop instead.
        for (int j = 0; j <= 15; j++) {
            System.out.println(+j);
        }
        long number = 2L;

        for (int j = 1; number < 100000000L; j++) {
            System.out.println(number);
            number *= number;

        }
//
////        Fizzbuzz
        for (int b = 0; b < 101; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (b % 3 == 0) {
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);

            }



                Scanner scanner = new Scanner(System.in);
                String choice;

                do {
                    System.out.print("Enter an integer: ");
                    int n = scanner.nextInt();

                    System.out.println("number\tsquared\tcubed");
                    System.out.println("------\t------\t------");

                    for (int i = 1; i <= n; i++) {
                        int square = i * i;
                        int cube = i * i * i;
                        System.out.printf("%5d\t%6d\t%5d%n", i, square, cube);
                    }

                    System.out.print("Do you want to continue (yes/no)? ");
                    scanner.nextLine();
                    choice = scanner.nextLine();
                } while (choice.equalsIgnoreCase("yes"));

            }



                Scanner input = new Scanner(System.in);
                String choice;

                do {
                    System.out.print("Enter a numerical grade (0-100): "); // prompt the user for a numerical grade
                    int numericalGrade = input.nextInt(); // read the numerical grade as an integer

                    String letterGrade; // declare a variable to store the letter grade

                    // use a switch statement to assign the letter grade based on the first digit of the numerical grade
                    switch (numericalGrade / 10) {
                        case 10:
                        case 9:
                            letterGrade = "A";
                            break;
                        case 8:
                            letterGrade = "B";
                            break;
                        case 7:
                            letterGrade = "C";
                            break;
                        case 6:
                            letterGrade = "D";
                            break;
                        default:
                            letterGrade = "F";
                    }

                    // use a nested switch statement to add a plus or minus sign based on the second digit of the numerical grade
                    switch (numericalGrade % 10) {
                        case 9:
                        case 8:
                            if (!letterGrade.equals("F")) { // do not add a plus sign for F grades
                                letterGrade += "+";
                            }
                            break;
                        case 1:
                        case 0:
                            if (!letterGrade.equals("F")) { // do not add a minus sign for F grades
                                letterGrade += "-";
                            }
                            break;
                    }

                    // print the letter grade
                    System.out.println("The letter grade is: " + letterGrade);

                    // ask the user if they want to continue
                    System.out.print("Do you want to continue (yes/no)? ");
                    input.nextLine(); // consume the newline character
                    choice = input.nextLine(); // read the user's choice as a string
                } while (choice.equalsIgnoreCase("yes")); // repeat the loop if the user says yes

                input.close(); // close the scanner object
            }
        }
