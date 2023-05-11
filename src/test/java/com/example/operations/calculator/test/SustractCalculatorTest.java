package com.example.operations.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.operations.Calculator;

public class SustractCalculatorTest {
	static Calculator calculator;
	
    @BeforeAll
    public static void setup() {
    	calculator = new Calculator();
    }
    
    @Test
    void when_sustractNumbers_expect_intNumber_test() {
    	int a = 9;
    	int b = 3;
    	
    	int result = calculator.sustract(a, b);
    	
    	assertEquals(6, result);
    }
}
