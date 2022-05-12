public class Ativ6Mercadorias {
	public static void main(String[] args) {
		double preco_un, total_vendas, total_produto;
		boolean continuar;
		preco_un = 0;
		total_vendas = 0;
		total_produto = 0;
		continuar = true;
		while (continuar == true) {
			System.out.print("Preco unitario: ");
			preco_un = Double.parseDouble(System.console().readLine());
			System.out.print("Quantidade vendida: ");
			total_vendas = Double.parseDouble(System.console().readLine());
			System.out.print("Deseja inserir mais produtos? Sim (True) ou nao (false)");
			continuar = Boolean.parseBoolean(System.console().readLine());
			total_produto = (preco_un*total_vendas)+total_produto;
		}
		System.out.printf("O total de vendas foi de R$%.2f", total_produto);
	}
}