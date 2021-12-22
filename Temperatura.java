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
	
	System.out.print("A temperatura em Celsius é de: " + c + "º C");
	System.out.print("\nA temperatura em Fahrenheit é de: " + f + "º F");
	System.out.print("\nA temperatura em Kelvin é de: " + k + " K");
	System.out.print("\nA temperatura em Réaumur é de: " + re + "º Ré");
	System.out.print("\nA temperatura em Rankine é de: " + ra + "º R");	
	
	}
}
