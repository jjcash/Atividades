public class Ativ8 {
	public static void main(String[] args) {
		int senha;
		
		do {
			System.out.print("Digite a senha: ");
			senha = Integer.parseInt(System.console().readLine());
		}while(senha!=1234);
		System.out.println("Senha correta, acesso liberado.");
		System.out.print("Modificacao da Matrix liberada com sucesso.");
	}
}
			
				