package com.shishonok.task03.ex2;

/**
 * Thrown when age is not legal.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class DragonAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public DragonAgeException() {
		super();
	}

	public DragonAgeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DragonAgeException(String arg0) {
		super(arg0);
	}

	public DragonAgeException(Throwable arg0) {
		super(arg0);
	}
	
}
