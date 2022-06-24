#include <stdio.h>
int main(void){
	int matriz[10][10];
	for(int i=0;i<10;i++){
		for(int index=0;index<10;index++){
			matriz[i][index] = rand()%100;
		}
	}
	for(int i=0;i<10;i++){
		for(int index=0;index<10;index++){
			printf("Valor na posicao %dX%d da matriz: %d \n", i+1, index+1, matriz[i][index]);
		}
	}
}
