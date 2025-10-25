package com.calculator;

/**
 * Unit tests for the Calculator class.
 * This is a simple test class without using JUnit to keep dependencies minimal.
 */
public class CalculatorTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Running Calculator Tests...\n");
        
        // Test Addition
        testAddition(calc);
        
        // Test Subtraction
        testSubtraction(calc);
        
        // Test Multiplication
        testMultiplication(calc);
        
        // Test Division
        testDivision(calc);
        
        // Test Modulo
        testModulo(calc);
        
        // Test Power
        testPower(calc);
        
        // Test Square Root
        testSquareRoot(calc);
        
        // Test Absolute Value
        testAbsoluteValue(calc);
        
        // Test Factorial
        testFactorial(calc);
        
        // Print results
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Test Results:");
        System.out.println("Tests Passed: " + testsPassed);
        System.out.println("Tests Failed: " + testsFailed);
        System.out.println("Total Tests: " + (testsPassed + testsFailed));
        System.out.println("=".repeat(50));
        
        if (testsFailed == 0) {
            System.out.println("All tests passed! ✓");
            System.exit(0);
        } else {
            System.out.println("Some tests failed! ✗");
            System.exit(1);
        }
    }
    
    private static void testAddition(Calculator calc) {
        System.out.println("Testing Addition:");
        assertEquals(5.0, calc.add(2, 3), "add(2, 3)");
        assertEquals(0.0, calc.add(-5, 5), "add(-5, 5)");
        assertEquals(-8.0, calc.add(-3, -5), "add(-3, -5)");
        assertEquals(7.5, calc.add(3.5, 4.0), "add(3.5, 4.0)");
        System.out.println();
    }
    
    private static void testSubtraction(Calculator calc) {
        System.out.println("Testing Subtraction:");
        assertEquals(3.0, calc.subtract(5, 2), "subtract(5, 2)");
        assertEquals(-10.0, calc.subtract(-5, 5), "subtract(-5, 5)");
        assertEquals(2.0, calc.subtract(-3, -5), "subtract(-3, -5)");
        assertEquals(-0.5, calc.subtract(3.5, 4.0), "subtract(3.5, 4.0)");
        System.out.println();
    }
    
    private static void testMultiplication(Calculator calc) {
        System.out.println("Testing Multiplication:");
        assertEquals(10.0, calc.multiply(2, 5), "multiply(2, 5)");
        assertEquals(-25.0, calc.multiply(-5, 5), "multiply(-5, 5)");
        assertEquals(15.0, calc.multiply(-3, -5), "multiply(-3, -5)");
        assertEquals(0.0, calc.multiply(5, 0), "multiply(5, 0)");
        assertEquals(14.0, calc.multiply(3.5, 4.0), "multiply(3.5, 4.0)");
        System.out.println();
    }
    
    private static void testDivision(Calculator calc) {
        System.out.println("Testing Division:");
        assertEquals(2.5, calc.divide(5, 2), "divide(5, 2)");
        assertEquals(-1.0, calc.divide(-5, 5), "divide(-5, 5)");
        assertEquals(0.6, calc.divide(-3, -5), "divide(-3, -5)");
        assertEquals(0.875, calc.divide(3.5, 4.0), "divide(3.5, 4.0)");
        
        // Test divide by zero
        try {
            calc.divide(5, 0);
            fail("divide(5, 0) should throw ArithmeticException");
        } catch (ArithmeticException e) {
            pass("divide(5, 0) correctly throws ArithmeticException");
        }
        System.out.println();
    }
    
    private static void testModulo(Calculator calc) {
        System.out.println("Testing Modulo:");
        assertEquals(1.0, calc.modulo(5, 2), "modulo(5, 2)");
        assertEquals(2.0, calc.modulo(5, 3), "modulo(5, 3)");
        assertEquals(0.0, calc.modulo(10, 5), "modulo(10, 5)");
        
        // Test modulo by zero
        try {
            calc.modulo(5, 0);
            fail("modulo(5, 0) should throw ArithmeticException");
        } catch (ArithmeticException e) {
            pass("modulo(5, 0) correctly throws ArithmeticException");
        }
        System.out.println();
    }
    
    private static void testPower(Calculator calc) {
        System.out.println("Testing Power:");
        assertEquals(8.0, calc.power(2, 3), "power(2, 3)");
        assertEquals(1.0, calc.power(5, 0), "power(5, 0)");
        assertEquals(0.25, calc.power(2, -2), "power(2, -2)");
        assertEquals(9.0, calc.power(3, 2), "power(3, 2)");
        System.out.println();
    }
    
    private static void testSquareRoot(Calculator calc) {
        System.out.println("Testing Square Root:");
        assertEquals(3.0, calc.sqrt(9), "sqrt(9)");
        assertEquals(5.0, calc.sqrt(25), "sqrt(25)");
        assertEquals(0.0, calc.sqrt(0), "sqrt(0)");
        assertEquals(10.0, calc.sqrt(100), "sqrt(100)");
        
        // Test sqrt of negative number
        try {
            calc.sqrt(-4);
            fail("sqrt(-4) should throw ArithmeticException");
        } catch (ArithmeticException e) {
            pass("sqrt(-4) correctly throws ArithmeticException");
        }
        System.out.println();
    }
    
    private static void testAbsoluteValue(Calculator calc) {
        System.out.println("Testing Absolute Value:");
        assertEquals(5.0, calc.abs(5), "abs(5)");
        assertEquals(5.0, calc.abs(-5), "abs(-5)");
        assertEquals(0.0, calc.abs(0), "abs(0)");
        assertEquals(3.5, calc.abs(-3.5), "abs(-3.5)");
        System.out.println();
    }
    
    private static void testFactorial(Calculator calc) {
        System.out.println("Testing Factorial:");
        assertEquals(1L, calc.factorial(0), "factorial(0)");
        assertEquals(1L, calc.factorial(1), "factorial(1)");
        assertEquals(120L, calc.factorial(5), "factorial(5)");
        assertEquals(720L, calc.factorial(6), "factorial(6)");
        assertEquals(3628800L, calc.factorial(10), "factorial(10)");
        
        // Test factorial of negative number
        try {
            calc.factorial(-5);
            fail("factorial(-5) should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            pass("factorial(-5) correctly throws IllegalArgumentException");
        }
        System.out.println();
    }
    
    private static void assertEquals(double expected, double actual, String testName) {
        if (Math.abs(expected - actual) < 0.0001) {
            pass(testName);
        } else {
            fail(testName + " - Expected: " + expected + ", Got: " + actual);
        }
    }
    
    private static void assertEquals(long expected, long actual, String testName) {
        if (expected == actual) {
            pass(testName);
        } else {
            fail(testName + " - Expected: " + expected + ", Got: " + actual);
        }
    }
    
    private static void pass(String testName) {
        System.out.println("  ✓ " + testName + " passed");
        testsPassed++;
    }
    
    private static void fail(String message) {
        System.out.println("  ✗ " + message + " FAILED");
        testsFailed++;
    }
}
