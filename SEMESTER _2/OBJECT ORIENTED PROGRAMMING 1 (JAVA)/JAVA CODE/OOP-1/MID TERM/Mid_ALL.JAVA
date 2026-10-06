package basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
 

===========================================================================================



package basic;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte age = 25; // 1 byte
        short year = 2024; // 2 bytes
        int a = 100000; // 4 bytes
        long population = 7_800_000_000l; // 8 bytes
        float b = 5.75f; // 4 bytes
        double c = 19.99; // 8 bytes
        char d = 'A'; // 2 bytes
        boolean isJavaFun = true; // 1 bit

        System.out.println("Byte: " + age);
        System.out.println("Short: " + year);
        System.out.println("Integer: " + a);
        System.out.println("Long: " + population);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + isJavaFun);
    }

}
 


===========================================================================================




package basic;

import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current date: " + now);
    }

}
 



===========================================================================================




package basic;

import java.awt.Point;

public class TypesDifferences {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("Primitive type y: " + y);

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        p1.x = 3;
        System.out.println("Reference type p2.x: " + p2.x);
    }

}
 






===========================================================================================







package basic;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Length of the strings
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        // Substring
        String substring = str2.substring(5, 16);
        System.out.println("Substring of str2: " + substring);

        // Replace
        String replacedString = str1.replace("World", "Java");
        System.out.println("Replaced String: " + replacedString);

        // Convert to Uppercase
        String upperCaseString = str2.toUpperCase();
        System.out.println("Uppercase str2: " + upperCaseString);

        // Convert to Lowercase
        String lowerCaseString = str1.toLowerCase();
        System.out.println("Lowercase str1: " + lowerCaseString);

        // Trim
        String stringWithSpaces = " Trim me! ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");

        // Boolean checks
        boolean startsWithHello = str1.startsWith("Hello");
        boolean endsWithProgramming = str2.endsWith("Programming");
        System.out.println("str1 starts with 'Hello': " + startsWithHello);
        System.out.println("str2 ends with 'Programming': " + endsWithProgramming);

        // Character at index
        char charAtIndex5 = str1.charAt(5);
        System.out.println("Character at index 5 of str1: " + charAtIndex5);

        // Index of substring
        int indexOfJava = str2.indexOf("Java");
        System.out.println("Index of 'Java' in str2: " + indexOfJava);
    }
}
 



===========================================================================================




package basic;

public class Casting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        // byte -> short -> char -> int -> long -> float -> double
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Casting: int to double: " + doubleValue);

        // Explicit Casting (Narrowing)
        // double -> float -> long -> int -> char -> short -> byte
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Casting: double to int: " + anotherIntValue);

        // String to int conversion
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("String to int: " + parsedInt);

        // int to String conversion
        int num = 456;
        String intToString = Integer.toString(num);
        System.out.println("int to String: " + intToString);

        // String to double conversion
        String doubleString = "45.67";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("String to double: " + parsedDouble);

        // double to String conversion
        double dblNum = 89.01;
        String doubleToString = Double.toString(dblNum);
        System.out.println("double to String: " + doubleToString);
    }
}
 




===========================================================================================





package basic;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte age = scanner.nextByte();
        System.out.print("Your age is: " + age);

        String name = scanner.nextLine().trim().toLowerCase();
        System.out.print("Your name is: " + name);

        scanner.close();
    }
}
 



===========================================================================================





package basic;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Equal to
        System.out.println("a == b: " + (a == b));

        // Not equal to
        System.out.println("a != b: " + (a != b));

        // Greater than
        System.out.println("a > b: " + (a > b));

        // Less than
        System.out.println("a < b: " + (a < b));

        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b));

        // Less than or equal to
        System.out.println("a <= b: " + (a <= b));
    }
}
 






===========================================================================================







package basic;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND
        System.out.println("x && y: " + (x && y));

        // Logical OR
        System.out.println("x || y: " + (x || y));

        // Logical NOT
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        // Decision to approve a loan
        boolean isEligibleForLoan = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println("Is eligible for loan: " + isEligibleForLoan);
    }
}
 


===========================================================================================



package basic;

public class Operations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus: " + remainder);

        // Increment
        int c = a++;
        int d = ++b;

        System.out.println("Incremented a: " + a);
        System.out.println("Value of c (before increment): " + c);

        System.out.println("Incremented b: " + b);
        System.out.println("Value of d (after increment): " + d);

        // // Decrement
        b--;
        System.out.println("Decremented b: " + b);

        // Compound Assignment
        a += 5;
        System.out.println("a after compound assignment (a += 5): " + a);
        b *= 2;
        System.out.println("b after compound assignment (b *= 2): " + b);
    }
}
 








===========================================================================================








package basic;

public class IfElseStatements {
    public static void main(String[] args) {
        int number = 15;

        // If-Else statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // If-Else statement to check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
 




===========================================================================================





package basic;

public class ForLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Reverse loop from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
 

===========================================================================================


package basic;

public class ForEachLoop {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Use a for-each loop to iterate through the array and print each number
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int j = numbers.length; j > 0; j--) {
            System.out.println(numbers[j]);
        }
    }
}
 



