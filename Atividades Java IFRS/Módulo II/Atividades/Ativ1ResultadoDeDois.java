public class Ativ1ResultadoDeDois {
	//Atividade 1 da Programação Básica com Java II pela IFRS
	public static void main(String[] args) {
		int num1, num2, res;
		System.out.println("***Resultado de Dois***");
		System.out.print("Insira o Primeiro Numero: ");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o Segundo Numero: ");
		num2 = Integer.parseInt(System.console().readLine());
		if (num1 > num2)
			res = num1 - num2;
		else
			res = num2 - num1;
		System.out.printf("Resultado: %d", res);
	}
}