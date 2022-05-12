public class MediaDeTresNotas {
	public static void main(String[] args) {
		double n1, n2, n3, nota;
		
		System.out.println("***Media de Tres Notas***");
		System.out.print("Insira a primeira nota: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a segunda nota: ");
		n2 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a terceira nota: ");
		n3 = Double.parseDouble(System.console().readLine());
		
		nota = (n1+n2+n3)/3;
		
		System.out.printf("Nota Final: %.1f", nota);
	}
}