public class SubtracaoDeDoisNumeros {
	public static void main(String[] args) {
		double n1, n2, resultado;
		
		System.out.println("***Subtracao de Dois Numeros***");
		System.out.print("Insira o primeiro numero: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira o segundo numero: ");
		n2 = Double.parseDouble(System.console().readLine());
		
		resultado = n1 - n2;
		
		System.out.printf("Resultado: %f", resultado);
	}
}