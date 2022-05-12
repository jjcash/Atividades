public class CalcularIdade {
	public static void main(String[] args) {
		double ano_nascimento, ano_atual, meses, anos, dias, semanas;
		
		System.out.print("Insira o Ano de Nascimento: ");
		ano_nascimento = Double.parseDouble(System.console().readLine());
		System.out.print("Insira o Ano Atual: ");
		ano_atual = Double.parseDouble(System.console().readLine());
		
		anos = ano_atual-ano_nascimento;
		meses = anos*12;
		dias = anos*365;
		semanas = anos*52;
		
		System.out.printf("Idade em Anos: %.0f\n", anos);
		System.out.printf("Idade em Meses: %.0f\n", meses);
		System.out.printf("Idade em Semanas: %.0f\n", semanas);
		System.out.printf("Idade em Dias: %.0f\n", dias);
		
	}
}