#include <stdio.h>
int main(void){
	int matriz[5][5];
	for(int i=0;i<5;i++){
		for(int index=0;index<5;index++){
			matriz[i][index]=rand()%100;
		}
	}
	int index=4;
	for(int i=0;i<5;i++){
		printf("Multiplicacao da posicao %dX%d pela posicao %dX%d: %d \n", i+1, i+1, index+1, index+1, matriz[i][i]*matriz[index][i]);
		index--;
	}
}
