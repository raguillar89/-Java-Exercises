package Lista;

import java.util.Scanner;


public class LoginSenha {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite seu login: ");
		String login = scanner.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = scanner.nextLine();
		
		if(login.equals("renanpinho") && senha.equals("123321")) {
			System.out.println("Login realizado com sucesso.");
		} else {
			System.out.println("Login ou senha inválidos.");
		}
			
	}
}
