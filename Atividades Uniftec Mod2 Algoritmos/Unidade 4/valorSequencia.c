#include <stdio.h>
float sequencia(int num){
	float seq = 1, i;
	for(i = 2; i <= num; i++){
		seq = seq + 1/i;
	}
	return seq;
}
int main(void){
	printf("Insira um numero: ");
	int num;
	scanf("%d", &num);
	if(num > 0){
		float seq = sequencia(num);
		printf("Valor da sequencia: %.2f", seq);
	}else{
		printf("Numero invalido!");
	}
}
