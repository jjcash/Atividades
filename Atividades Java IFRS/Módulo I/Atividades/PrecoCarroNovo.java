public class PrecoCarroNovo {
	public static void main(String[] args) {
		double preco_fabrica, preco_consumidor, lucro_dis, per_dis, tax, per_tax;
		
		System.out.println("***Calcular Preco do Carro Novo***");
		System.out.print("Insira o preco de fabrica: ");
		preco_fabrica = Double.parseDouble(System.console().readLine());
		System.out.print("Insira o percentual de lucro do distribuidor: ");
		per_dis = Double.parseDouble(System.console().readLine());
		System.out.print("Insira o percentual do imposto: ");
		per_tax = Double.parseDouble(System.console().readLine());
		
		lucro_dis = preco_fabrica*per_dis/100;
		tax = preco_fabrica*per_tax/100;
		preco_consumidor = preco_fabrica+lucro_dis+tax;
		
		System.out.printf("Lucro do Distribuidor: %.2f\n", lucro_dis);
		System.out.printf("Impostos: %.2f\n", tax);
		System.out.printf("Preco Final: %.2f", preco_consumidor);
	}
}
		