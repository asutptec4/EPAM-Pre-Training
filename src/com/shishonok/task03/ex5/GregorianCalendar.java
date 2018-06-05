package com.shishonok.task03.ex5;

/**
 * Class provide methods for working with Gregorian calendar.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class GregorianCalendar {
	
	public static final int JAN = 1;
	public static final int FEB = 2;
	public static final int MAR = 3;
	public static final int APR = 4;
	public static final int MAY = 5;
	public static final int JUN = 6;
	public static final int JUL = 7;
	public static final int AUG = 8;
	public static final int SEP = 9;
	public static final int OCT = 10;
	public static final int NOV = 11;
	public static final int DEC = 12;
	
	/**
	 * Check if year is leap. Method return false if year is negative.
	 * @param year checked year
	 * @return true if year is leap
	 */
	public static boolean isLeapYear(int y) {
		return y >= 0 && y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
		
	}
	
	/**
	 * Evaluate next day after input date.
	 * @param d	input day
	 * @param m input month
	 * @param y input year
	 * @return
	 */
	public static String evalNextDay(int d, int m, int y) {
		return y > 0 && m >= JAN && m <= DEC && d >= 1 && d <= maxDayInMonth(m, y)
				? increaseDay(d, m, y) : "Wrong initial date";
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
	public static String increaseDay(int d, int m, int y) {
		if (d != maxDayInMonth(m, y)) {
			d++;
		} else {
			d = 1;
			if (m != DEC) {
				m++;
			} else {
				m = JAN;
				y++;
			}
		}
		return formatDate(d, m, y);
	}
	
	/**
	 * Return max day in current month.
	 * @param m current month
	 * @param y current year
	 * @return max day
	 */
	public static int maxDayInMonth(int m, int y) {
		int maxDay;
		switch (m) {
		case JAN:
		case MAR:
		case MAY:
		case JUL:
		case AUG:
		case OCT:
		case DEC:
			maxDay = 31;
			break;
		case APR:
		case JUN:
		case SEP:
		case NOV:
			maxDay = 30;
			break;
		case FEB:
			maxDay = isLeapYear(y) ? 29 : 28;
			break;
		default:
			maxDay = 0;
		}
		return maxDay;
	}
}
