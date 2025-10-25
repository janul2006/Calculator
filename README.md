# Simple Java Calculator

A command-line calculator application built using Java for learning basic Java programming concepts. This calculator supports a wide range of mathematical operations.

## Features

The calculator supports the following operations:

- **Basic Operations:**
  - Addition (+)
  - Subtraction (-)
  - Multiplication (*)
  - Division (/)
  
- **Advanced Operations:**
  - Modulo (%)
  - Power (^)
  - Square Root (√)
  - Absolute Value (|x|)
  - Factorial (!)

## Project Structure

```
Calculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── calculator/
│   │               ├── Calculator.java       # Core calculator logic
│   │               └── CalculatorApp.java    # CLI interface
│   └── test/
│       └── java/
│           └── com/
│               └── calculator/
│                   └── CalculatorTest.java   # Unit tests
├── .gitignore
└── README.md
```

## How to Build and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Compile the Application

```bash
# Navigate to the project directory
cd Calculator

# Compile all Java files
javac -d . src/main/java/com/calculator/*.java
```

### Run the Calculator

```bash
# Run the calculator application
java com.calculator.CalculatorApp
```

### Run Tests

```bash
# Compile test files
javac -d . src/test/java/com/calculator/*.java src/main/java/com/calculator/*.java

# Run tests
java com.calculator.CalculatorTest
```

## Usage

When you run the calculator, you'll see a menu with available operations. Follow these steps:

1. Select an operation by entering its corresponding number
2. Enter the required number(s) when prompted
3. View the result
4. Continue with more calculations or exit by entering 0

### Example Session

```
===========================================
    Welcome to Simple Java Calculator!
===========================================

-------------------------------------------
Available Operations:
-------------------------------------------
1.  Addition (+)
2.  Subtraction (-)
3.  Multiplication (*)
4.  Division (/)
5.  Modulo (%)
6.  Power (^)
7.  Square Root (√)
8.  Absolute Value (|x|)
9.  Factorial (!)
0.  Exit
-------------------------------------------
Enter your choice: 1
Enter first number: 15
Enter second number: 25
Result: 15.0 + 25.0 = 40.0
```

## Error Handling

The calculator includes robust error handling for:
- Division by zero
- Square root of negative numbers
- Factorial of negative numbers
- Invalid input types

## Learning Objectives

This project demonstrates:
- Object-Oriented Programming (OOP) in Java
- Exception handling
- User input validation
- Command-line interface development
- Unit testing
- Code documentation with Javadoc comments

## License

This project is open source and available for learning purposes. 
