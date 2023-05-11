package com.example.operations.robot.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.operations.Robot;

public class MoveArmRobotTest {
	static Robot robot;
	
    @BeforeAll
    public static void setup() {
    	robot = new Robot();
    }
    
	@Test
	void when_moveArmRight_expect_messageRight_test() {
		// Arrange
		boolean isRight = true;

		// Action
		String result = robot.moveArm(isRight);

		// Assert
		Assertions.assertEquals("I move right arm", result);
	}
    
    @Test
    void when_moveArmLeft_expect_messageLeft_test() {
		boolean isRight = false;

		String result = robot.moveArm(isRight);

		Assertions.assertEquals("I move left arm", result);
    }
}
