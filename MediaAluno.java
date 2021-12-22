package Lista;

import java.util.Scanner;


public class MediaAluno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Digite as notas do aluno");
			arr[i] = scanner.nextInt();			
		}
		
		int soma = 0;
		for (int n : arr) {
		    soma += n;
		}
		System.out.println("A media é " + (soma / 4));
			
	}
}
