package com.shishonok.task03.ex3;

/**
 * Class provide methods for working with Alphabet.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Alphabet {
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel1(char ch) {
		String result;
		switch (Character.toLowerCase(ch)) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o':
			case 'u':
			case 'y': result = ch + " is vowel"; break;
			default : result = ch + " is not vowel";
		}
		return result;
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel2(char ch) {
		String result = ch + " is not vowel";
		char ch1 = Character.toLowerCase(ch);
		if (ch1 == 'a') {
			result = ch + " is vowel";
		} else if (ch1 == 'e') {
			result = ch1 + " is vowel";
		} else if (ch1 == 'i') {
			result = ch + " is vowel";
		} else if (ch1 == 'o') {
			result = ch + " is vowel";
		} else if (ch1 == 'u') {
			result = ch + " is vowel";
		} else if (ch1 == 'y') {
			result = ch + " is vowel";
		} 
		return result;
	}

	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel3(char ch) {
		char ch1 = Character.toLowerCase(ch);
		return (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'
				|| ch1 == 'y') ? ch + " is vowel" : ch + " is not vowel";
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel4(char ch) {
		return "AaEeIiOoUuYy".contains(ch + "") ? ch + " is vowel"
				: ch + " is not vowel";
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel5(char ch) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y' , 'A', 'E', 'I', 'O', 'U', 'Y'};
		for (char c : vowels) {
			if (c == ch) {
				return ch + " is vowel";
			}
		}
		return ch + " is not vowel";
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel6(char ch) {
		return "AaEeIiOoUuYy".indexOf(ch) != -1 ? ch + " is vowel" : ch + " is not vowel";
	}
}
