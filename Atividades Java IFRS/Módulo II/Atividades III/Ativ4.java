public class Ativ4 {
	public static void main(String[] args) {
		int n, cont, soma, somaQuad;
		double media;
		System.out.print("Insira o 'n': ");
		n = Integer.parseInt(System.console().readLine());
		for (soma = 0, somaQuad = 0, cont = 1; cont <= n; cont = cont + 1) {
			soma = soma + cont;
			somaQuad = somaQuad + cont * cont;
		}
		media = soma / n;
		System.out.printf("Soma: %d\nSomaQuad: %d\nMedia: %.2f", soma, somaQuad, media);
	}
}