public class Ativ7 {
	public static void main(String[] args) {
		int opcao;
		double num1, num2;
		System.out.println("*Atividade 8*");
		System.out.println("Escolha uma das opcoes:");
		System.out.println("1. O primeiro numero elevado ao segundo numero. ");
		System.out.println("2. Raiz quadrada de cada um dos numeros.");
		System.out.println("3. Raiz cubica de cada um dos numeros.");
		opcao=Integer.parseInt(System.console().readLine());
		System.out.print("Digite o primeiro numero: ");
		num1=Double.parseDouble(System.console().readLine());
		System.out.print("Digite o segundo numero: ");
		num2=Double.parseDouble(System.console().readLine());
		switch(opcao){
			case 1:	double res=Math.pow(num1, num2);
					System.out.printf("Resultado: %.2f", res); break;
			case 2:	double res1=Math.sqrt(num1);
					double res2=Math.sqrt(num2);
					System.out.printf("Resultado do num1: %.2f\nResultado do num2: %.2f", res1, res2); break;
			case 3: double res3=Math.cbrt(num1);
					double res4=Math.cbrt(num2);
					System.out.printf("Resultado do num1: %.2f\nResultado do num2: %.2f", res3, res4);
		}
	}
}