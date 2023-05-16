package com.example.operations.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.operations.Calculator;

public class DivideCalculatorTest {
	static Calculator calculator;
	
    @BeforeAll
    public static void setup() {
    	calculator = new Calculator();
    }
    
    @Test
    void When_dividendIsNineAndDivisorIsThree_Then_quotientIsThree() {
        // Arrange
    	int dividend = 9;
    	int divisor = 3;
        int expectedQuotient = 3;
    	
	    // Action
    	int quotient = calculator.divide(a, b);
    	
	    // Assertion
    	assertEquals(expectedQuotient, quotient);
    }
    
    @Test
    void When_divisorIsCero_Then_arithmeticException() {
        //Arrange
        String expectedMessage = "/ by zero";
        
    	Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
        	int dividend = 9;
        	int divisor = 0;

            //Action
        	calculator.divide(dividend, divisor);
        });
    	
        String actualMessage = exception.getMessage();
    	
        //Assertion
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
