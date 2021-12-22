package Lista;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DiasDeVida {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Você tem quantos anos, meses e dias de idade?");
	int anos = scanner.nextInt();
	int meses = scanner.nextInt();
	int dias = scanner.nextInt();
	
	int diasvida;
	
	diasvida = (anos * 365) + (meses * 30) + dias;
	
	System.out.println("Você tem " + diasvida + " dias de vida.");
	
	}
}
