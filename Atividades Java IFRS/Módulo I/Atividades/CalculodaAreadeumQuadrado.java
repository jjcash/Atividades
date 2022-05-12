public class CalculodaAreadeumQuadrado {
	public static void main(String[] args) {
		double lado, area;
		
		System.out.println("Programa para Calcular a Area de um Quadrado");
		System.out.print("Insira a medida de um dos lados do quadrado: ");
		lado = Double.parseDouble(System.console().readLine());
		
		area = lado*lado;
		
		System.out.printf("Area do Quadrado: %.0f", area);
	}
}