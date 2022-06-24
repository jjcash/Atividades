#include <stdio.h>
#include <stdbool.h>
bool verPar(int parametro){
	bool teste;
	if(parametro % 2 == 0){
		return teste = true;
	}
	return teste = false;
}
int main(void){
	int numeroTestar;
	do{
		printf("Insira um numero inteiro maior que 0: \n");
		scanf("%d", &numeroTestar);
		bool teste;
		teste = verPar(numeroTestar);
		if(numeroTestar != 0){
			if(teste == true){
				printf("O numero inserido eh par!!!\n");
			}else{
				printf("O numero inserido eh impar!!!\n");
			}
		}else{
			printf("Teste encerrado!\n");
		}
	}while(numeroTestar != 0);
}

