package com.shishonok.task02.ex2;

/**
 * Class convert mass from one to another value
 * @author Alexander Shishonok
 */
public class MassConverter {
	
	/**
	 * Define conversion factors 
	 */
	final static double KG_TO_MG = 1_000_000;
	final static double KG_TO_G = 1_000;
	final static double KG_TO_T = 0.001;
	
	/**
	 * Convert from kilograms to milligram
	 * @param m mass in kilograms
	 * @return mass in milligrams 
	 */
	public static double convertFromKgToMg(double m) {
		return m * KG_TO_MG;
	}
	
	/**
	 * Convert from kilograms to grams
	 * @param m mass in kilograms
	 * @return mass in grams 
	 */
	public static double convertFromKgToG(double m) {
		return m * KG_TO_G;
	}
	
	/**
	 * Convert from kilograms to tons
	 * @param m mass in kilograms
	 * @return mass in tons
	 */
	public static double convertFromKgToT(double m) {
		return m * KG_TO_T;
	}
}

class Test {
	public static void main(String[] args) {
		double m = 14_324.32; // weight of the dinosaur
		System.out.printf("Weight of the dinosaur is %.0f milligrams\n", MassConverter.convertFromKgToMg(m));
		System.out.printf("Weight of the dinosaur is %.0f grams\n", MassConverter.convertFromKgToG(m));
		System.out.printf("Weight of the dinosaur is %.3f tons\n", MassConverter.convertFromKgToT(m));
	}
}