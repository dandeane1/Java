package grocery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        String categories = "";


            Scanner scanner = new Scanner(System.in);
            ArrayList<String> groceryCategories = new ArrayList<>();
            HashMap<String, Integer> groceryList = new HashMap<>();

        groceryCategories.add("Produce");
        groceryCategories.add("Dairy");
        groceryCategories.add("Meat");



        System.out.println("Welcome to Groceries for You !");

        System.out.print("Would you like to create a grocery list? (yes/no) ");
            String createListChoice = scanner.nextLine();

        if(createListChoice.equalsIgnoreCase("yes"))

            {
                String addItemChoice = "yes";

                while (addItemChoice.equalsIgnoreCase("yes")) {
                    System.out.println("\nPlease choose a category from the list below:");

                    for (int i = 0; i < groceryCategories.size(); i++) {
                        System.out.println((i + 1) + ". " + groceryCategories.get(i));
                    }

                    System.out.print("Enter the number of the category: ");
                    int categoryChoice = Integer.parseInt(scanner.nextLine()) - 1;

                    System.out.print("Please enter the name of the item you would like: ");
                    String itemName = scanner.nextLine();

                    System.out.print("PLease, enter the quantity: ");
                    int itemQuantity = Integer.parseInt(scanner.nextLine());

                    String category = groceryCategories.get(categoryChoice);
                    groceryList.put(itemName, itemQuantity);

                    System.out.print("\nWould you like to add another item to your cart? (yes/no) ");
                    addItemChoice = scanner.nextLine();
                }

                System.out.print("\nWould you like to finalize the list? (yes/no) ");
                String finalizeChoice = scanner.nextLine();

                if (finalizeChoice.equalsIgnoreCase("yes")) {
                    System.out.println("\nFinal Grocery List:");

                    groceryList.entrySet().stream()
                            .sorted(HashMap.Entry.comparingByKey())
                            .forEach(entry -> {
                                String itemName = entry.getKey();
                                int itemQuantity = entry.getValue();
                                String category = getCategoryByItem(groceryCategories, itemName);

                                System.out.println("Category: " + category);
                                System.out.println("Item: " + itemName);
                                System.out.println("Quantity: " + itemQuantity);
                                System.out.println();
                            });
                }
            }
        System.out.println("Thank you, Please come again!");
        }

        private static String getCategoryByItem (ArrayList < String > groceryCategories, String itemName){
            for (String category : groceryCategories) {
                if (itemName.toLowerCase().startsWith(category.toLowerCase()))
                    return category;
            }
            return "ALL";
        }
    }

