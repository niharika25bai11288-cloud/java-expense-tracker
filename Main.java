import java.io.*;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Expense class
    static class Expense {

        int id;
        String date;
        String category;
        String description;
        double amount;

        Expense(int id, String date, String category,
                String description, double amount) {

            this.id = id;
            this.date = date;
            this.category = category;
            this.description = description;
            this.amount = amount;
        }

        @Override
        public String toString() {

            return "ID: " + id +
                    " | Date: " + date +
                    " | Category: " + category +
                    " | Description: " + description +
                    " | Amount: " + amount;
        }
    }

    // ArrayList to store expenses
    static ArrayList<Expense> expenses = new ArrayList<>();

    // Store total income
    static double totalIncome = 0;

    // Add a new expense
    static void addExpense() {

        System.out.println("\n----- Add Expense -----");

        System.out.print("Enter expense ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check duplicate ID
        for (Expense e : expenses) {

            if (e.id == id) {

                System.out.println("This ID already exists.");
                return;
            }
        }

        System.out.print("Enter date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if (amount <= 0) {

            System.out.println(
                    "Amount must be greater than zero."
            );

            return;
        }

        Expense expense = new Expense(
                id,
                date,
                category,
                description,
                amount
        );

        expenses.add(expense);

        System.out.println(
                "Expense added successfully."
        );
    }

    // Display all expenses
    static void viewExpenses() {

        if (expenses.isEmpty()) {

            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n----- All Expenses -----");

        for (Expense e : expenses) {

            System.out.println(e);
        }
    }

    // Search expense using ID
    static void searchExpense() {

        System.out.print(
                "Enter expense ID to search: "
        );

        int id = sc.nextInt();
        sc.nextLine();

        for (Expense e : expenses) {

            if (e.id == id) {

                System.out.println(
                        "Expense found:"
                );

                System.out.println(e);

                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Filter expenses according to category
    static void filterCategory() {

        System.out.print(
                "Enter category: "
        );

        String category = sc.nextLine();

        boolean found = false;

        System.out.println(
                "\n----- Category: " + category + " -----"
        );

        for (Expense e : expenses) {

            if (e.category.equalsIgnoreCase(category)) {

                System.out.println(e);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No expenses found in this category."
            );
        }
    }

    // Calculate total expenses
    static void totalExpenses() {

        double total = 0;

        for (Expense e : expenses) {

            total += e.amount;
        }

        System.out.printf(
                "Total Expenses = %.2f%n",
                total
        );
    }

    // Add income
    static void addIncome() {

        System.out.print(
                "Enter income amount: "
        );

        double income = sc.nextDouble();
        sc.nextLine();

        if (income <= 0) {

            System.out.println(
                    "Income must be greater than zero."
            );

            return;
        }

        totalIncome += income;

        System.out.printf(
                "Income of %.2f added successfully.%n",
                income
        );
    }

    // Calculate current balance
    static void showBalance() {

        double total = 0;

        for (Expense e : expenses) {

            total += e.amount;
        }

        double balance = totalIncome - total;

        System.out.println(
                "\n----- Financial Summary -----"
        );

        System.out.printf(
                "Total Income    = %.2f%n",
                totalIncome
        );

        System.out.printf(
                "Total Expenses  = %.2f%n",
                total
        );

        System.out.printf(
                "Current Balance = %.2f%n",
                balance
        );
    }

    // Delete expense
    static void deleteExpense() {

        System.out.print(
                "Enter expense ID to delete: "
        );

        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < expenses.size(); i++) {

            if (expenses.get(i).id == id) {

                expenses.remove(i);

                System.out.println(
                        "Expense deleted successfully."
                );

                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Save expenses into file
    static void saveExpenses() {

        try {

            FileWriter writer =
                    new FileWriter("expenses.txt");

            for (Expense e : expenses) {

                writer.write(
                        e.id + "|" +
                        e.date + "|" +
                        e.category + "|" +
                        e.description + "|" +
                        e.amount +
                        "\n"
                );
            }

            writer.close();

            System.out.println(
                    "Expenses saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving expenses."
            );
        }
    }

    // Load expenses from file
    static void loadExpenses() {

        File file = new File("expenses.txt");

        if (!file.exists()) {

            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(file)
                    );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data =
                        line.split("\\|");

                if (data.length == 5) {

                    int id =
                            Integer.parseInt(data[0]);

                    String date = data[1];

                    String category = data[2];

                    String description = data[3];

                    double amount =
                            Double.parseDouble(data[4]);

                    Expense expense =
                            new Expense(
                                    id,
                                    date,
                                    category,
                                    description,
                                    amount
                            );

                    expenses.add(expense);
                }
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error while loading expenses."
            );
        }
    }

    // Display menu
    static void displayMenu() {

        System.out.println(
                "\n------------- MENU -------------"
        );

        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. Search Expense");
        System.out.println("4. Filter by Category");
        System.out.println("5. Calculate Total Expenses");
        System.out.println("6. Add Income");
        System.out.println("7. Check Current Balance");
        System.out.println("8. Delete Expense");
        System.out.println("9. Save Expenses");
        System.out.println("10. Exit");

        System.out.println(
                "--------------------------------"
        );
    }

    // Main method
    public static void main(String[] args) {

        // Load previously saved expenses
        loadExpenses();

        boolean running = true;

        System.out.println(
                "======================================"
        );

        System.out.println(
                "          EXPENSE TRACKER"
        );

        System.out.println(
                "======================================"
        );

        while (running) {

            displayMenu();

            try {

                System.out.print(
                        "Enter your choice: "
                );

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        addExpense();
                        break;

                    case 2:
                        viewExpenses();
                        break;

                    case 3:
                        searchExpense();
                        break;

                    case 4:
                        filterCategory();
                        break;

                    case 5:
                        totalExpenses();
                        break;

                    case 6:
                        addIncome();
                        break;

                    case 7:
                        showBalance();
                        break;

                    case 8:
                        deleteExpense();
                        break;

                    case 9:
                        saveExpenses();
                        break;

                    case 10:

                        saveExpenses();

                        System.out.println(
                                "Thank you for using Expense Tracker."
                        );

                        running = false;
                        break;

                    default:

                        System.out.println(
                                "Invalid choice. Please try again."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                sc.nextLine();
            }
        }

        sc.close();
    }
}