package com.shishonok.task03.ex4;

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
			View.printf("At this moment user has a %s mood.\n", MoodSensor.check());
		}
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute();
	}
}