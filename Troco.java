package com.senior.avaliacao.qs7;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Dinheiro {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
					
		double pp1 = 100.00;
		double pp2 = 150.00;
		double pp3 = 700.00;
		double pp4 = 400.00;
		
		
		System.out.println("Qual produto gostaria de comprar? \n\n1. Mouse - R$100,00 \n2. Teclado - R$150,00 \n3. Monitor - R$700,00 \n4. Gabinete - R$400,00 \n");
		
		int produto = sc.nextInt();		
		
		if(produto == 1) {
			double vl = pp1;
			
			try {
			System.out.println("O valor a ser pago é de R$" + pp1);
			
			System.out.println("Qual o valor dado pelo cliente?");
			double v = sc.nextDouble();
						
			System.out.printf("%s", calculoDoTroco(pp1, v));
			
			} catch (InputMismatchException x) {
				System.err.printf("\nNão é possível realizar esta operação com o valor de pagamento dado pelo cliente");
			}
			
		} else if (produto == 2 ) {
			double vl = pp2;
			
			try {
				System.out.println("O valor a ser pago é de R$" + pp2);
				
				System.out.println("Qual o valor dado pelo cliente?");
				double v = sc.nextDouble();
							
				System.out.printf("%s", calculoDoTroco(pp2, v));
				
				} catch (InputMismatchException x) {
					System.err.printf("\nNão é possível realizar esta operação com o valor de pagamento dado pelo cliente");
				}
			
		} else if (produto == 3 ) {
			double vl = pp3;
			
			try {
				System.out.println("O valor a ser pago é de R$" + pp3);
				
				System.out.println("Qual o valor dado pelo cliente?");
				double v = sc.nextDouble();
							
				System.out.printf("%s", calculoDoTroco(pp3, v));
				
				} catch (InputMismatchException x) {
					System.err.printf("\nNão é possível realizar esta operação com o valor de pagamento dado pelo cliente");
				}
			
		} else if (produto == 4 ) {
			double vl = pp4;
			
			try {
				System.out.println("O valor a ser pago é de R$" + pp4);
				
				System.out.println("Qual o valor dado pelo cliente?");
				double v = sc.nextDouble();
							
				System.out.printf("%s", calculoDoTroco(pp4, v));
				
				} catch (InputMismatchException x) {
					System.err.printf("\nNão é possível realizar esta operação com o valor de pagamento dado pelo cliente");
				}
		}
			
	}
	
	
	 public static String calculoDoTroco(double vl, double v) {
		 
		 DecimalFormat form = new DecimalFormat("#,##0.00");
		 
		 double troco = v - vl;
		 
		 if(v < vl) {
			
			 return("\nValor insuficiente para pagamento. Faltam R$" + form.format(troco));
			 
		 } else {
				
				int notas[] = {100, 50, 20, 10, 5, 2, 1};
				int centavos[] = {50, 25, 10, 5, 1};
				
				int vv = (int) troco;
				int n = 0;
				int valor;
				
				String dev = "\nTroco = R$" + form.format(troco) + "\n\n";
				
				while(vv != 0) {
					
					valor = vv / notas[n];
					
					if(valor != 0) {
						
						dev = dev + (valor + " nota(s) de R$" + notas[n] + "\n");
						vv = vv % notas[n];
					
					}
					n = n + 1;
				}
				
				dev = dev + "\n";
				
				vv = (int)Math.round((troco - (int)troco) * 100);
				n = 0;
				
				while(vv != 0) {
					
					valor = vv / centavos[n];
					
					if(valor != 0) {
						
						dev = dev + (valor + " moeda(s) de " + centavos[n] + " centavo(s)\n");
						vv = vv % centavos[n];
					
					}
					n = n + 1;
				}
				
				return(dev);
					
			}

		}
		
	}