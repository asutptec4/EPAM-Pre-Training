package com.shishonok.task04.ex1;

import java.util.Random;

/**
 * HeadsOrTails emulator. 
 * 
 * @version 1 30.05.2018
 * @author Alexander Shishonok
 */
public class HeadsOrTails {
	
	/**
	 * Count heads when a coin tossed n times
	 * @param n number of coin tosses
	 * @return count of heads 
	 */
	public static int countHeads(int n) {
		int count = 0;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			if (rand.nextBoolean()) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Count heads and tails when a coin tossed n times
	 * @param n number of coin tosses
	 * @return string "count_of_heads / count_of_tails" 
	 */
	public static String countHeadsAndTails(int n) {
		int heads = countHeads(n);
		return heads + " / " + (n - heads);
	}
}
