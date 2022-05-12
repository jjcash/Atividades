public class Ativ2Somatorio {
	public static void main(String[] args) {
		//nao entendi mesmo oque era pra fazer *face_palm*
		int num, soma;
		boolean fim;
		char res;
		soma = 0;
		fim = true;
		while (fim == true) {
			System.out.print("Insira um numero: ");
			num = Integer.parseInt(System.console().readLine());
			soma = soma+num;
			System.out.print("Deseja continuar? sim (true) ou nao (false)");
			fim = Boolean.parseBoolean(System.console().readLine());
		}
		soma = soma*soma;
		System.out.printf("O resultado e %d", soma);
	}
}