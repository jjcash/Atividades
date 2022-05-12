public class Ativ3RaizReal {
	public static void main(String[] args) {
		int a, b, c, delta;
		System.out.println("***Raiz Real***");
		System.out.print("Insira o numero A: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o numero B: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o numero C: ");
		c = Integer.parseInt(System.console().readLine());
		delta = (b*b)-(4*a*c);
		if (delta < 0)
			System.out.printf("Delta: %d\n A equacao nao possui raizes reais", delta);
		if (delta > 0)
			System.out.printf("Delta: %d\n A equacao possui duas raizes reais", delta);
		if (delta == 0)
			System.out.printf("Delta: %d\n Possui uma unica raiz real", delta);
	}
}