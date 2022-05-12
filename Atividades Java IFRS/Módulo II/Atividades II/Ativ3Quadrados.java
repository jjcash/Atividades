public class Ativ3Quadrados {
	public static void main(String[] args) {
		int num, res;
		num = 0;
		while (num >= 0) {
			System.out.println("Digite um numero para calcular o quadrado: ");
			num = Integer.parseInt(System.console().readLine());
			res = num*num;
			System.out.printf("A raiz de '%d' eh '%d'\n", num, res);
		}
	}
}