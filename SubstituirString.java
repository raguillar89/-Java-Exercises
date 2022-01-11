package com.senior.avaliacao.qs6;

import java.util.Scanner;

public class Substitui {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String substring = sc.nextLine();
		String newstring = sc.nextLine();
		
		frase = frase.replaceAll(substring, newstring);
		
		System.out.println(frase);
				
	}
		
}
