package com.shishonok.task04.ex3;

import com.shishonok.task03.ex1.View;

/**
 * Tests for PerfectNumber.
 * 
 * @version		1	30.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute(long n) {
		View.printf("Is %d perfect number ? - %b\n", n, PerfectNumber.isPerfectNumber(n));
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute(6);
		Test.execute(28);
		Test.execute(496);
		Test.execute(8128);
		Test.execute(33550336);
		Test.execute(8589869056L);
		Test.execute(137438691328L);
		Test.execute(2305843008139952128L);
		Test.execute(2434);
		Test.execute(22);
		Test.execute(33550335);
		Test.execute(137438691322L);
		Test.execute(2305843008139952127L);
	}
}