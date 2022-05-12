public class Ativ10NotaFinal {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		System.out.println("***Calcular a Media do Aluno***");
		System.out.print("Insira a nota do trabalho de laboratorio: ");
		nota1 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a nota da avaliacao semestral: ");
		nota2 = Double.parseDouble(System.console().readLine());
		System.out.print("Insira a nota do exame final: ");
		nota3 = Double.parseDouble(System.console().readLine());
		//calculo da media
		media = ((nota1*2.0)+(nota2*3.0)+(nota3*5.0))/(double)10.0;
		System.out.printf("Media: %.1f\n", media);
		//conceitos
		if (media >= 8 && media <= 10)
			System.out.print("Conceito: A");
		if (media >= 7 && media < 8)
			System.out.print("Conceito: B");
		if (media >= 6 && media < 7)
			System.out.print("Conceito: C");
		if (media >= 5 && media < 6)
			System.out.print("Conceito: D");
		if (media >= 0 && media < 5)
			System.out.print("Conceito: E");
	}
}