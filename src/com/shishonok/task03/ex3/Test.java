package com.shishonok.task03.ex3;

import com.shishonok.task03.ex1.View;

/**
 * Tests for Alphabet.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute(char ch) {
		View.println("-----Method1-----");
		View.println(Alphabet.isVowel1(ch));
		View.println("-----Method2-----");
		View.println(Alphabet.isVowel2(ch));
		View.println("-----Method3-----");
		View.println(Alphabet.isVowel3(ch));
		View.println("-----Method4-----");
		View.println(Alphabet.isVowel4(ch));
		View.println("-----Method5-----");
		View.println(Alphabet.isVowel5(ch));
		View.println("-----Method6-----");
		View.println(Alphabet.isVowel6(ch));
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute('R');
		Test.execute('A');
		Test.execute('w');
		Test.execute('i');
		Test.execute('+');
		Test.execute('$');
		Test.execute('Y');
	}
}