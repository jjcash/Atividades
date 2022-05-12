public class ConversaoDeMedidas {
	public static void main(String[] args) {
		double pe, jarda, milha, polegada;
		
		System.out.println("***Programa para Conversao de Medidas***");
		System.out.print("Insira a medida em Pes: ");
		pe = Double.parseDouble(System.console().readLine());
		
		polegada = pe*12;
		jarda = pe/3;
		milha = jarda/1760;
		
		System.out.printf("Polegadas: %.2f\n", polegada);
		System.out.printf("Jardas: %.2f\n", jarda);
		System.out.printf("Milhas: %.2f\n", milha);
	}
}