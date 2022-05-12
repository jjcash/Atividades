public class Divisao {
	public static void main(String[] args) {
		double n1, n2, resultado;
		
		System.out.println("***Programa de Divisoes***");
		System.out.print("Insira o numero que quer dividir: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira por quanto quer dividir: ");
		n2 = Double.parseDouble(System.console().readLine());
		
		resultado = n1/n2;
		
		System.out.printf("Resultado: %f", resultado);
	}
}