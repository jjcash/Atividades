public class Ativ10 {
	public static void main(String[] args) {
		int opcao;
		double num1, num2, res1, num3, res2;
		System.out.println("Menu de opcoes:");
		System.out.println("1. Somar dois numeros.");
		System.out.println("2. Numero ao quadrado.");
		System.out.println("Digite a opcao desejada: ");
		opcao = Integer.parseInt(System.console().readLine());
		switch(opcao){
			case 1 : System.out.print("Digite o primeiro numero: ");
			num1 = Double.parseDouble(System.console().readLine());
			System.out.print("Digite o segundo numero: ");
			num2 = Double.parseDouble(System.console().readLine());
			res1 = num1+num2;
			System.out.printf("Resultado: %.0f", res1); break;
			case 2 : System.out.print("Digite o numero: ");
			num3 = Double.parseDouble(System.console().readLine());
			res2 = num3*num3;
			System.out.printf("Resultado: %.0f", res2); break;
			default : System.out.print("Opcao invalida!");
		}
	}
}