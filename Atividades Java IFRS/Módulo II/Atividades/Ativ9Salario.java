public class Ativ9Salario {
	public static void main(String[] args) {
		double sal;
		System.out.print("Digite o salario: ");
		sal = Double.parseDouble(System.console().readLine());
		if (sal < 5000) {
		sal = (sal*30/100)+sal;
	     System.out.printf("O valor do novo salario eh %.2f", sal); }
		else
			System.out.print("O salario nao teve aumento.");
	}
}