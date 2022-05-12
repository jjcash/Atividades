public class Ativ2FaixaDeValor {
	//Atividade 2 da Programação Básica com Java II pela IFRS
	public static void main(String[] args) {
	int num1;
	System.out.println("***Faixa de Valor***");
	System.out.print("Insira o Valor: ");
	num1 = Integer.parseInt(System.console().readLine());
		if (num1 >=1 && num1 <=9)
			System.out.print("O valor esta na faixa permitida");
		else
			System.out.print("O valor esta fora da faixa permitida");
    }
}

