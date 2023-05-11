package com.example.operations.robot.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.operations.Robot;

public class MoveLegRobotTest {
	static Robot robot;
	
    @BeforeAll
    public static void setup() {
    	robot = new Robot();
    }
    
    @Test
    void when_moveLegRight_expect_messageRight_test() {
		boolean isRight = true;

		String result = robot.moveLeg(isRight);

		Assertions.assertEquals("I move right leg", result);
    }
    
    @Test
    void when_moveLegLeft_expect_messageLeft_test() {
		boolean isRight = false;

		String result = robot.moveLeg(isRight);

		Assertions.assertEquals("I move left leg", result);
    }
}
