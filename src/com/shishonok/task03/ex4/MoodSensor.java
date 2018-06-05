package com.shishonok.task03.ex4;

import java.util.Random;

/**
 * Class can determine the mood of the user.
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class MoodSensor {
	
	public static final int LEVEL_EXC = 4;
	public static final String LEVEL_EXC_TEXT = "excellent";
	public static final int LEVEL_GOOD = 3;
	public static final String LEVEL_GOOD_TEXT = "good";
	public static final int LEVEL_NB = 2;
	public static final String LEVEL_NB_TEXT = "not bad";
	public static final int LEVEL_BAD = 1;
	public static final String LEVEL_BAD_TEXT = "bad";
	public static final int LEVEL_AWFUL = 0;
	public static final String LEVEL_AWFUL_TEXT = "awful";

	/**
	 * Determine user's mood in the current moment of time.
	 * @param n level of mood
	 * @return return a string describing the mood
	 */
	public static String check() {
		String result;
		switch (new Random().nextInt(5)) {
		case LEVEL_AWFUL:
			result = LEVEL_AWFUL_TEXT;
			break;
		case LEVEL_BAD:
			result = LEVEL_BAD_TEXT;
			break;
		case LEVEL_NB:
			result = LEVEL_NB_TEXT;
			break;
		case LEVEL_GOOD:
			result = LEVEL_GOOD_TEXT;
			break;
		case LEVEL_EXC:
			result = LEVEL_EXC_TEXT;
			break;
		default:
			result = LEVEL_EXC_TEXT;
			break;
		}
		return result;
	}
}
