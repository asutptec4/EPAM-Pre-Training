package com.shishonok.task01;

/**
 * Class represent User type for DataTypeTester
 * @author Alexander Shishonok
 *
 */
public class Student {

	public String name;
	public int mark;
	
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	
}
