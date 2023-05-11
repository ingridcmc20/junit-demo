package com.example.operations;

public class Robot {
	public String moveHead() {
		return "I move head";
	}

	public String moveArm(boolean isRight) {
		if (isRight) {
			return "I move right arm";
		} else {
			return "I move left arm";
		}
	}

	public String moveLeg(boolean isRight) {
		if (isRight) {
			return "I move right leg";
		} else {
			return "I move left leg";
		}
	}
}
