package com.shishonok.task03.ex4;

/**
 * Class can determine the mood of the user.
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class MoodSensor {
	
	public static final int LEVEL_MAX = 18;
	public static final int LEVEL_5 = 15;
	public static final int LEVEL_4 = 12;
	public static final int LEVEL_3 = 9;
	public static final int LEVEL_2 = 6;
	public static final int LEVEL_1 = 3;
	public static final int LEVEL_MIN = 0;

	/**
	 * Determine user's mood in the current moment of time.
	 * @param n level of mood
	 * @return return a string describing the mood
	 */
	public static String check(int n) {
		String result = "*dont know*";
		if (n >= LEVEL_MIN && n < LEVEL_1 ) {
			result = "awful";
		} else if (n >= LEVEL_1 && n < LEVEL_2) {
			result = "bad";
		} else if (n >= LEVEL_2 && n < LEVEL_3) {
			result = "not bad";
		} else if (n >= LEVEL_3 && n < LEVEL_4) {
			result = "good";
		} else if (n >= LEVEL_4 && n < LEVEL_5) {
			result = "very good";
		} else if (n >= LEVEL_5 && n <= LEVEL_MAX) {
			result = "excellent";
		}
		return result;
	}
}
