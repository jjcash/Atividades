public class Ativ5 {
	public static void main(String[] args) {
		double num, round;
		int casa;
		System.out.print("Insira o numero: ");
		num = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a casa decimal (1 a 4): ");
		casa = Integer.parseInt(System.console().readLine());
		System.out.printf("%f", num);
		switch(casa){
			case 1:	round=(Math.round(num*10.0)/10.0);
					System.out.printf("Numero arredondado: %.1f)", round); break;
			case 2: round=(Math.round(num*100.0)/100.0);
					System.out.printf("Numero arredondado: %.2f", round); break;
			case 3: round=(Math.round(num*1000.0)/1000.0);
					System.out.printf("Numero arredondado: %.3f", round); break;
			case 4: round=(Math.round(num*10000.0)/10000.0);
					System.out.printf("Numero arredondado: %.4f", round); break;
		}
	}
}