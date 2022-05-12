public class Ativ1SomaDeDez {
	public static void main(String[] args) {
		double num, soma, vez;
		vez = 0;
		soma = 1;
		while (vez < 10) {
			System.out.print("Digite um numero: ");
			num = Double.parseDouble(System.console().readLine());
			soma = soma*num;
			vez = vez+1;
		}
		System.out.printf("O resultado eh %.2f", soma);
	}
}