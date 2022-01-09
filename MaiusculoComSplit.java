package com.senior.avaliacao.qs2;

import java.util.Scanner;

public class MaiusculoComSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		
		String[] arr = frase.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			char f = arr[i].charAt(0);
			
			String f0 = String.valueOf(f).toUpperCase();
			String subs = arr[i].substring(1);
			System.out.print(f0 + subs + " ");
		}
		
		
	}
	
	
	
}
