package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();

        boolean exit = false;
        while (!exit) {
            System.out.println("What would you like to do?");
            System.out.println("1. View all movies");
            System.out.println("2. View movies by category");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("All movies:");
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " (" + movie.getCategory() + ")");
                    }
                }
                case 2 -> {
                    System.out.println("Enter a category:");
                    String category = scanner.next();
                    System.out.println("Movies in category \"" + category + "\":");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase(category)) {
                            System.out.println(movie.getName() + " (" + movie.getCategory() + ")");
                        }
                    }
                }
                case 3 -> {
                    exit = true;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