===========================================================================================




package basic;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10 using a while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Example of a while loop that continues until a certain condition is met
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            System.out.print("Type 'exit' to quit: ");
            input = scanner.nextLine().toLowerCase().trim();
        }

        scanner.close();
    }
}
 




===========================================================================================







package basic;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10 using a do-while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
 




===================================================================================================OUTPUT TRACING========================================================================================================================================



Question 1.0

class Employee {
    static int count = 0;
    String name;
    double salary;

    Employee() {
        this("Unknown", 30000);
        System.out.println("Default constructor called");
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
        System.out.println("Parameterized constructor called for " + name);
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    float bonus;

    Manager(String name, double salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Manager constructor called for " + name);
    }

    void showDetails() {
        show();
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 50000, 5000f);
        Employee e1 = new Employee();
        Employee e2 = new Employee("Bob", 40000);
        m1.showDetails();
        e1.show();
        e2.show();
        System.out.println("Total Employees: " + Employee.count);
    }
}


===================================================================================================OUTPUT TRACING========================================================================================================================================



Question 2.0

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name.trim().toUpperCase();
        this.marks = marks;
        System.out.println("Student object created for " + this.name);
    }

    public void showResult() {
        System.out.println(name + " scored " + marks + " marks");
    }

    public static void main(String[] args) {
        Student[] list = new Student[3];
        list[0] = new Student("  alice ", 85);
        list[1] = new Student("Bob", 90);
        list[2] = new Student("cArOl", 78);

        for (int i = 0; i < list.length; i++) {
            String remark = (list[i].marks >= 80) ? "Passed" : "Needs Improvement";
            System.out.println(list[i].name.concat(" - ").concat(remark));
        }
    }
}
 



===================================================================================================OUTPUT TRACING========================================================================================================================================






Question 3.0

class Product {
    static int count = 0;
    String name;
    double price;

    Product() {
        this("Unknown", 100.0);
        System.out.println("Default Product Created");
    }

    Product(String name, double price) {
        this.name = name.toUpperCase();
        this.price = price;
        count++;
        System.out.println("Product Created: " + this.name);
    }

    void show() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    int warranty; // in years

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
        System.out.println("Electronics Item Added: " + name);
    }

    void display() {
        System.out.println(name.concat(" | Warranty: ").concat(warranty + " Years"));
    }

    public static void main(String[] args) {
        Electronics[] list = new Electronics[3];
        list[0] = new Electronics("Laptop", 75000, 2);
        list[1] = new Electronics("Mobile", 25000, 1);
        list[2] = new Electronics("TV", 50000, 3);

        for (int i = 0; i < list.length; i++) {
            list[i].display();
        }

        System.out.println("Total Products: " + Product.count);
    }
}



========================================================================================================================================================================================

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int totalWage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println("Total Wage: " + totalWage);
    }

}




=================================================================================================================================================================================


public class Methods {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        var methods = new Methods();
        int sum = methods.add(5, 10);
        System.out.println("The sum is: " + sum);
        // String newName = "Hello";
        // var name = new String("Hello");

    }
}

=================================================================================================================



public class UIControl {
    private boolean isEnabled = true; // Field

    public UIControl() {
        System.out.println("UIControl"); // Constructors
    }

    public void enable() { // Method
        isEnabled = true;
    }

    public void disable() { // Method
        isEnabled = false;
    }

    public boolean isEnabled() { // Method
        return isEnabled;
    }
}








======================================================================================================================


class BankAccount {
    // Private attributes
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Public getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance (only allows positive deposits)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        var account = new BankAccount("John Doe", 5000);

        // Using getter to access private data
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Modifying balance using setter method
        account.deposit(1500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to withdraw an amount
        account.withdraw(2000);
        System.out.println("Balance after Withdrawal: " + account.getBalance());
    }
}
 

==========================================================================================================================================





class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calls Animal's sound()
        a = new Dog();
        a.sound(); // Calls Dog's sound()
        a = new Cat();
        a.sound(); // Calls Cat's sound()
    }
}
 



============================================================================================================




class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int i) {
        id = i;
        name = "Not Assigned";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Rahim");

        s1.display();
        s2.display();
        s3.display();
    }
}








==========================================================================================







public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}




public class ArrayOfObject {
    public static void main(String[] args) {
        // Declare the Array
        Student[] students;

        // Allocate Memory for the Array
        students = new Student[3];

        // Initialize Objects and Assign to Array Elements
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Access and Manipulate Objects
        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }
}
 



=======================================================================================================


