public class Ativ5Divisiveis {
	public static void main(String[] args) {
		int val_1, val_2, val_3, val_4;
		System.out.println("***Atividade 4***");
		System.out.print("Digite o primeiro valor: ");
		val_1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo valor: ");
		val_2 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o terceiro valor: ");
		val_3 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o quarto valor: ");
		val_4 = Integer.parseInt(System.console().readLine());
		//Valor 1
		System.out.printf("Primeiro Valor: %d\n", val_1);
		if (val_1%2 == 0)
			System.out.println("O primeiro valor eh divisivel por dois!");
		else
			System.out.println("O primeiro valor nao eh divisivel por dois!");
		if (val_1%3 == 0)
			System.out.println("O primeiro valor eh divisivel por tres!");
		else
			System.out.println("O primeiro valor nao eh divisivel por tres!");
		//Valor 2
		System.out.printf("Segundo Valor: %d\n", val_2);
		if (val_2%2 == 0)
			System.out.println("O segundo valor eh divisivel por dois!"); 
		else
			System.out.println("O segundo valor nao eh divisivel por dois!");
		if (val_2%3 == 0)
			System.out.println("O segundo valor eh divisivel por tres!");
		else
			System.out.println("O segundo valor nao eh divisivel por tres!");
		//Valor 3
		System.out.printf("Terceiro Valor: %d\n", val_3);
		if (val_3%2 == 0)
			System.out.println("O terceiro valor eh divisivel por dois!"); 
		else
			System.out.println("O terceiro valor nao eh divisivel por dois!");
		if (val_3%3 == 0)
			System.out.println("O terceiro valor eh divisivel por tres!");
		else
			System.out.println("O terceiro valor nao eh divisivel por tres!");
		//Valor 4
		System.out.printf("Quarto Valor: %d\n", val_4);
		if (val_4%2 == 0)
			System.out.println("O quarto valor eh divisivel por dois!"); 
		else
			System.out.println("O quarto valor nao eh divisivel por dois!");
		if (val_4%3 == 0)
			System.out.println("O quarto valor eh divisivel por tres!");
		else
			System.out.println("O quarto valor nao eh divisivel por tres!");
	}
}