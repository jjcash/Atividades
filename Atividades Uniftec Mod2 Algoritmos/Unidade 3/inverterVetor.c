#include <stdio.h>
int main(void){
	int vetorA[10], vetorB[10];
	for(int i = 0;i<30;i++){
		vetorA[i]=rand()%100;
	}
	int index2 = 9;
	for(int i = 0;i<10;i++){
		vetorB[i] = vetorA[index2];
		index2--;
	}
	for(int i = 0;i<10;i++){
			printf("Valor da posicao %d do vetor A: %d | Valor da posicao %d do vetor B: %d \n", i+1, vetorA[i], i+1, vetorB[i]);
	}
}
