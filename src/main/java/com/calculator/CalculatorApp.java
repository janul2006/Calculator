package com.calculator;

import java.util.Scanner;

/**
 * Main class that provides a command-line interface for the calculator.
 */
public class CalculatorApp {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // print a welcome message
        System.out.println("===========================================");
        System.out.println("    Welcome to Simple Java Calculator!");
        System.out.println("===========================================");
        int cont = 2;
        
        while (running) {
            int choice;

            double num1, num2, result;



            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            
            try {
                if (cont == 0) {
                    running = false;
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;
                }



                switch (choice) {
                    case 1: // Addition
                        result = calc.add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                        
                    case 2: // Subtraction
                        result = calc.subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                        
                    case 3: // Multiplication
                        result = calc.multiply(num1, num2);
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                        
                    case 4: // Division
                        try {
                            result = calc.divide(num1, num2);
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 5: // Modulo
                        try {
                            result = calc.modulo(num1, num2);
                            System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 6: // Power
                        result = calc.power(num1, num2);
                        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                        break;
                        
                    case 7: // Square Root
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        try {
                            result = calc.sqrt(num1);
                            System.out.println("Result: √" + num1 + " = " + result);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 8: // Absolute Value
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        result = calc.abs(num1);
                        System.out.println("Result: |" + num1 + "| = " + result);
                        break;
                        
                    case 9: // Factorial
                        System.out.print("Enter a non-negative integer: ");
                        int n = scanner.nextInt();
                        try {
                            long factResult = calc.factorial(n);
                            System.out.println("Result: " + n + "! = " + factResult);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please select a valid operation.");
                        break;
                }
                
                System.out.println();
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
                System.out.println();
            }
            System.out.print("Do you want to continue? (1 for Yes / 0 for No): ");
            cont = scanner.nextInt();
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n-------------------------------------------");
        System.out.println("Available Operations:");
        System.out.println("-------------------------------------------");
        System.out.println("1.  Addition (+)");
        System.out.println("2.  Subtraction (-)");
        System.out.println("3.  Multiplication (*)");
        System.out.println("4.  Division (/)");
        System.out.println("5.  Modulo (%)");
        System.out.println("6.  Power (^)");
        System.out.println("7.  Square Root (√)");
        System.out.println("8.  Absolute Value (|x|)");
        System.out.println("9.  Factorial (!)");
        System.out.println("0.  Exit");
        System.out.println("-------------------------------------------");
    }
}
