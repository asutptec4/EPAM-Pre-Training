package com.shishonok.task07.view;

/**
 * Display data to user by console.
 * 
 * @version		1	16.06.2018
 * @author Alexander Shishonok
 */
public class View {
	/**
	 * Print message to console
	 * @param msg object of message
	 */
	public static void println(Object msg) {
		System.out.println(msg);
	}
	
	/**
	 * Print format message to console
	 * @param str formatted string
	 * @param msg object of message
	 */
	public static void printf(String str, Object ... msg) {
		System.out.printf(str, msg);
	}
}
