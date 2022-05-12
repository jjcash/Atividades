public class NovoPreco {
	public static void main(String[] args) {
		double preco, preco_novo;
		
		System.out.println("***Calcular Novo Preco***");
		System.out.print("Insira o preco: ");
		preco = Double.parseDouble(System.console().readLine());
		
		preco_novo = ((preco*10/100)-preco)*-1;
		
		System.out.printf("Novo Preco: %.2f", preco_novo);
	}
}