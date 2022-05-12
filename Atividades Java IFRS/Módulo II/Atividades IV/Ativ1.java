public class Ativ1 {
	public static void main(String[] args) {
		int count;
		double numero;
		for(count=1;count<=200;count++){
			numero = Math.sqrt(count);
			System.out.printf("A raiz quadrada de %d eh %f\n", count, numero);
		}
		System.out.print("Fim!");
	}
}