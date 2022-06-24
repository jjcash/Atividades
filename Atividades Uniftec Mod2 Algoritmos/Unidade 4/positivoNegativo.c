#include <stdio.h>
#include <stdbool.h>
bool positivoNegativo(int parametro){
	bool teste;
	if(parametro >= 0){
		return teste = true;
	}else{
		return teste = false;
	}
}
int main(void){
	printf("Insira um numero: ");
	int num;
	scanf("%d", &num);
	bool teste = positivoNegativo(num);
	if(teste == true){
		printf("O numero eh positivo!");
	}else{
		printf("O numero eh negativo!");
	}
}
