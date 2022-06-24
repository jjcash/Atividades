#include <stdio.h>
#define max 10
void lerVetor(int A[max]){
	for(int i=0;i<max;i++){
		printf("Digite o valor %d do vetor: \n", i+1);
		scanf("%d", &A[i]);
	}
}
void separarValores(int vetorA[max], int vetorX[max], int vetorY[max]){
	for(int i=0;i<max;i++){
		if(vetorA[i] <= 0){
			vetorY[i] = vetorA[i];
		}else{
			vetorX[i] = vetorA[i];
		}
	}
	for(int i=0;i<max;i++){
		printf("Valor n. %d do vetor X: %d - Valor n. %d do vetor Y: %d\n", i+1, vetorX[i], i+1, vetorY[i]);
	}
}
int mediaVetor(int vetorA[max]){
	int media;
	for(int i=0;i<max;i++){
		media += vetorA[i];
	}
	return media;
}
void contarValores(int vetorA[max]){
	int valores=0;
	for(int i=0;i<max;i++){
		if(vetorA[i]>10 && vetorA[i]<20){
			valores++;
		}
	}
	printf("Valores entre 10 e 20: %d\n", valores);
}
int main(void){
	int vetorA[max]={0}, vetorX[max]={0}, vetorY[max]={0};
	lerVetor(vetorA);
	for(int i=0;i<max;i++){
		printf("Valor da posicao %d do vetor A: \n", i+1, vetorA[i]);
	}
	separarValores(vetorA, vetorX, vetorY);
	printf("Media dos valores armazenados no Vetor A: %d\n", mediaVetor(vetorA)/10);
	contarValores(vetorA);
}
