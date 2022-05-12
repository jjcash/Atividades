public class Ativ4Triangulo {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("***Verificar se e um triangulo***");
		System.out.print("Insira o valor de A: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o valor de B: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o valor de C: ");
		c = Integer.parseInt(System.console().readLine());
		if(a + b < c || a + c < b)
			System.out.print("Os valors informados nao podem formar um triangulo");
		else
			System.out.print("Os lados formam um triangulo");
	}
}