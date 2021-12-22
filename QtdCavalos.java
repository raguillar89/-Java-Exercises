package Lista;

import java.util.Scanner;

public class QtdCavalos {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Qual é a massa?");
	double massa = scanner.nextInt();
	
	System.out.println("Qual é a altura?");
	double altura = scanner.nextInt();
	
	System.out.println("Qual é o tempo?");
	double tempo = scanner.nextInt();
	
	int cavalos;
	
	cavalos = (int)(((massa * altura)/ tempo)/ 745.6999);
	
	System.out.println("Será necessário " + cavalos + " cavalo(s) para se levantar uma massa de " + massa + " Kg, a uma altura de " + altura + " metros em " + tempo + " segundos.");	
	
	}
}
