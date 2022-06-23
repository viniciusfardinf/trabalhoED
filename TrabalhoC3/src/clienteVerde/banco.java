package clienteVerde;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o usuário: ");
		String user = in.nextLine();
		
		System.out.println("Informe a senha: ");
		String senha = in.nextLine();
		
		if (user.equals("101010") && senha.equals("adm")){
			System.out.println("Usuário logado com sucesso!");
		}else {
			System.out.println("Usuário ou senha incorreto!");
		}
		
	}
}
