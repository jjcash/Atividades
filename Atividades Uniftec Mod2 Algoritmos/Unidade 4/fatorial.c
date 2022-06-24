#include <stdio.h>
int fatorial(int parametro){
	int fat;
	for(fat = 1;parametro > 1;parametro--){
		fat *= parametro;
	}
	return fat;
}
int main(void){
	printf("Insira um numero para calcular o fatorial: ");
	int num;
	scanf("%d", &num);
	printf("%d", fatorial(num));
}
