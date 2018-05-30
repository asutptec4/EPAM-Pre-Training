package com.shishonok.task03.ex2;

/**
 * Class has static methods that calculates how many heads and eyes dragon has.
 * 
 * @version		1	29.05.2018
 * @author STM
 */
public class DragonHeadCounter {
	// Initial data for heads growing
	public static final int EYE_PER_HEAD = 2;
	public static final int FIRST_BORDER = 200;
	public static final int SECOND_BORDER = 300;
	public static final int HEADS_BEFORE_FB = 3;
	public static final int HEADS_BETWEEN_FB_SB = 2;
	public static final int HEADS_AFTER_SB = 1;
	public static final int INIT_HEADS = 3;
	
	/**
	 * Evaluate number of dragon's head after n age.
	 * @param dragon's age
	 * @return number of heads
	 */
	public static int evalHeads(int age) throws DragonAgeException {
		int numHead, delta;
		
		if (age < 0) {
			throw new DragonAgeException("Dragon is not yet born");
		}
		
		if (age > SECOND_BORDER) {
			delta = age - SECOND_BORDER;
			numHead = INIT_HEADS + FIRST_BORDER * HEADS_BEFORE_FB
					+ (SECOND_BORDER - FIRST_BORDER) * HEADS_BETWEEN_FB_SB + delta * HEADS_AFTER_SB ; 
		} else if (age > FIRST_BORDER) {
			delta = age - FIRST_BORDER;
			numHead = INIT_HEADS + FIRST_BORDER * HEADS_BEFORE_FB + delta * HEADS_BETWEEN_FB_SB;
		} else {
			numHead = INIT_HEADS + age * HEADS_BEFORE_FB;
		}
		
		return numHead;
	}
	
	/**
	 * Evaluate number of dragon's eyes
	 * @param n number of dragon's heads
	 * @return number of eyes
	 */
	public static int evalEyes (int n) {
		return EYE_PER_HEAD * n;
	}
}
