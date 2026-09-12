# java-expense-tracker
A command-line Expense Tracker developed using Core Java.
# Expense Tracker – Java

## Project Information

**Project Title:** Expense Tracker – A Java-Based Personal Expense Management System

**Programming Language:** Java

**Project Type:** Command-Line Application

**Domain:** Expense Management

---

## 1. Project Overview

Expense Tracker is a command-line based Java application developed to help users manage their income and daily expenses.

The application allows users to add expenses, view all expenses, search for an expense, filter expenses by category, calculate total expenses, add income, calculate the current balance, delete expenses, and save expense records in a text file.

The project is implemented using Core Java concepts such as classes and objects, encapsulation, constructors, ArrayList, exception handling, file handling, loops, conditional statements, and switch-case statements.

---

## 2. Problem Statement

Managing daily expenses manually can be difficult because users may have many expenses in different categories such as food, travel, education, shopping, and bills.

The Expense Tracker provides a simple command-line solution for recording and managing expenses. It reduces manual calculations and allows the user to calculate total expenses and remaining balance easily.

---

## 3. Objectives

* To develop a simple expense management application using Java.
* To record daily expenses.
* To calculate total expenses automatically.
* To maintain income information.
* To calculate the current balance.
* To search for individual expenses.
* To filter expenses according to category.
* To delete expense records.
* To store expense information using file handling.
* To demonstrate Core Java programming concepts.

---

## 4. Features

The application provides the following features:

1. Add Expense
2. View All Expenses
3. Search Expense
4. Filter by Category
5. Calculate Total Expenses
6. Add Income
7. Check Current Balance
8. Delete Expense
9. Save Expenses
10. Exit Application

---

## 5. Technologies Used

* Java
* Java Development Kit (JDK)
* ArrayList
* File Handling
* Scanner
* Command Line Interface
* VS Code or any Java-supported IDE

---

## 6. Java Concepts Used

### Classes and Objects

The program uses an `Expense` class to represent an individual expense.

### Encapsulation

Expense information is grouped inside the `Expense` class.

### Constructor

The constructor initializes the details of an expense.

### ArrayList

An `ArrayList` is used to store multiple expense objects dynamically.

### Exception Handling

`try-catch` is used to handle invalid input and file-related errors.

### File Handling

`FileWriter`, `FileReader`, and `BufferedReader` are used to save and load expense records.

### Loops

Loops are used for displaying, searching, filtering, and calculating expenses.

### Switch Case

A switch statement is used to process the user's menu choice.

---

## 7. Project Structure

```text
java-expense-tracker/
│
├── Main.java
├── README.md
└── expenses.txt
```

`Main.java` contains the complete Java implementation.

`README.md` contains project documentation and execution instructions.

`expenses.txt` stores saved expense records.

---

## 8. System Requirements

### Hardware

* Basic computer or laptop
* Minimum 2 GB RAM
* Keyboard for command-line input

### Software

* JDK 8 or above
* Command Prompt or Terminal
* VS Code or another Java-compatible editor

---

## 9. Checking Java Installation

Open a terminal and run:

```bash
java -version
```

Then check the compiler:

```bash
javac -version
```

If both commands display a Java version, Java is installed correctly.

---

## 10. Installation

### Step 1

Download or copy the project folder.

### Step 2

Open the project folder in VS Code.

### Step 3

Open the VS Code terminal.

### Step 4

Compile the Java program:

```bash
javac Main.java
```

### Step 5

Run the program:

```bash
java Main
```

---

## 11. How to Use the Application

After running the program, the following menu appears:

```text
------------- MENU -------------
1. Add Expense
2. View All Expenses
3. Search Expense
4. Filter by Category
5. Calculate Total Expenses
6. Add Income
7. Check Current Balance
8. Delete Expense
9. Save Expenses
10. Exit
--------------------------------
```

### Option 1 – Add Expense

Enter:

* Expense ID
* Date
* Category
* Description
* Amount

Example:

```text
Enter expense ID: 101
Enter date (DD-MM-YYYY): 12-09-2026
Enter category: Food
Enter description: Lunch
Enter amount: 250
```

### Option 2 – View All Expenses

Displays all currently stored expense records.

### Option 3 – Search Expense

Enter an expense ID to find a particular expense.

### Option 4 – Filter by Category

Enter a category such as:

```text
Food
Travel
Education
Shopping
Bills
```

The program displays expenses belonging to that category.

