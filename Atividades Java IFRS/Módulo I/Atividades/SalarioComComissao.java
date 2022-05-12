public class SalarioComComissao {
	public static void main(String[] args) {
		double salario_base, vendas, salario;
		
		System.out.println("***Calcular o Salario com Comissao***");
		System.out.print("Insira o Salario Base: ");
		salario_base = Double.parseDouble(System.console().readLine());
		System.out.print("Insira o Valor de Vendas: ");
		vendas = Double.parseDouble(System.console().readLine());
		
		salario = (vendas*4/100)+salario_base;
		
		System.out.printf("Total do Salario com Comissao: %.2f", salario);
	}
}

		