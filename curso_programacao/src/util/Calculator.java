package util;

public class Calculator {

	public static final double PI = 3.14159; // O "final" indica que é uma constante.
	//Constante em java é com letra maiúscula e separado por "underline" -> _
	
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * radius * radius * radius) / 3.0;
	}
	
}
