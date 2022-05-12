public class Ativ8MenorDeTres {
	public static void main(String[] args) {
		int val_1, val_2, val_3;
		System.out.println("&*&*Atividade 8*&*&");
		System.out.print("Insira o primeiro numero: ");
		val_1 = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o segundo numero: ");
		val_2 = Integer.parseInt(System.console().readLine());
		System.out.print("Insira o terceiro numero: ");
		val_3 = Integer.parseInt(System.console().readLine());
		if (val_1 < val_2 && val_1 < val_3)
			System.out.printf("%d eh o menor numero!", val_1);
		else
			if (val_2 < val_1 && val_2 < val_3)
				System.out.printf("%d eh o menor numero!", val_2);
			else
				if (val_3 < val_1 && val_3 < val_2)
					System.out.printf("%d eh o menor numero!", val_3);
	}
}