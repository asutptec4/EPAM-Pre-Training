package com.shishonok.task03.ex5;

/**
 * Class provide methods for working with Gregorian calendar.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class GregorianCalendar {

	/**
	 * Check if year is leap. Method return false if year is negative.
	 * @param year checked year
	 * @return true if year is leap
	 */
	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year > 0) {
			if (year % 4 == 0) {
				isLeap = true;
				if (year % 100 == 0) {
					if (year % 400 != 0) {
						isLeap = false;
					}
				}
			}
		}
		return isLeap;
	}
	
	/**
	 * Evaluate next day after input date.
	 * @param d	input day
	 * @param m input month
	 * @param y input year
	 * @return
	 */
	public static String evalNextDay(int d, int m, int y) {
		String result = "Wrong initial date";
		
		if (y > 0) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d >= 1 && d <= 31) {
					result = increaseDay(31, d, m, y);
				}
			} else if (m == 4 || m == 6  || m == 9 || m == 11) {
				if (d >= 1 && d <= 30) {
					result = increaseDay(30, d, m, y);
					}
			} else if (m == 2) {
				if (isLeapYear(y)) {
					if (d >= 1 && d <= 29) {
						result = increaseDay(29, d, m, y);
					}
				} else {
					if (d >= 1 && d <= 28) {
						result = increaseDay(28, d, m, y);
					}
				}
			}	
		} 
		return result;
	}
	
	/** 
	 * Format input date to string
	 * @param d day
	 * @param m month
	 * @param y	year
	 * @return formated string of date
	 */
	public static String formatDate(int d, int m, int y) {
		return d + "." + m + "." + y;
	}
	
	/**
	 * Increase date by 1 day. 
	 * @param max max day in current month
	 * @param d current day
	 * @param m current month
	 * @param y current year
	 * @return next day after current
	 */
	public static String increaseDay(int max, int d, int m, int y) {
		String res;
		if (d != max) {
			d += 1;
			res = formatDate(d, m, y);
		} else {
			d = 1;
			if (m != 12) {
				m += 1;
				res = formatDate(d, m, y);
			} else {
				m = 1;
				y = y + 1;
				res = formatDate(d, m, y);
			}
		}
		return res;
	}
}
