public class Ativ5 {
	public static void main(String[] args) {
		int numViagens, cont;
		double litrosComb, distancia, somaKML, mediaKML;
		System.out.print("Insira o numero de Viagens: ");
		numViagens = Integer.parseInt(System.console().readLine());
		for (somaKML=0,cont=0;cont<numViagens;cont=cont+1) {
			System.out.print("Insira os litros de combustivel: ");
			litrosComb = Double.parseDouble(System.console().readLine());
			System.out.print("Insira a distancia: ");
			distancia = Double.parseDouble(System.console().readLine());
			somaKML = somaKML+distancia/litrosComb;
		}
		mediaKML = somaKML/numViagens;
		System.out.printf("mediaKML: %.2f", mediaKML);
	}
}