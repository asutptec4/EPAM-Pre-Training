package com.shishonok.task03.ex5;

import com.shishonok.task03.ex1.View;

/**
 * Tests for GregorianCalendar.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute(int d, int m, int y) {
		View.printf("For date %s result:\n", GregorianCalendar.formatDate(d, m, y));
		View.printf("Next day is - %s\n", GregorianCalendar.evalNextDay(d, m, y) );
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute(12, 48, 2008);
		Test.execute(12, 4, -1700);
		Test.execute(54, 2, 1600);
		Test.execute(21, 1, 2012);
		Test.execute(4, 5, 2000);
		Test.execute(8, 3, 1900);
		Test.execute(28, 2, 2016);
		Test.execute(29, 2, 2016);
		Test.execute(30, 2, 2016);
		Test.execute(31, 1, 2016);
		Test.execute(28, 2, 2015);
		Test.execute(31, 12, 2017);
		Test.execute(28, 2, 2018);
		Test.execute(29, 5, 2018);
	}
}