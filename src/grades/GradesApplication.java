package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // Create a HashMap to store the students
        HashMap<String, Student> students = new HashMap<>();

        // Create and add Student objects to the HashMap
        Student student1 = new Student("John");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);
        students.put("johndoe", student1);

        Student student2 = new Student("Jack");
        student2.addGrade(92);
        student2.addGrade(88);
        student2.addGrade(90);
        students.put("jackfelldown", student2);

        Student student3 = new Student("George");
        student3.addGrade(77);
        student3.addGrade(82);
        student3.addGrade(80);
        students.put("georgieboy", student3);

        Student student4 = new Student("Sally");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);
        students.put("sally101", student4);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        // Prompt the user for a GitHub username
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("What student would you like to see more information on?\n\n> ");
            String input = scanner.nextLine();

            // Check if the input matches a key in the HashMap
            if (students.containsKey(input)) {
                // Display information about the student
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName());
                System.out.println("GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage());
                System.out.println( "All Grades: " + student.getGrades() + "\n");
            } else if (input.equals("all")) {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName());
                System.out.println("GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage());
                System.out.println( "All Grades: " + student.getGrades() + "\n");
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".\n");
            }


            System.out.print("Would you like to see another student?\n\n> ");
            String moreInfo = scanner.nextLine().toLowerCase();
            if (!moreInfo.equals("y") && !moreInfo.equals("yes")) {
                break;
            }
            System.out.println();
        }

        // Say goodbye
        System.out.println("Goodbye, and have a wonderful day!");
    }
}