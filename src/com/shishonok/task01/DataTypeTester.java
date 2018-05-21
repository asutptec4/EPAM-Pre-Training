package com.shishonok.task01;

/** 
 * This class define method for testing data types in java
 * @author Alexander Shishonok
 *
 */
public class DataTypeTester {
	
	private static final String ERROR_COMP_STR = "Compilation error: operator undefined for the argument type";
	private static final String ERROR_CAST_STR = "Compilation error: cannot cast";
	
	/**
	 * Tests for Byte type
	 */
	public static void testByte() {
		byte a = 7, b = 4, c;
		System.out.println("\nTests for Byte");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = (byte) (a + b);
		System.out.printf("%d + %d = %s\n", a, b, c);
		c = (byte) (a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = (byte) (a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		c = (byte) (a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		c = (byte) (a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		try {
			c = (byte) (a / 0);
		} catch (Exception e) {
			System.out.printf("%d / 0 = %s\n", a,e.getClass());
		}
		try {
			c = (byte) (a % 0);
		} catch (Exception e) {
			System.out.printf("%d %% 0 = %s\n", a,e.getClass());
		}
		c = (byte) -a;
		System.out.printf("-%d = %d\n", a, c);
		c = (byte) +a;
		System.out.printf("+%d = %d\n", a, c);
		System.out.printf("%d++ = %d\n", a, a++);
		a = 7;
		System.out.printf("++%d = %d\n", a, ++a);
		a = 7;
		System.out.printf("%d-- = %d\n", a, a--);
		a = 7;
		System.out.printf("--%d = %d\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7;
		c = (byte) ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (byte) (a & b);
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) (a | b);
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) (a << 1);
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (byte) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (byte) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (byte) (~a >> 1);
		System.out.printf("%d >> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		c = (byte) (~a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%d == %d -> %b\n", a, b, a == b);
		System.out.printf("%d != %d -> %b\n", a, b, a != b);
		System.out.printf("%d < %d -> %b\n", a, b, a < b);
		System.out.printf("%d > %d -> %b\n", a, b, a > b);
		System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
		System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
		System.out.printf("!%d -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%d && %d -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%d || %d -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7;
		System.out.printf("%d += %d -> %d\n", a, b, a += b);
		a = 7;
		System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
		a = 7;
		System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
		a = 7;
		System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
		a = 7;
		System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
		a = 7;
		System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
		a = 7;
		System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
		a = 7;
		System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
		a = 7;
		System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
		a = 7;
		System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
		a = 7;
		System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = 7;
		System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 100;
		System.out.printf("(int) %d -> %d\n", a, (int) a);
		System.out.printf("(short) %d -> %d\n", a, (short) a);
		System.out.printf("(long) %d -> %d\n", a, (long) a);
		System.out.printf("(float) %d -> %s\n", a, Float.toString((float) a));
		System.out.printf("(double) %d -> %s\n", a, Double.toString((double) a));
		System.out.printf("(char) %d -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %d -> %s\n", a, ERROR_CAST_STR);	
	}
	
	/**
	 * Tests for Short type 
	 */
	public static void testShort(){
		short a = 7, b = 4, c;
		System.out.println("\nTests for Short");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = (short) (a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		c = (short) (a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = (short) (a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		c = (short) (a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		c = (short) (a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		try {
			c = (short) (a / 0);
		} catch (Exception e) {
			System.out.printf("%d / 0 = %s\n", a,e.getClass());
		}
		try {
			c = (short) (a % 0);
		} catch (Exception e) {
			System.out.printf("%d %% 0 = %s\n", a,e.getClass());
		}
		c = (short) -a;
		System.out.printf("-%d = %d\n", a, c);
		c = (short) +a;
		System.out.printf("+%d = %d\n", a, c);
		System.out.printf("%d++ = %d\n", a, a++);
		a = 7;
		System.out.printf("++%d = %d\n", a, ++a);
		a = 7;
		System.out.printf("%d-- = %d\n", a, a--);
		a = 7;
		System.out.printf("--%d = %d\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7;
		c = (short) ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (short) (a & b);
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) (a | b);
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) (a << 1);
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (short) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (short) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = (short) (~a >> 1);
		System.out.printf("%d >> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		c = (short) (~a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%d == %d -> %b\n", a, b, a == b);
		System.out.printf("%d != %d -> %b\n", a, b, a != b);
		System.out.printf("%d < %d -> %b\n", a, b, a < b);
		System.out.printf("%d > %d -> %b\n", a, b, a > b);
		System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
		System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
		System.out.printf("!%d -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%d && %d -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%d || %d -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7;
		System.out.printf("%d += %d -> %d\n", a, b, a += b);
		a = 7;
		System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
		a = 7;
		System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
		a = 7;
		System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
		a = 7;
		System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
		a = 7;
		System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
		a = 7;
		System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
		a = 7;
		System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
		a = 7;
		System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
		a = 7;
		System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
		a = 7;
		System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = 7;
		System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 24653;
		System.out.printf("(byte) %d -> %d\n", a, (byte) a);
		System.out.printf("(int) %d -> %d\n", a, (int) a);
		System.out.printf("(long) %d -> %d\n", a, (long) a);
		System.out.printf("(float) %d -> %s\n", a, Float.toString((float) a));
		System.out.printf("(double) %d -> %s\n", a, Double.toString((double) a));
		System.out.printf("(char) %d -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %d -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Int type
	 */
	public static void testInt(){
		int a = 7, b = 4, c;
		System.out.println("\nTests for Int");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		try {
			c = a / 0;
		} catch (Exception e) {
			System.out.printf("%d / 0 = %s\n", a,e.getClass());
		}
		try {
			c = a % 0;
		} catch (Exception e) {
			System.out.printf("%d %% 0 = %s\n", a,e.getClass());
		}
		c = -a;
		System.out.printf("-%d = %d\n", a, c);
		c = +a;
		System.out.printf("+%d = %d\n", a, c);
		System.out.printf("%d++ = %d\n", a, a++);
		a = 7;
		System.out.printf("++%d = %d\n", a, ++a);
		a = 7;
		System.out.printf("%d-- = %d\n", a, a--);
		a = 7;
		System.out.printf("--%d = %d\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7;
		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		c = ~a >> 1;
		System.out.printf("%d >> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		c = ~a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%d == %d -> %b\n", a, b, a == b);
		System.out.printf("%d != %d -> %b\n", a, b, a != b);
		System.out.printf("%d < %d -> %b\n", a, b, a < b);
		System.out.printf("%d > %d -> %b\n", a, b, a > b);
		System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
		System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
		System.out.printf("!%d -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%d && %d -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%d || %d -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7;
		System.out.printf("%d += %d -> %d\n", a, b, a += b);
		a = 7;
		System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
		a = 7;
		System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
		a = 7;
		System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
		a = 7;
		System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
		a = 7;
		System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
		a = 7;
		System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
		a = 7;
		System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
		a = 7;
		System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
		a = 7;
		System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
		a = 7;
		System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = 7;
		System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 129302;
		System.out.printf("(byte) %d -> %d\n", a, (byte) a);
		System.out.printf("(short) %d -> %d\n", a, (short) a);
		System.out.printf("(long) %d -> %d\n", a, (long) a);
		System.out.printf("(float) %d -> %s\n", a, Float.toString((float) a));
		System.out.printf("(double) %d -> %s\n", a, Double.toString((double) a));
		System.out.printf("(char) %d -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %d -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Long type
	 */
	public static void testLong(){
		long a = 7, b = 4, c;
		System.out.println("\nTests for Int");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		try {
			c = a / 0;
		} catch (Exception e) {
			System.out.printf("%d / 0 = %s\n", a,e.getClass());
		}
		try {
			c = a % 0;
		} catch (Exception e) {
			System.out.printf("%d %% 0 = %s\n", a,e.getClass());
		}
		c = -a;
		System.out.printf("-%d = %d\n", a, c);
		c = +a;
		System.out.printf("+%d = %d\n", a, c);
		System.out.printf("%d++ = %d\n", a, a++);
		a = 7;
		System.out.printf("++%d = %d\n", a, ++a);
		a = 7;
		System.out.printf("%d-- = %d\n", a, a--);
		a = 7;
		System.out.printf("--%d = %d\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7;
		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		c = ~a >> 1;
		System.out.printf("%d >> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(~a), Long.toBinaryString(c));
		c = ~a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", ~a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(~a), Long.toBinaryString(c));
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%d == %d -> %b\n", a, b, a == b);
		System.out.printf("%d != %d -> %b\n", a, b, a != b);
		System.out.printf("%d < %d -> %b\n", a, b, a < b);
		System.out.printf("%d > %d -> %b\n", a, b, a > b);
		System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
		System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
		System.out.printf("!%d -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%d && %d -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%d || %d -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7;
		System.out.printf("%d += %d -> %d\n", a, b, a += b);
		a = 7;
		System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
		a = 7;
		System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
		a = 7;
		System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
		a = 7;
		System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
		a = 7;
		System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
		a = 7;
		System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
		a = 7;
		System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
		a = 7;
		System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
		a = 7;
		System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
		a = 7;
		System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = 7;
		System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 129302;
		System.out.printf("(byte) %d -> %d\n", a, (byte) a);
		System.out.printf("(short) %d -> %d\n", a, (short) a);
		System.out.printf("(int) %d -> %d\n", a, (int) a);
		System.out.printf("(float) %d -> %s\n", a, Float.toString((float) a));
		System.out.printf("(double) %d -> %s\n", a, Double.toString((double) a));
		System.out.printf("(char) %d -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %d -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Char type
	 */
	public static void testChar(){
		char a = 123, b = 84, c;
		System.out.println("\nTests for Char");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = (char) (a + b);
		System.out.printf("%d + %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in string:");
		System.out.printf("%s + %s = %s\n", a, b, c);
		c = (char) (a - b);
		System.out.printf("%d - %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in string:");
		System.out.printf("%s - %s = %s\n", a, b, c);
		c = (char) (a * b);
		System.out.printf("%d * %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in string:");
		System.out.printf("%s * %s = %s\n", a, b, c);
		c = (char) (a / b);
		System.out.printf("%d / %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in string:");
		System.out.printf("%s / %s = %s\n", a, b, c);
		c = (char) (a % b);
		System.out.printf("%d %% %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in string:");
		System.out.printf("%s %% %s = %s\n", a, b, c);
		try {
			c = (char) (a / '\u0000');
		} catch (Exception e) {
			System.out.printf("%d / 0 = %s\n", (int) a,e.getClass());
		}
		try {
			c = (char) (a % '\u0000');
		} catch (Exception e) {
			System.out.printf("%d %% 0 = %s\n", (int) a,e.getClass());
		}
		c = (char) -a;
		System.out.printf("-%d = %d\n", (int) a, (int) c);
		System.out.println("in string:");
		System.out.printf("-%s = %s\n", a, c);
		c = (char) +a;
		System.out.printf("+%d = %d\n", (int) a, (int) c);
		System.out.println("in string:");
		System.out.printf("+%s = %s\n", a, c);
		System.out.printf("%d++ = %d\n", (int) a, (int) a++);
		System.out.println("in string:");
		System.out.printf("%s++ = %s\n", a, a++);
		a = 123;
		System.out.printf("++%d = %d\n", (int) a, (int) ++a);
		System.out.println("in string:");
		System.out.printf("++%s = %s\n", a, ++a);
		a = 123;
		System.out.printf("%d-- = %d\n", (int) a, (int) a--);
		System.out.println("in string:");
		System.out.printf("%s-- = %s\n", a, a--);
		a = 123;
		System.out.printf("--%d = %d\n", (int) a, (int) --a);
		System.out.println("in string:");
		System.out.printf("--%s = %s\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7;
		c = (char) ~a;
		System.out.printf("~%d = %d\n", (int) a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("~%s = %s\n", a, c);
		c = (char) (a & b);
		System.out.printf("%d & %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s & %s = %s\n", a, b, c);
		c = (char) (a | b);
		System.out.printf("%d | %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s | %s = %s\n", a, b, c);
		c = (char) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", (int) a, (int) b, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s ^ %s = %s\n", a, b, c);
		c = (char) (a << 1);
		System.out.printf("%d << 1 = %d\n", (int) a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s << 1 = %s\n", a, c);
		c = (char) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", (int) a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s >> 1 = %s\n", a, c);
		c = (char) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", (int) a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s >>> 1 = %s\n", a, c);
		c = (char) (~a >> 1);
		System.out.printf("%d >> 1 = %d\n", (int) ~a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s >> 1 = %s\n", a, c);
		c = (char) (~a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", (int) ~a, (int) c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(~a), Integer.toBinaryString(c));
		System.out.println("in string:");
		System.out.printf("%s >>> 1 = %s\n", a, c);
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%s == %s -> %b\n", a, b, a == b);
		System.out.printf("%s != %s -> %b\n", a, b, a != b);
		System.out.printf("%s < %s -> %b\n", a, b, a < b);
		System.out.printf("%s > %s -> %b\n", a, b, a > b);
		System.out.printf("%s <= %s -> %b\n", a, b, a <= b);
		System.out.printf("%s >= %s -> %b\n", a, b, a >= b);
		//boolean b1= !a;
		System.out.printf("!%s -> %s\n", a, ERROR_COMP_STR);
		//boolean b1= !a;
		System.out.printf("%s && %s -> %s\n", a, b, ERROR_COMP_STR);
		//boolean b1= !a;
		System.out.printf("%s || %s -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 123;
		System.out.printf("%s += %s -> %s\n", a, b, a += b);
		a = 123;
		System.out.printf("%s -= %s -> %s\n", a, b, a -= b);
		a = 123;
		System.out.printf("%s *= %s -> %s\n", a, b, a *= b);
		a = 123;
		System.out.printf("%s /= %s -> %s\n", a, b, a /= b);
		a = 123;
		System.out.printf("%s %%= %s -> %s\n", a, b, a %= b);
		a = 123;
		System.out.printf("%s &= %s -> %s\n", a, b, a &= b);
		a = 123;
		System.out.printf("%s |= %s -> %s\n", a, b, a |= b);
		a = 123;
		System.out.printf("%s ^= %s -> %s\n", a, b, a ^= b);
		a = 123;
		System.out.printf("%s >>= %s -> %s\n", a, b, a >>= b);
		a = 123;
		System.out.printf("%s <<= %s -> %s\n", a, b, a <<= b);
		a = 123;
		System.out.printf("%s >>>= %s -> %s\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = 7;
		System.out.printf("%s > %s ? %s : %s -> %s\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%s < %s ? %s : %s -> %s\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 29302;
		System.out.printf("(byte) %s -> %d\n", a, (byte) a);
		System.out.printf("(short) %s -> %d\n", a, (short) a);
		System.out.printf("(long) %s -> %d\n", a, (long) a);
		System.out.printf("(float) %s -> %s\n", a, Float.toString((float) a));
		System.out.printf("(double) %s -> %s\n", a, Double.toString((double) a));
		System.out.printf("(int) %s -> %d\n", a, (int) a);
		System.out.printf("(boolean) %s -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Float type
	 */
	public static void testFloat(){
		float a = 7.5f, b = 4.6f, c;
		System.out.println("\nTests for Float");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		c = a / 0.0f;
		System.out.printf("%f / 0.0 = %f\n", a, c);
		c = a % 0.0f;
		System.out.printf("%f %% 0.0 = %f\n", a, c);
		c = -a;
		System.out.printf("-%f = %f\n", a, c);
		c = +a;
		System.out.printf("+%f = %f\n", a, c);
		System.out.printf("%f++ = %f\n", a, a++);
		a = 7.5f;
		System.out.printf("++%f = %f\n", a, ++a);
		a = 7.5f;
		System.out.printf("%f-- = %f\n", a, a--);
		a = 7.5f;
		System.out.printf("--%f = %f\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7.5f;
		//c = ~a;
		System.out.printf("~%f -> %s\n", a, ERROR_COMP_STR);
		//c = a & b;
		System.out.printf("%f & %f -> %s\n", a, b, ERROR_COMP_STR);
		//c = a | b;
		System.out.printf("%f | %f -> %sd\n", a, b, ERROR_COMP_STR);
		//c = a ^ b;
		System.out.printf("%f ^ %f -> %s\n", a, b, ERROR_COMP_STR);
		//c = a << 1;
		System.out.printf("%f << 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >> 1;
		System.out.printf("%f >> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >>> 1;
		System.out.printf("%f >>> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = ~a >> 1;
		System.out.printf("~%f >> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = ~a >>> 1;
		System.out.printf("~%f >>> 1 -> %s\n", a, ERROR_COMP_STR);
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%f == %f -> %b\n", a, b, a == b);
		System.out.printf("%f != %f -> %b\n", a, b, a != b);
		System.out.printf("%f < %f -> %b\n", a, b, a < b);
		System.out.printf("%f > %f -> %b\n", a, b, a > b);
		System.out.printf("%f <= %f -> %b\n", a, b, a <= b);
		System.out.printf("%f >= %f -> %b\n", a, b, a >= b);
		//boolean b1= !a;
		System.out.printf("!%f -> %s\n", a, ERROR_COMP_STR);
		//boolean b1 = a && b;
		System.out.printf("%f && %f -> %s\n", a, b, ERROR_COMP_STR);
		//boolean b1 = a || b;
		System.out.printf("%f || %f -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7.5f;
		System.out.printf("%f += %f -> %f\n", a, b, a += b);
		a = 7.5f;
		System.out.printf("%f -= %f -> %f\n", a, b, a -= b);
		a = 7.5f;
		System.out.printf("%f *= %f -> %f\n", a, b, a *= b);
		a = 7.5f;
		System.out.printf("%f /= %f -> %f\n", a, b, a /= b);
		a = 7.5f;
		System.out.printf("%f %%= %f -> %f\n", a, b, a %= b);
		a = 7.5f;
		//a &= b;
		System.out.printf("%f &= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a |= b;
		System.out.printf("%f |= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a ^= b;
		System.out.printf("%f ^= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a >>= b;
		System.out.printf("%f >>= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a <<= b;
		System.out.printf("%f <<= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a >>>= b;
		System.out.printf("%f >>>= %f -> %s\n", a, b, ERROR_COMP_STR);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		System.out.printf("%f > %f ? %f : %f -> %f\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%f < %f ? %f : %f -> %f\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 129.302f;
		System.out.printf("(byte) %f -> %d\n", a, (byte) a);
		System.out.printf("(short) %f -> %d\n", a, (short) a);
		System.out.printf("(long) %f -> %d\n", a, (long) a);
		System.out.printf("(int) %f -> %d\n", a, (int) a);
		System.out.printf("(double) %f -> %s\n", a, Double.toString((double) a));
		System.out.printf("(char) %f -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %f -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Double type
	 */
	public static void testDouble(){
		double a = 7.5, b = 4.6, c;
		System.out.println("\nTests for Double");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		c = a / 0.0;
		System.out.printf("%f / 0.0 = %f\n", a, c);
		c = a % 0.0;
		System.out.printf("%f %% 0.0 = %f\n", a, c);
		c = -a;
		System.out.printf("-%f = %f\n", a, c);
		c = +a;
		System.out.printf("+%f = %f\n", a, c);
		System.out.printf("%f++ = %f\n", a, a++);
		a = 7.5f;
		System.out.printf("++%f = %f\n", a, ++a);
		a = 7.5f;
		System.out.printf("%f-- = %f\n", a, a--);
		a = 7.5f;
		System.out.printf("--%f = %f\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		a = 7.5;
		//c = ~a;
		System.out.printf("~%f -> %s\n", a, ERROR_COMP_STR);
		//c = a & b;
		System.out.printf("%f & %f -> %s\n", a, b, ERROR_COMP_STR);
		//c = a | b;
		System.out.printf("%f | %f -> %sd\n", a, b, ERROR_COMP_STR);
		//c = a ^ b;
		System.out.printf("%f ^ %f -> %s\n", a, b, ERROR_COMP_STR);
		//c = a << 1;
		System.out.printf("%f << 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >> 1;
		System.out.printf("%f >> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >>> 1;
		System.out.printf("%f >>> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = ~a >> 1;
		System.out.printf("~%f >> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = ~a >>> 1;
		System.out.printf("~%f >>> 1 -> %s\n", a, ERROR_COMP_STR);
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%f == %f -> %b\n", a, b, a == b);
		System.out.printf("%f != %f -> %b\n", a, b, a != b);
		System.out.printf("%f < %f -> %b\n", a, b, a < b);
		System.out.printf("%f > %f -> %b\n", a, b, a > b);
		System.out.printf("%f <= %f -> %b\n", a, b, a <= b);
		System.out.printf("%f >= %f -> %b\n", a, b, a >= b);
		//boolean b1= !a;
		System.out.printf("!%f -> %s\n", a, ERROR_COMP_STR);
		//boolean b1 = a && b;
		System.out.printf("%f && %f -> %s\n", a, b, ERROR_COMP_STR);
		//boolean b1 = a || b;
		System.out.printf("%f || %f -> %s\n", a, b, ERROR_COMP_STR);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		a = 7.5;
		System.out.printf("%f += %f -> %f\n", a, b, a += b);
		a = 7.5;
		System.out.printf("%f -= %f -> %f\n", a, b, a -= b);
		a = 7.5;
		System.out.printf("%f *= %f -> %f\n", a, b, a *= b);
		a = 7.5;
		System.out.printf("%f /= %f -> %f\n", a, b, a /= b);
		a = 7.5;
		System.out.printf("%f %%= %f -> %f\n", a, b, a %= b);
		a = 7.5;
		//a &= b;
		System.out.printf("%f &= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a |= b;
		System.out.printf("%f |= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a ^= b;
		System.out.printf("%f ^= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a >>= b;
		System.out.printf("%f >>= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a <<= b;
		System.out.printf("%f <<= %f -> %s\n", a, b, ERROR_COMP_STR);
		//a >>>= b;
		System.out.printf("%f >>>= %f -> %s\n", a, b, ERROR_COMP_STR);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		System.out.printf("%f > %f ? %f : %f -> %f\n", a, b, a, b, a > b ? a : b);
		System.out.printf("%f < %f ? %f : %f -> %f\n", a, b, a, b, a < b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = 129345643.302;
		System.out.printf("(byte) %f -> %d\n", a, (byte) a);
		System.out.printf("(short) %f -> %d\n", a, (short) a);
		System.out.printf("(long) %f -> %d\n", a, (long) a);
		System.out.printf("(int) %f -> %d\n", a, (int) a);
		System.out.printf("(float) %f -> %s\n", a, Float.toString((float) a));
		System.out.printf("(char) %f -> %s\n", a, Character.toString((char) a));
		System.out.printf("(boolean) %f -> %s\n", a, ERROR_CAST_STR);
	}
	
	/**
	 * Tests for Boolean type
	 */
	public static void testBoolean(){
		boolean a = true, b = false, c;
		System.out.println("\nTests for Boolean");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		//c = a + b;
		System.out.printf("%b + %b -> %s\n", a, b, ERROR_COMP_STR);
		//c = a - b;
		System.out.printf("%b - %b -> %s\n", a, b, ERROR_COMP_STR);
		//c = a * b;
		System.out.printf("%b * %b -> %s\n", a, b, ERROR_COMP_STR);
		//c = a / b;
		System.out.printf("%b / %b -> %s\n", a, b, ERROR_COMP_STR);
		//c = a % b;
		System.out.printf("%b %% %b -> %s\n", a, b, ERROR_COMP_STR);
		//c = -a;
		System.out.printf("-%b -> %s\n", a, ERROR_COMP_STR);
		//c = +a;
		System.out.printf("+%b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%b++ -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("++%b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("%b-- -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("--%b -> %s\n", a, ERROR_COMP_STR);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		//c = ~a;
		System.out.printf("~%b -> %s\n", a, ERROR_COMP_STR);
		c = a & b;
		System.out.printf("%b & %b = %b\n", a, b, c);
		c = a | b;
		System.out.printf("%b | %b = %b\n", a, b, c);
		c = a ^ b;
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		//c = a << 1;
		System.out.printf("%b << 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >> 1;
		System.out.printf("%b >> 1 -> %s\n", a, ERROR_COMP_STR);
		//c = a >>> 1;
		System.out.printf("%b >>> 1 -> %s\n", a, ERROR_COMP_STR);
		
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%b == %b -> %b\n", a, b, a == b);
		System.out.printf("%b != %b -> %b\n", a, b, a != b);
		System.out.printf("%b < %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b > %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b <= %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b >= %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("!%b -> %s\n", a, !a);
		System.out.printf("%b && %b -> %s\n", a, b, a && b);
		System.out.printf("%b || %b -> %s\n", a, b, a || b);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		System.out.printf("%b += %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b -= %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b *= %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b /= %b -> %s\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b %%= %b -> %s\n", a, b, ERROR_COMP_STR);
		a = true;
		System.out.printf("%b &= %b -> %b\n", a, b, a &= b);
		a = true;
		System.out.printf("%b |= %b -> %b\n", a, b, a |= b);
		a = true;
		System.out.printf("%b ^= %b -> %b\n", a, b, a ^= b);
		System.out.printf("%b >>= %b -> %b\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b <<= %b -> %b\n", a, b, ERROR_COMP_STR);
		System.out.printf("%b >>>= %b -> %b\n", a, b, ERROR_COMP_STR);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		a = true;
		System.out.printf("%b = %b ? %b : %b -> %b\n", a, b, a, b, a = b ? a : b);
		System.out.printf("%b != %b ? %b : %b -> %b\n", a, b, a, b, a != b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = true;
		System.out.printf("(byte) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(short) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(long) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(float) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(double) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(char) %b -> %s\n", a, ERROR_COMP_STR);
		System.out.printf("(boolean) %b -> %b\n", a, ERROR_COMP_STR);
	}
	
	/**
	 * Test for String type
	 */
	public static void testString(){
		String a = "Hello ", b = "Java!", c;
		System.out.println("\nTests for String");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		c = a + b;
		System.out.printf("%s + %s = %s\n", a, b, c);
		//c = a - b;
		//c = a * b;
		//c = a / b;
		//c = a % b;
		//c = a / 0;
		//c = a % 0;
		//c = -a;
		//c = +a;
		//System.out.printf("%s++ = %s\n", a, a++);
		//System.out.printf("++%s = %s\n", a, ++a);
		//System.out.printf("%s-- = %s\n", a, a--);
		//System.out.printf("--%s = %s\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		//c = ~a;
		//c = a & b;
		//c = a | b;
		//c = a ^ b;
		//c = a << 1;
		//c = a >> 1;
		//c = a >>> 1;
		//c = ~a >> 1;
		//c = ~a >>> 1;
				
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%s == %s -> %b\n", a, b, a == b);
		System.out.printf("%s != %s -> %b\n", a, b, a != b);
		//System.out.printf("%s < %s -> %b\n", a, b, a < b);
		//System.out.printf("%s > %s -> %b\n", a, b, a > b);
		//System.out.printf("%s <= %s -> %b\n", a, b, a <= b);
		//System.out.printf("%s >= %s -> %b\n", a, b, a >= b);
		//System.out.printf("!%s -> %s\n", a, !a);
		//System.out.printf("%s && %s -> %s\n", a, b, a && b);
		//System.out.printf("%s || %s -> %s\n", a, b, a || b);
		System.out.printf("a instanceof Object -> %b\n", a instanceof Object);
		System.out.printf("a instanceof String -> %b\n", a instanceof String);
		//a = null;
		//System.out.printf("a instanceof String -> %b\n", a instanceof String);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		System.out.printf("%s += %s -> %s\n", a, b, a += b);
		//System.out.printf("%s -= %s -> %d\n", a, b, a -= b);
		//System.out.printf("%s *= %s -> %d\n", a, b, a *= b);
		//System.out.printf("%s /= %s -> %d\n", a, b, a /= b);
		//System.out.printf("%s %%= %s -> %d\n", a, b, a %= b);
		//System.out.printf("%s &= %s -> %d\n", a, b, a &= b);
		//System.out.printf("%s |= %s -> %d\n", a, b, a |= b);
		//System.out.printf("%s ^= %s -> %d\n", a, b, a ^= b);
		//System.out.printf("%s >>= %s -> %d\n", a, b, a >>= b);
		//System.out.printf("%s <<= %s -> %d\n", a, b, a <<= b);
		//System.out.printf("%s >>>= %s -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		System.out.printf("%s = %s ? %s : %s -> %s\n", a, b, a, b, a == b ? a : b);
		System.out.printf("%s != %s ? %s : %s -> %s\n", a, b, a, b, a != b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		a = "Hello";
		//System.out.printf("(byte) %s -> %d\n", a, (byte) a);
		//System.out.printf("(short) %s -> %d\n", a, (short) a);
		//System.out.printf("(int) %s -> %d\n", a, (long) a);
		//System.out.printf("(long) %s -> %d\n", a, (long) a);
		//System.out.printf("(float) %s -> %s\n", a, Float.toString((float) a));
		//System.out.printf("(double) %s -> %s\n", a, Double.toString((double) a));
		//System.out.printf("(char) %s -> %s\n", a, Character.toString((char) a));
		//System.out.printf("(boolean) %s -> %s\n", a, (boolean) a);
		System.out.printf("(Object) %s -> %s", a, (Object) a);
	}
	
	/**
	 * Tests for User type (Student) 
	 */
	public static void testUserType(){
		Student a = new Student("Alex", 10), b = new Student("Nik", 10);
		System.out.println("\nTests for User type");
		//Arithmetic operators
		System.out.println("----------Arithmetic operators----------");
		//c = a + b;
		//c = a - b;
		//c = a * b;
		//c = a / b;
		//c = a % b;
		//c = a / 0;
		//c = a % 0;
		//c = -a;
		//c = +a;
		//System.out.printf("%s++ = %s\n", a, a++);
		//System.out.printf("++%s = %s\n", a, ++a);
		//System.out.printf("%s-- = %s\n", a, a--);
		//System.out.printf("--%s = %s\n", a, --a);
		
		//Bitwise operators
		System.out.println("----------Bitwise operators----------");
		//c = ~a;
		//c = a & b;
		//c = a | b;
		//c = a ^ b;
		//c = a << 1;
		//c = a >> 1;
		//c = a >>> 1;
		//c = ~a >> 1;
		//c = ~a >>> 1;
				
		//Logical operation
		System.out.println("----------Logical operation----------");
		System.out.printf("%s == %s -> %b\n", a, b, a == b);
		System.out.printf("%s != %s -> %b\n", a, b, a != b);
		//System.out.printf("%s < %s -> %b\n", a, b, a < b);
		//System.out.printf("%s > %s -> %b\n", a, b, a > b);
		//System.out.printf("%s <= %s -> %b\n", a, b, a <= b);
		//System.out.printf("%s >= %s -> %b\n", a, b, a >= b);
		//System.out.printf("!%s -> %s\n", a, !a);
		//System.out.printf("%s && %s -> %s\n", a, b, a && b);
		//System.out.printf("%s || %s -> %s\n", a, b, a || b);
		System.out.printf("a instanceof Object -> %b\n", a instanceof Object);
		System.out.printf("a instanceof Student -> %b\n", a instanceof Student);
		
		//Assignment operators
		System.out.println("----------Assignment operators----------");
		//System.out.printf("%s += %s -> %s\n", a, b, a += b);
		//System.out.printf("%s -= %s -> %d\n", a, b, a -= b);
		//System.out.printf("%s *= %s -> %d\n", a, b, a *= b);
		//System.out.printf("%s /= %s -> %d\n", a, b, a /= b);
		//System.out.printf("%s %%= %s -> %d\n", a, b, a %= b);
		//System.out.printf("%s &= %s -> %d\n", a, b, a &= b);
		//System.out.printf("%s |= %s -> %d\n", a, b, a |= b);
		//System.out.printf("%s ^= %s -> %d\n", a, b, a ^= b);
		//System.out.printf("%s >>= %s -> %d\n", a, b, a >>= b);
		//System.out.printf("%s <<= %s -> %d\n", a, b, a <<= b);
		//System.out.printf("%s >>>= %s -> %d\n", a, b, a >>>= b);
		
		//Ternary operator
		System.out.println("----------Ternary operator----------");
		System.out.printf("%s = %s ? %s : %s -> %s\n", a, b, a, b, a == b ? a : b);
		System.out.printf("%s != %s ? %s : %s -> %s\n", a, b, a, b, a != b ? a : b);
		
		//Type casting
		System.out.println("----------Type casting----------");
		//System.out.printf("(byte) %s -> %d\n", a, (byte) a);
		//System.out.printf("(short) %s -> %d\n", a, (short) a);
		//System.out.printf("(int) %s -> %d\n", a, (long) a);
		//System.out.printf("(long) %s -> %d\n", a, (long) a);
		//System.out.printf("(float) %s -> %s\n", a, Float.toString((float) a));
		//System.out.printf("(double) %s -> %s\n", a, Double.toString((double) a));
		//System.out.printf("(char) %s -> %s\n", a, Character.toString((char) a));
		//System.out.printf("(boolean) %s -> %s\n", a, (boolean) a);
		System.out.printf("(Object) %s -> %s\n", a, (Object) a);
		//System.out.printf("(String) %s -> %s", a, (String) a);
	}
}
