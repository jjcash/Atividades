public class Ativ9 {
	public static void main(String[] args) {
		int penultimo, ultimo, aux;
		penultimo = 0;
		ultimo = 1;
		do{
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
		}while(ultimo!=233);
	}
}