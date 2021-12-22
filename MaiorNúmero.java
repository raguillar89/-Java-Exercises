package Lista;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MaiorNúmero {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite Dois Números Inteiros");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior valor é " + num1);
		} else {
			System.out.println("O maior valor é " + num2);
		}
	
	}
}
