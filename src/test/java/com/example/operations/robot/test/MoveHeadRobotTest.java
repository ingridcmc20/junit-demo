package com.example.operations.robot.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.operations.Robot;

public class MoveHeadRobotTest {
	static Robot robot;
	
    @BeforeAll
    public static void setup() {
    	robot = new Robot();
    }
    
    @Test
    void when_moveHead_expect_messageHead_test() {
		String result = robot.moveHead();

		Assertions.assertEquals("I move head", result);
    }
}
