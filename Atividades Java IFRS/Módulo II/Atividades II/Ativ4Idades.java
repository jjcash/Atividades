public class Ativ4Idades {
	public static void main(String[] args) {
		double idade, idade2, vzs, idade3;
		idade = 1;
		vzs = -1;
		idade2 = 0;
		idade3 = 0;
		while (idade > 0) {
			System.out.println("Digite uma idade (0 para parar): ");
			idade = Double.parseDouble(System.console().readLine());
			idade2 = idade2+idade;
			vzs = vzs+1;
			idade3 = idade2/vzs;
		}
		System.out.printf("A media das idades eh %.0f", idade3);
	}
}