public class Ativ1Data {
	public static void main(String[] args) {
		int dia, mes, ano;
		String mes_char;
		System.out.print("Digite o dia: ");
		dia = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o mes: ");
		mes = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o ano: ");
		ano = Integer.parseInt(System.console().readLine());
		switch(mes) {
			case 1 : System.out.printf("%d de Janeiro de %d", dia, ano); break;
			case 2 : System.out.printf("%d de Fevereiro de %d", dia, ano); break;
			case 3 : System.out.printf("%d de Marco de %d", dia, ano); break;
			case 4 : System.out.printf("%d de Abril de %d", dia, ano); break;
			case 5 : System.out.printf("%d de Maio de %d", dia, ano); break;
			case 6 : System.out.printf("%d de Junho de %d", dia, ano); break;
			case 7 : System.out.printf("%d de Julho de %d", dia, ano); break;
			case 8 : System.out.printf("%d de Agosto de %d", dia, ano); break;
			case 9 : System.out.printf("%d de Setembro de %d", dia, ano); break;
			case 10 : System.out.printf("%d de Outubro de %d", dia, ano); break;
			case 11 : System.out.printf("%d de Novembro de %d", dia, ano); break;
			case 12 : System.out.printf("%d de Dezembro de %d", dia, ano); break;
			default: System.out.println("Data invalida");
		}
	}
}