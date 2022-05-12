public class Ativ4 {
	public static void main(String[] args) {
		double salario, folha_pagamento=0, total_imposto=0, salario_temp;
		int count=1;
		System.out.println("***PowerSoftware Ltda.***");
		do{
			System.out.printf("Digite o salario do funcionario %d\n", count);
			salario=Double.parseDouble(System.console().readLine());
			if(salario>=1903.99 && salario<=2826.65){
				total_imposto+=(salario*7.5)/100;
					if(salario>=2826.66 && salario<=3751.05)
						total_imposto+=(salario*15)/100;
						if(salario>=3751.06 && salario<=4664.68)
							total_imposto+=(salario*22.5)/100;
							if(salario>4664.68)
								total_imposto+=(salario*27.5)/100;
			}
			salario_temp=salario;
			if(salario<=1693.72){
				salario_temp-=(salario*8)/100;
				if(salario>=1693.73 && salario<=2822.90)
					salario_temp-=(salario*9)/100;
					if(salario>2822.90)
						salario_temp-=(salario*11)/100;
			}
			salario_temp-=(salario*4.5)/100;
			folha_pagamento+=salario_temp;
			count++;
			System.out.printf("Salario do Funcionario %d: %.2f\n", count, salario_temp);
		}while(count<=58);			
		System.out.printf("Valor do imposto de renda a recolher: %.2f\n", total_imposto);
		System.out.printf("Valor total da folha de pagamento: %.2f\n", folha_pagamento);
	}
}