package Lista;

import java.util.Scanner;


public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		int i = 0;
				
		for(i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		
		
		
		
	}
}