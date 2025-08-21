import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    private ArrayList<String> items;

    public GroceryListManager() {
        items = new ArrayList<>();
}

public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER AN ITEM TO ADD: ");
        String input = scanner.nextLine();
        items.add(input);
        System.out.println(input + " added successfully");
}

    public void removeItem() {
        if (items.isEmpty()) {
            System.out.println("NO ITEMS ARE AVAILABLE.");
            return;
}

        System.out.println("LIST OF All AVAILABLE ITEMS: ");
        for (int index = 0; index < items.size(); index++) {
            System.out.println((index + 1) + ". " + items.get(index));
}

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ITEM TO REMOVE: ");
        int index = scanner.nextInt();
	scanner.nextLine();

        if (index > 0 && index <= items.size()) {
            String removedItem = items.remove(index - 1);
            System.out.println(removedItem + " removed successfully");
} else {
            System.out.println("INVALID ITEM NUMBER!");
        }
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("NO ITEMS ARE AVAILABLE");
        } else {
            System.out.println("Available items:");
            for (int index = 0; index < items.size(); index++) {
                System.out.println((index + 1) + ". " + items.get(index));
}
}
}

    public void run() {

        while (true) {
            String prompt = """
                    WELCOME TO YOUR GROCERY LIST MANAGER

                    Press:
                        1 -> Add item
                        2 -> Remove item
                        3 -> Show all items
                        0 -> Exit
                    """;

            System.out.println(prompt);
            System.out.print("Kindly enter a choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
		scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    showItems();
                    break;
                case 0:
                    System.out.println("NOW EXITING...");
                    return;
                default:
                    System.out.println("INVALID CHOICE SELECTION!");
 }
 }
 }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.run();
}
}