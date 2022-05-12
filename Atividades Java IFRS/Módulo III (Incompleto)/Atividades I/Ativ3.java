public class Ativ3 {
	public static void main(String[] args) {
		int sex_m=0, sex_f=0, idade_m=0, idade_f=0, exp, idade, exp_f=0, count=0, count_f=0, idade_exp=0, count_m=0, count_ff=0;
		char sexo;
		System.out.println("***JS Recrutamento e Selecao Ltda.***");
		do{
			System.out.println("*Insira uma idade negativa para parar o programa!");
			System.out.print("Digite a idade do candidato: ");
			idade=Integer.parseInt(System.console().readLine());
			if(idade>0){
				System.out.print("Digite o sexo 'M ou F' do candidato: ");
				sexo=(char)System.console().readLine().charAt(0);
				System.out.print("Digite os anos de experiencia do candidato: ");
				exp=Integer.parseInt(System.console().readLine());
				if(sexo=='m'){
					sex_m++;
					idade_m+=idade;
					count_m++;
				}else{
					sex_f++;
					idade_f+=idade;
					count_ff++;
				}
				if(sexo=='f' && exp>0){
					exp_f++;
					count_f++;
					idade_exp+=idade;
				}
				count++;
			}
		}while(idade>0);
		idade_m=idade_m/count_m;
		idade_f=idade_f/count_ff;
		idade_exp=idade_exp/count_f;
		System.out.println("##Resultados##");
		System.out.printf("Total de candidatos: %d\n", count);
		System.out.printf("Candidatos do sexo feminino: %d\n", sex_f);
		System.out.printf("Candidatos do sexo masculino: %d\n", sex_m);
		System.out.printf("Idade media dos homens: %d\n", idade_m);
		System.out.printf("Idade media das mulheres: %d\n", idade_f);
		System.out.printf("Idade media das mulheres com experiencia: %d\n", idade_exp);
		System.out.print("Programa Finalizado!!!");
	}
}