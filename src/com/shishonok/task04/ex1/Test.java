package com.shishonok.task04.ex1;

import com.shishonok.task03.ex1.View;

/**
 * Tests for HeadsOrTails.
 * 
 * @version		1	30.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute(int n) {
		int heads = HeadsOrTails.countHeads(n);
		View.printf("Toss a coin %d times: heads - %d and tails - %d\n", n, heads, n - heads);
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute(1000);
		Test.execute(1000000);
	}
}