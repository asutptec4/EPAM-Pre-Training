package com.shishonok.task04.ex1;

/**
 * HeadsOrTails emulator. 
 * 
 * @version 1 30.05.2018
 * @author Alexander Shishonok
 */
public class HeadsOrTails {
	
	
	/**
	 * Count heads and tails when a coin tossed n times
	 * @param n number of coin tosses
	 * @return string with 
	 */
	public static String countHeadsAndTails(int n) {
		int heads = HeadsOrTails.countHeads(n);
		return "heads - " + heads + " and tail - " + (n - heads);
	}
	
	/**
	 * Count heads when a coin tossed n times
	 * @param n number of coin tosses
	 * @return count of heads 
	 */
	public static int countHeads(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (Coin.tossCoin().equals(Coin.HEAD)) {
				count++;
			}
		}
		return count;
	}
	
}
