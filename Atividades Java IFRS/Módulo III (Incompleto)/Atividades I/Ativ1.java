public class Ativ1 {
	public static void main(String[] args) {
		int pes_num = 1, idade = 0, idade_menor = 200, idade_maior=0, mulher_sal, med_idade = 0, men_sal_ida = 0, med_ida_fin = 0, mul_menor = 0, mas = 0, fem = 0; 
		//tentar diminuir a quantidade de variaveis
		double sal = 0, med_sal = 0, med_sal_fin = 0, men_sal = 500000;
		char sexo, men_sal_sex = 'x';
		System.out.println("##Pesquisa de Salario##");
		System.out.println("Digite a idade -1 para parar!");
		do{
			System.out.printf("Digite a idade do entrevistado N. %d: \n", pes_num);
			idade = Integer.parseInt(System.console().readLine());
			if(idade != -1){
			System.out.printf("Digite o salario do entrevistado N. %d: \n", pes_num);
			sal = Double.parseDouble(System.console().readLine());
			System.out.printf("Digite o sexo 'm ou f' do entrevistado N. %d:\n", pes_num);
				sexo = (char)System.console().readLine().charAt(0);
				if(sexo == 'm')
					mas++;
				else
					fem++;
				med_sal = med_sal + sal;
				if(sal < men_sal)
					men_sal_sex = sexo;
				med_idade = med_idade + idade;
				if(sal < men_sal){
					men_sal = sal;
				    men_sal_ida = idade;
				}
				if(idade > idade_maior)
					idade_maior = idade;
				if(idade < idade_menor)
					idade_menor = idade;
				if(sexo == 'f' && sal<1500)
					mul_menor++;
				pes_num++;
			}
		}while(idade != -1);		
		med_sal_fin = med_sal/pes_num;
		med_ida_fin = med_idade/pes_num;
		System.out.println("          ***Resultados***");
		System.out.printf("Media dos salarios do grupo: %.2f\n", med_sal_fin);
		System.out.printf("Maior idade do grupo: %d\n", idade_maior);
		System.out.printf("Menor idade do grupo: %d\n", idade_menor);
		System.out.printf("Mulheres com salario de ate R$ 1500,00: %d\n", mul_menor);
		System.out.printf("Idade da pessoa com o menor salario: %d\n", men_sal_ida);
		System.out.printf("Sexo da pessoa com o menor salario: %c\n", men_sal_sex);
	}
}       			