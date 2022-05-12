public class Ativ3 {
	public static void main(String[] args) {
		double numero, soma;
		int cont;
		for (soma = 0, cont = 0; cont < 10; soma = soma+numero, cont = cont + 1) {
			System.out.printf("Insira o numero %d: ", cont+1);
			numero = Double.parseDouble(System.console().readLine());
		}
		System.out.printf("Soma: %.0f", soma);
	}
}