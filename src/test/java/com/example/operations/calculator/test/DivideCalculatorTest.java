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
    void when_divideIntNumbers_expect_intNumber_test() {
    	int a = 9;
    	int b = 3;
    	
    	int result = calculator.divide(a, b);
    	
    	assertEquals(3, result);
    }
    
    @Test
    void when_divideIntNumberWithZero_expect_error_test() {
        String expectedMessage = "/ by zero";
        
    	Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
        	int a = 9;
        	int b = 0;
        	calculator.divide(a, b);
        });
    	
        String actualMessage = exception.getMessage();
    	
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
