package com.calculator;

/**
 * A simple calculator class that performs basic and advanced mathematical operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from first number.
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides first number by second number.
     * @param a First number (dividend)
     * @param b Second number (divisor)
     * @return Quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    /**
     * Calculates the modulo (remainder) of division.
     * @param a First number (dividend)
     * @param b Second number (divisor)
     * @return Remainder of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulo with zero divisor");
        }
        return a % b;
    }
    
    /**
     * Calculates power of a number.
     * @param base Base number
     * @param exponent Exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    /**
     * Calculates square root of a number.
     * @param a Number to find square root of
     * @return Square root of a
     * @throws ArithmeticException if a is negative
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(a);
    }
    
    /**
     * Calculates the absolute value of a number.
     * @param a Number
     * @return Absolute value of a
     */
    public double abs(double a) {
        return Math.abs(a);
    }
    
    /**
     * Calculates the factorial of a non-negative integer.
     * @param n Non-negative integer
     * @return Factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of negative number");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
