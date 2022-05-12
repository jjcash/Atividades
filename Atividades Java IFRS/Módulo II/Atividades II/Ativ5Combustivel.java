public class Ativ5Combustivel {
	public static void main(String[] args) { 
		double gas, gas2, dist, dist2, dist3, media, viagens;
		int count;
		gas = 0;
		dist = 0;
		viagens = 0;
		media = 0;
		dist3 = 0;
		dist2 = 0;
		gas2 = 0;
		count = 1;
		System.out.print("Insira o numero de viagens realizadas: ");
		viagens = Double.parseDouble(System.console().readLine());
		while (count < viagens) {
			System.out.printf("Insira o combustivel consumido na viagem %d: ", count);
			gas = Double.parseDouble(System.console().readLine());
			System.out.printf("Insira a distancia percorrida na viagem %d: ", count);
			dist = Double.parseDouble(System.console().readLine());
			dist2 = dist2+dist;
			gas2 = gas2+gas;
			dist3 = dist2/viagens;
			media = dist3/gas2;
			count = count+1;
		}
		System.out.printf("Media de combustivel gasto: %.0f", media);
	}
}	