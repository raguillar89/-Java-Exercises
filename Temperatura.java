package Lista;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Qual a temperatura em Celsius?");
	double c = scanner.nextDouble();
	
	double f, k, re, ra;
	
	f = (c * 1.8) + 32;
	k = c + 273.15;
	re = (c * 0.8);
	ra = (c * 1.8) + 32 + 459.67;
	
	System.out.print("A temperatura em Celsius � de: " + c + "� C");
	System.out.print("\nA temperatura em Fahrenheit � de: " + f + "� F");
	System.out.print("\nA temperatura em Kelvin � de: " + k + " K");
	System.out.print("\nA temperatura em R�aumur � de: " + re + "� R�");
	System.out.print("\nA temperatura em Rankine � de: " + ra + "� R");	
	
	}
}
