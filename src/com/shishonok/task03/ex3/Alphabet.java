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
		switch (ch) {
			case 'A':
			case 'a': 
			case 'E':
			case 'e': 
			case 'I':
			case 'i': 
			case 'O':
			case 'o': 
			case 'Y':
			case 'y': result = ch + " is vowel"; break;
			default : result = ch + " is not vowel"; break;
		}
		return result;
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel2(char ch) {
		String result;
		if (ch == 'A') {
			result = ch + " is vowel";;
		} else if (ch == 'a') {
			result = ch + " is vowel";
		} else if (ch == 'E') {
			result = ch + " is vowel";
		} else if (ch == 'e') {
			result = ch + " is vowel";
		} else if (ch == 'I') {
			result = ch + " is vowel";
		} else if (ch == 'i') {
			result = ch + " is vowel";
		} else if (ch == 'O') {
			result = ch + " is vowel";
		} else if (ch == 'o') {
			result = ch + " is vowel";
		} else if (ch == 'Y') {
			result = ch + " is vowel";
		} else if (ch == 'y') {
			result = ch + " is vowel";
		} else {
			result = ch + " is not vowel";
		}
		return result;
	}

	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel3(char ch) {
		return (ch == 'A' || ch == 'e' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O'
				|| ch == 'o' || ch == 'Y' || ch == 'y')? ch + " is vowel" : ch + " is not vowel";
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel4(char ch) {
		if (ch != 'A') {
			if (ch != 'a') {
				if (ch != 'E') {
					if (ch != 'e') {
						if (ch != 'I') {
							if (ch != 'i') {
								if (ch != 'O') {
									if (ch != 'o') {
										if (ch != 'Y') {
											if (ch != 'y') {
												return ch + " is not vowel";
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return ch + " is vowel";
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel5(char ch) {
		String result;
		if (ch == 'A') {
			result = ch + " is vowel";
		} else {
			if (ch == 'a') {
				result = ch + " is vowel";
			} else {
				if (ch == 'E') {
					result = ch + " is vowel";
				} else {
					if (ch == 'e') {
						result = ch + " is vowel";
					} else {
						if (ch == 'I') {
							result = ch + " is vowel";
						} else {
							if (ch == 'i') {
								result = ch + " is vowel";
							} else {
								if (ch == 'O') {
									result = ch + " is vowel";
								} else {
									if (ch == 'o') {
										result = ch + " is vowel";
									} else {
										if (ch == 'Y') {
											result = ch + " is vowel";
										} else {
											if (ch == 'y') {
												result = ch + " is vowel";
											} else {
												return result = ch + " is not vowel";
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Determine if input letter is vowel
	 * @param ch input letter
	 * @return true if vowel
	 */
	public static String isVowel6(char ch) {
		String result;
		switch (ch) {
			case 'A': result = ch + " is vowel"; break;
			case 'a': result = ch + " is vowel"; break;
			case 'E': result = ch + " is vowel"; break;
			case 'e': result = ch + " is vowel"; break;
			case 'I': result = ch + " is vowel"; break;
			case 'i': result = ch + " is vowel"; break;
			case 'O': result = ch + " is vowel"; break;
			case 'o': result = ch + " is vowel"; break;
			case 'Y': result = ch + " is vowel"; break;
			case 'y': result = ch + " is vowel"; break;
			default : result = ch + " is not vowel"; break;
		}
		return result;
	}
}
