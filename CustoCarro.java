package Lista;

import java.util.Scanner;


public class CustoCarro {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor de venda?");
		double valorVenda = scanner.nextDouble();
		
		double custoDistribuidor = 0.28;
		double impostos = 0.45;
		double custoFinal = (valorVenda * custoDistribuidor) + (valorVenda * impostos);
		
		System.out.println("O valor de venda do carro é de R$" + valorVenda);
		System.out.println("O custo total de fabricação do carro é de R$" + custoFinal);		
		
	}
}
