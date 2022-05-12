public class Ativ6 {
	public static void main(String[] args) {
		int numMercadorias, quantVendida, cont;
		double precoUnit, fatTotal;
		System.out.print("Insira o numero de mercadorias: ");
		numMercadorias = Integer.parseInt(System.console().readLine());
		for (fatTotal=0,cont=0;cont<numMercadorias;cont=cont+1){
			System.out.print("Preco unitario: ");
			precoUnit = Double.parseDouble(System.console().readLine());
			System.out.print("Insira a quantidade vendida: ");
			quantVendida = Integer.parseInt(System.console().readLine());
			fatTotal = fatTotal+precoUnit*quantVendida;
		}
		System.out.printf("Faturamento total: %.2f", fatTotal);
	}
}
