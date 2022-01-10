package com.senior.avaliacao.qs3;

import java.util.Scanner;

public class ValidacaoDeProtocolo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digito os 6 digitos do Protocolo.");
		String digitos = sc.nextLine();
		
		if(digitos.contains(".") || digitos.contains("-") || digitos.contains("_") || digitos.contains("/") || digitos.contains(" ")){
			
			System.out.println("Inválido. Por favor, digite somente números");
						
		} else {
			
			String[] digito = digitos.split("");
						
			int primeiroDigito = Integer.parseInt(digito[0]);
			int segundoDigito = Integer.parseInt(digito[1]);
			int terceiroDigito = Integer.parseInt(digito[2]);
			int quartoDigito = Integer.parseInt(digito[3]);
			int quintoDigito = Integer.parseInt(digito[4]);
			int sextoDigito = Integer.parseInt(digito[5]);
					
			int primeiroVerificador = (((sextoDigito * 2) + (quintoDigito * 3) + (quartoDigito * 4) + (terceiroDigito * 5) + (segundoDigito * 6) + (primeiroDigito * 7)) % 11);
					
			System.out.println(primeiroVerificador);
			
				
			int segundoVerificador = (((sextoDigito * 2) + (quintoDigito * 3) + (quartoDigito * 4) + (terceiroDigito * 5) + (segundoDigito * 6) + (primeiroDigito * 7) + (primeiroVerificador * 8)) % 11);
						
			System.out.println(segundoVerificador);		
								
						
			System.out.println("O Protocolo completo é: " + primeiroDigito + segundoDigito + terceiroDigito + quartoDigito + quintoDigito + sextoDigito + primeiroVerificador + segundoVerificador);
		}
			
	}
	
}
