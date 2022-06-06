#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>
int main(void){
	int sexoM=0, sexoF=0, numeroMoradores, escolaridade, continuar, totalResidencias = 0, residenciasColetam = 0, residenciasSeparam = 0;
	bool coletaAgua = false, lixoResidencial = false;
	double rendas=0;
	int residenciasNaoSeparam = 0;
	int residenciasNaoColetam = 0;
	int analfabetos=0, seriesIniciais=0, ensinoFundamental=0, ensinoMedio=0, ensinoSuperior=0, posGraduacao=0, outros=0;
	do{
		printf("Insira o sexo do entrevistado M ou F: \n");
		char sexo;
		scanf("%c", &sexo);
		sexo = toupper(sexo);
		printf("A familia separa o lixo? S ou N: \n");
		char separa;
		scanf("%c", &separa);
		separa = toupper(separa);
		if(separa == 'S'){
			lixoResidencial = true;
		}else{
			lixoResidencial = false;
		}
		printf("A familia coleta agua da chuva? S ou N: \n");
		char coleta;
		scanf("%c", &coleta);
		coleta = toupper(coleta);
		if(coleta == 'S'){
			coletaAgua = true;
		}else{
			coletaAgua = false;
		}
		printf("Insira o numero de moradores: \n");
		scanf("%d", &numeroMoradores);
		int mediaMoradores = mediaMoradores + numeroMoradores;
		printf("Insira a renda familiar: ");
		int renda;
		scanf("%f", &renda);
		rendas = rendas + renda;
		printf("Insira a escolaridade da pessoa pesquisada:\n");
		printf("1 - Analfabetos\n");
		printf("2 - Series Iniciais\n");
		printf("3 - Ensino Fundamental\n");
		printf("4 - Ensino Medio\n");
		printf("5 - Ensino Superior\n");
		printf("6 - Pos Graduacao\n");
		printf("7 - Outros\n");
		scanf("%d", &escolaridade);
		switch(escolaridade){
			case 1:
				analfabetos++;
				break;
			case 2:
				seriesIniciais++;
				break;
			case 3:
				ensinoFundamental++;
				break;
			case 4:
				ensinoMedio++;
				break;
			case 5:
				ensinoSuperior++;
				break;
			case 6:
				posGraduacao++;
				break;
			case 7:
				outros++;
				break;
			default:
				printf("O numero inserido eh invalido!");
		}
		if (sexo == 'M'){
			sexoM++;
		}else{
			sexoF++;
		}
		if (lixoResidencial == true){
			residenciasSeparam++;
		}else{
			residenciasNaoSeparam++;
		}
		if (coletaAgua == true){
			residenciasColetam++;
		}else{
			residenciasNaoColetam++;	
		}
		totalResidencias++;
		printf("Digite 1 para continuar e 2 para parar\n");
		scanf("%d", &continuar);
	}while (continuar == 1);
	int percentualSexoM = sexoM*sexoM/100;
	int percentualSexoF = sexoF*sexoF/100;
	int mediaRenda = rendas/totalResidencias;
	int mediaMoradores = mediaMoradores/totalResidencias;
	printf("Total de Residencias Pesquisadas: %d\n", totalResidencias);
	printf("Total de Residencias que Coletam Agua da Chuva: %d\n", residenciasColetam);
	printf("Total de Reisdencias que nao Coletam Agua da Chuva: %d\n", residenciasNaoColetam);
	printf("Total de residencias que Separam o Lixo: %d\n", residenciasSeparam);
	printf("Total de reisdencias que nao Separam o Lixo: %d\n", residenciasNaoSeparam);
	printf("Total de Homens Pesquisados: %d\n", sexoM);
	printf("Total de Mulheres Pesquisadas: %d\n", sexoF);
	printf("Percentual de Homens: %d -- Percentual de Mulheres: %d\n", percentualSexoM, percentualSexoF);
	printf("Media da Renda Familiar dos Entrevistados: %f\n", mediaRenda);
	printf("Media de Moradores por Residencia: %d\n", mediaMoradores);
	printf("Total de Pesquisados Analfabetos: %d\n", analfabetos);
	printf("Total de Pesquisados Series Iniciais: %d\n", seriesIniciais);
	printf("Total de Pesquisados Ensino Fundamental: %d\n", ensinoFundamental);
	printf("Total de Pesquisados Ensino Medio: %d\n", ensinoMedio);
	printf("Total de Pesquisados Ensino Superior: %d\n", ensinoSuperior);
	printf("Total de Pesquisados Pos Graduacao: %d\n", posGraduacao);
	printf("Total de Pesquisados Outros: %d\n", outros);
}
