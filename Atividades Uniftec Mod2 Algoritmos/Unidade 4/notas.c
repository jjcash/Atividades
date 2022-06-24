#include <stdio.h>
void notas(float nota1, float nota2){
	float resultado = nota1 + nota2;
	resultado = resultado/2;
	if(resultado <= 10 && resultado >= 0){
		if(resultado >= 6){
			printf("PARABENS! Voce foi aprovado! Nota: %.1f\n", resultado);
		}else{
			printf("Voce foi reprovado. Nota: %.1f\n", resultado);
		}
	}else{
		printf("O numero digitado eh invalido!\n");
	}
}
int main (void){
	printf("Digite 00 para parar!\n");
	float notaA, notaB;
	do{
		printf("Digite a primeira nota: \n");
		scanf("%f", &notaA);
		if(notaA < 0 || notaA > 10){
			printf("A nota digitada eh invalida!");
			break;
		}
		if(notaA != 00){
			printf("Digite a segunda nota: \n");
			scanf("%f", &notaB);
			if(notaB < 0 || notaB > 10){
				printf("A nota digitada eh invalida!");
				break;
			}
			notas(notaB, notaA);
		}else{
			printf("Programa encerrado!");
		}
	}while(notaA != 00);
}