Question 1: 
class First {
 First() {
 System.out.println("Stay focused");
 }
 public void display() {
 String text = "Bright future";
 System.out.println(text.substring(7));
 }
}
class Second extends First {
 Second() {
 System.out.println("Move ahead");
 }
 public void display() {
 String item = "winner";
 System.out.println(item.toUpperCase());
 super.display();
 }
}
public class TraceTwo {
 public static void main(String[] args) {
 Second ob = new Second();
 String a[] = {"Cat", "DOG", "fish"};
 String b[] = {"cat", "dog", "FISH"};
 ob.display();
 for (int i = 0; i < 3; i++) {
 if (a[i].equalsIgnoreCase(b[i])) {
 System.out.println(a[i].toLowerCase());
 System.out.println(b[i].indexOf(b[i].charAt(0)));
 } else {
 System.out.println(a[i].substring(0, 1) + b[i].substring(1, 2));
 System.out.println(b[i].length());
 }
 }
 String x = a[2].toUpperCase();
 System.out.println(x.compareTo(b[2]));
 System.out.println(b[1].charAt(1));
 }
}
Solution: 
Stay focused
Move ahead
WINNER
future
cat
0
dog
0
fish
0
0
o

=========================================================================================



Question 2:
class A {
 A() {
 System.out.println("Learn more");
 }
 public void printData() {
 String s = "Knowledge";
 System.out.println(s.substring(0, 4));
 }
}
class B extends A {
 B() {
 System.out.println("Build skills");
 }
 public void printData() {
 String str = "coding";
 System.out.println(str.replace('o', 'a'));
 super.printData();
 }
}
public class TraceThree {
 public static void main(String[] args) {
 B obj = new B();
 String p[] = {"Sun", "Moon", "Star"};
 String q[] = {"sun", "Mars", "star"};
 obj.printData();
 for (int i = 0; i < 3; i++) {
 if (p[i].equalsIgnoreCase(q[i])) {
 System.out.println(p[i].toUpperCase());
 System.out.println(q[i].isEmpty());
 } else {
 System.out.println(p[i].substring(1));
 System.out.println(q[i].toUpperCase());
 }
 }
 String t = p[0].toLowerCase();
 System.out.println(q[0].compareToIgnoreCase(t));
 System.out.println(q[1].indexOf('r'));
 }
}
Solution:



===========================================================================================




Question 1.0
class Employee {
    static int count = 0;
    String name;
    double salary;

    Employee() {
        this("Unknown", 30000);
        System.out.println("Default constructor called");
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
        System.out.println("Parameterized constructor called for " + name);
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    float bonus;

    Manager(String name, double salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Manager constructor called for " + name);
    }

    void showDetails() {
        show();
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 50000, 5000f);
        Employee e1 = new Employee();
        Employee e2 = new Employee("Bob", 40000);
        m1.showDetails();
        e1.show();
        e2.show();
        System.out.println("Total Employees: " + Employee.count);
    }
}


1.OUTPUT:
Parameterized constructor called for Alice
Manager constructor called for Alice
Parameterized constructor called for Unknown
Default constructor called
Parameterized constructor called for Bob
Name: Alice, Salary: 50000.0
Bonus: 5000.0
Name: Unknown, Salary: 30000.0
Name: Bob, Salary: 40000.0
Total Employees: 3





===================================================================================================================

Question 2.0
public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name.trim().toUpperCase();
        this.marks = marks;
        System.out.println("Student object created for " + this.name);
    }

    public void showResult() {
        System.out.println(name + " scored " + marks + " marks");
    }

    public static void main(String[] args) {
        Student[] list = new Student[3];
        list[0] = new Student("  alice ", 85);
        list[1] = new Student("Bob", 90);
        list[2] = new Student("cArOl", 78);

        for (int i = 0; i < list.length; i++) {
            String remark = (list[i].marks >= 80) ? "Passed" : "Needs Improvement";
            System.out.println(list[i].name.concat(" - ").concat(remark));
        }
    }
}



2.OUTPUT:
Student object created for ALICE
Student object created for BOB
Student object created for CAROL
ALICE - Passed
BOB - Passed
CAROL - Needs Improvement







===========================================================================================================================




Question 3.0
class Product {
    static int count = 0;
    String name;
    double price;

    Product() {
        this("Unknown", 100.0);
        System.out.println("Default Product Created");
    }

    Product(String name, double price) {
        this.name = name.toUpperCase();
        this.price = price;
        count++;
        System.out.println("Product Created: " + this.name);
    }

    void show() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    int warranty; // in years

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
        System.out.println("Electronics Item Added: " + name);
    }

    void display() {
        System.out.println(name.concat(" | Warranty: ").concat(warranty + " Years"));
    }

    public static void main(String[] args) {
        Electronics[] list = new Electronics[3];
        list[0] = new Electronics("Laptop", 75000, 2);
        list[1] = new Electronics("Mobile", 25000, 1);
        list[2] = new Electronics("TV", 50000, 3);

        for (int i = 0; i < list.length; i++) {
            list[i].display();
        }

        System.out.println("Total Products: " + Product.count);
    }
}




3.OUTPUT:

Product Created: LAPTOP
Electronics Item Added: LAPTOP
Product Created: MOBILE
Electronics Item Added: MOBILE
Product Created: TV






===============================================end of code=====================================





