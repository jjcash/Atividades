public class CalculoAreadoTriangulo {
	public static void main(String[] args) {
		double base, altura, area;
		
		System.out.println("Programa para Calcular a Area de um Triangulo");
		System.out.print("Insira a Altura: ");
		altura = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a Base: ");
		base = Double.parseDouble(System.console().readLine());
		
		
		area = (base*altura)/2;
		
		System.out.printf("Area do Triangulo: %.2f", area);
	}
}