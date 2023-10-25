package expense_tracker;

import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String itemName;
    double amount;

    public Expense(String itemName, double amount) {
        this.itemName = itemName;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. View All Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter expense item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    expenses.add(new Expense(itemName, amount));
                    System.out.println("Expense added successfully!\n");
                    break;
                case 2:
                    double totalExpenses = 0;
                    for (Expense expense : expenses) {
                        totalExpenses += expense.amount;
                    }
                    System.out.println("Total expenses: Rs" + totalExpenses + "\n");
                    break;
                case 3:
                    System.out.println("All Expenses:");
                    for (Expense expense : expenses) {
                        System.out.println(expense.itemName + ": Rs" + expense.amount);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
