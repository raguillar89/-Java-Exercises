package Lista;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ListarAt�0 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite um n�mero: ");
		int numero = scanner.nextInt();
		int cont = numero;
		int total;
		
		while(cont >= 0) {
			total = cont;
			System.out.println(total);
			cont--;
		}
	
	}
}
