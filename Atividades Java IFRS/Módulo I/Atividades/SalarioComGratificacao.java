public class SalarioComGratificacao {
	public static void main(String[] args) {
		double salario_base, salario;

		System.out.println("***Calcular Salario com Gratificacao***");
		System.out.print("Insira o Salario Base: ");
		salario_base = Double.parseDouble(System.console().readLine());
		
		salario = ((((salario_base*5/100)+salario_base)*7/100)-salario_base)*-1;
		
		System.out.printf("Salario Final: %.2f", salario);
	}
}