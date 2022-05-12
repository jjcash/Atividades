public class Ativ2Detran {
	public static void main(String[] args) {
		int placa, verificar;
		System.out.print("Digite o numero da placa: ");
		placa = Integer.parseInt(System.console().readLine());
		verificar = placa%10;
		switch (verificar) {
			case 0 : System.out.print("A vistoria deve ser realizada em Janeiro do proximo ano!"); break;
			case 1 : System.out.print("A vistoria deve ser realizada em Fevereiro do proximo ano!"); break;
			case 2 : System.out.print("A vistoria deve ser realizada em Marco do proximo ano!"); break;
			case 3 : System.out.print("A vistoria deve ser realizada em Abril do proximo ano!"); break;
			case 4 : System.out.print("A vistoria deve ser realizada em Maio do proximo ano!"); break;
			case 5 : System.out.print("A vistoria deve ser realizada em Junho do proximo ano!"); break;
			case 6 : System.out.print("A vistoria deve ser realizada em Setembro deste ano!"); break;
			case 7 : System.out.print("A vistoria deve ser realizada em Outubro deste ano!"); break;
			case 8 : System.out.print("A vistoria deve ser realizada em Novembro deste ano!"); break;
			case 9 : System.out.print("A vistoria deve ser realizada em Dezembro deste ano!"); break;
			default : System.out.print("A placa inserida eh invalida!");
		}
	}
}