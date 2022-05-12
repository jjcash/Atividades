public class Ativ4 {
	public static void main(String[] args) {
		double a, b, c, delta;
		System.out.print("Insira o numero A: ");
		a=Double.parseDouble(System.console().readLine());
		System.out.print("Insira o numero B: ");
		b=Double.parseDouble(System.console().readLine());
		System.out.print("Insira o numer C: ");
		c=Double.parseDouble(System.console().readLine());
		delta = Math.pow(b, 2)-4*a*c;
		System.out.print(delta);
	}
}