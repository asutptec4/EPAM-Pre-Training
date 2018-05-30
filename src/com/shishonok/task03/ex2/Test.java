package com.shishonok.task03.ex2;

import com.shishonok.task03.ex1.View;

/**
 * Tests for DragonHeadCounter
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Test {	
	public static void execute(int age) {
		View.println("Test for age " + age + ":");
		try {
			View.printf("Dragon after %d years have %d heads and %d eyes\n",
					age, DragonHeadCounter.evalHeads(age), DragonHeadCounter.evalEyes(DragonHeadCounter.evalHeads(age)));
		} catch (DragonAgeException e) {
			View.println(e.getMessage());
		}
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute(0);
		Test.execute(532);
		Test.execute(-35);
		Test.execute(234);
		Test.execute(100);
	}
}