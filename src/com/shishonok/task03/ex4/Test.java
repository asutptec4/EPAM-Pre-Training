package com.shishonok.task03.ex4;

import java.util.Random;

import com.shishonok.task03.ex1.View;

/**
 * Tests for MoodSensor.
 * 
 * @version 1 29.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute() {
		for (int i = 0; i < 10; i++) {
			View.printf("At this moment user has a %s mood.\n", MoodSensor.check(generateRandInt( MoodSensor.LEVEL_MIN, MoodSensor.LEVEL_MAX)));
		}
		// Test out of bounds value
		View.printf("At this moment user has a %s mood.\n", MoodSensor.check(-1));
		View.printf("At this moment user has a %s mood.\n", MoodSensor.check(19));
	}

	public static int generateRandInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute();
	}
}