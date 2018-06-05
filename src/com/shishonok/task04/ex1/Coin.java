package com.shishonok.task04.ex1;

import java.util.Random;

/**
 * Enum presents a coin with two states.
 * 
 * @version 1 30.05.2018
 * @author Alexander Shishonok
 */
public enum Coin {
	
	HEAD, TAIL;
	
	/**
	 * Toss a coin.
	 * @return 
	 */
	public static Coin tossCoin() {
		return new Random().nextBoolean() ? Coin.HEAD : Coin.TAIL;
	}
}
