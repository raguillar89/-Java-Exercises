package com.senior.avaliacao.qs2;

import java.util.Scanner;

public class MaiusculoSemSplit {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		
		char upper[] = frase.toCharArray();
		int size = upper.length;
		
		upper[0] = (char)(upper[0] - 32);
		int i = 1;
		
		while(i != size) {
			
			if(upper[i] == ' ') {
				
				upper[i + 1] = (char) (upper[i + 1] - 32);
				
			}
			
			++i;			
			
		}

		System.out.println(upper);	
		
	}
		
}
