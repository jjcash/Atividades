#include <stdio.h>
int main(void){
	int vetorA[20], vetorB[20], vetorC[20];
	for(int i=0; i<20;i++){
		vetorA[i]=rand()%100;
		vetorB[i]=rand()%100;
		vetorC[i] = vetorA[i]+vetorB[i];
	}
	for(int i=0;i<20;i++){
		printf("Posicao %d do Vetor A: %d\n", i+1, vetorA[i]);
		printf("Posicao %d do Vetor B: %d\n", i+1, vetorB[i]);
		printf("Posicao %d do Vetor C: %d\n", i+1, vetorC[i]);
	}
}
