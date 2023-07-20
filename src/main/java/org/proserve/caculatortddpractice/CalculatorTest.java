package org.proserve.caculatortddpractice;

public class CalculatorTest {

    public static void test() {
        // create an instance of Calculator
        Calculator calculator = new Calculator();

        // testing add method
        int resultAdd = calculator.add(2, 3);
        if (resultAdd != 5) {
            System.out.println("Test for add method failed");
        } else {
            System.out.println("Test for add method passed");
        }

        // testing subtract method
        int resultSubtract = calculator.subtract(2, 1);
        if (resultSubtract != 1) {
            System.out.println("Test for subtract method failed");
        } else {
            System.out.println("Test for subtract method passed");
        }

        // testing multiply method
        int resultMultiply = calculator.multiply(2, 3);
        if (resultMultiply != 6) {
            System.out.println("Test for multiply method failed");
        } else {
            System.out.println("Test for multiply method passed");
        }

        // testing divide method
        try {
            int resultDivide = calculator.divide(6, 2);
            if (resultDivide != 3) {
                System.out.println("Test for divide method failed");
            } else {
                System.out.println("Test for divide method passed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

