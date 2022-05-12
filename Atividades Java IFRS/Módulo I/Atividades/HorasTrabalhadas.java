public class HorasTrabalhadas {
	public static void main(String[] args) {
		double horas_tr, sal_min, sal;
		
		System.out.print("Digite a Quantidade de Horas Trabalhadas: ");
		horas_tr = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o Salario Minimo: ");
		sal_min = Double.parseDouble(System.console().readLine());
		
		sal = horas_tr*sal_min;
		
		System.out.printf("Salario: %.2f", sal);
	}
}