### Option 5 – Calculate Total Expenses

The program adds all stored expense amounts.

### Option 6 – Add Income

Enter the income amount.

### Option 7 – Check Current Balance

The application calculates:

```text
Current Balance = Total Income - Total Expenses
```

### Option 8 – Delete Expense

Enter the ID of the expense that should be deleted.

### Option 9 – Save Expenses

The program saves expense records into:

```text
expenses.txt
```

### Option 10 – Exit

The application saves the expense records and exits.

---

## 12. Data Storage

The application uses a text file called:

```text
expenses.txt
```

Each record is stored in this format:

```text
ID|Date|Category|Description|Amount
```

Example:

```text
101|12-09-2026|Food|Lunch|250.0
102|12-09-2026|Travel|Bus Ticket|100.0
```

---

## 13. Balance Calculation

The application uses:

```text
Balance = Total Income - Total Expenses
```

For example:

```text
Total Income = 25000
Total Expenses = 350

Balance = 25000 - 350
        = 24650
```

---

## 14. Error Handling

The program handles invalid input using exception handling.

For example, if the user enters text instead of a number, the program displays:

```text
Invalid input. Please enter a number.
```

The program also checks that expense and income amounts are greater than zero.

---

## 15. Sample Output

```text
======================================
          EXPENSE TRACKER
======================================

------------- MENU -------------
1. Add Expense
2. View All Expenses
3. Search Expense
4. Filter by Category
5. Calculate Total Expenses
6. Add Income
7. Check Current Balance
8. Delete Expense
9. Save Expenses
10. Exit
--------------------------------
Enter your choice: 6

Enter income amount: 25000
Income of 25000.00 added successfully.

Enter your choice: 1

----- Add Expense -----
Enter expense ID: 101
Enter date (DD-MM-YYYY): 12-09-2026
Enter category: Food
Enter description: Lunch
Enter amount: 250
Expense added successfully.

Enter your choice: 1

----- Add Expense -----
Enter expense ID: 102
Enter date (DD-MM-YYYY): 12-09-2026
Enter category: Travel
Enter description: Bus Ticket
Enter amount: 100
Expense added successfully.

Enter your choice: 5

Total Expenses = 350.00

Enter your choice: 7

----- Financial Summary -----
Total Income    = 25000.00
Total Expenses  = 350.00
Current Balance = 24650.00
```

---

## 16. Testing

The following operations should be tested:

| Test                | Input              | Expected Result           |
| ------------------- | ------------------ | ------------------------- |
| Add expense         | ID 101, amount 250 | Expense added             |
| Add another expense | ID 102, amount 100 | Expense added             |
| Duplicate ID        | ID 101             | ID rejected               |
| View expenses       | Option 2           | Records displayed         |
| Search              | ID 101             | Correct expense displayed |
| Search              | ID 999             | Expense not found         |
| Category filter     | Food               | Food records displayed    |
| Total               | Option 5           | Total calculated          |
| Income              | 25000              | Income added              |
| Balance             | Option 7           | Balance calculated        |
| Delete              | ID 101             | Expense deleted           |
| Invalid choice      | 20                 | Invalid choice message    |

---

## 17. Advantages

* Simple command-line interface.
* Easy to understand.
* Uses Core Java.
* Stores multiple expenses.
* Automatically calculates totals.
* Provides search and filtering.
* Supports file storage.
* Handles invalid input.
* Can be extended in the future.

---

## 18. Limitations

* The current version does not use a database.
* It does not have a graphical user interface.
* It is designed as a basic personal expense tracker.
* Advanced financial analysis is not included.
* Income is maintained only during the current execution.

---

## 19. Future Scope

Future versions can include:

* Database connectivity using JDBC.
* User login and authentication.
* Monthly expense reports.
* Graphical user interface.
* Expense charts and graphs.
* Budget limits.
* CSV export.
* Multiple user accounts.
* Monthly spending analysis.
* Notifications for budget limits.

---

## 20. Conclusion

The Expense Tracker is a simple Java-based command-line application for managing income and expenses.

The project demonstrates practical use of Core Java concepts including classes, objects, constructors, ArrayList, loops, switch statements, exception handling, and file handling.

The application provides useful operations such as adding, viewing, searching, filtering, deleting, and saving expenses. It also calculates total expenses and the current balance.

The project provides a foundation that can later be extended with databases, graphical interfaces, authentication, and advanced expense analysis.
