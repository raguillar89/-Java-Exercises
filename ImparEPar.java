package Lista;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ImparEPar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long produtoPar = 1;
		int somaImpar = 0;
		
		for(int numero1 = scanner.nextInt(); numero1 <= 30; numero1++) {
			if(numero1 % 2 == 1) {
				somaImpar += numero1;
		
			}else{
				if(numero1 > 0)
					produtoPar *= numero1;
			}
		}
		
		System.out.println("\nSoma dos ímpares: " + somaImpar);
		System.out.println("Produto dos pares: " + produtoPar);
	
	}
}
