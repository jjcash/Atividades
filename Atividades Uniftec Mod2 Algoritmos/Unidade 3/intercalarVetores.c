#include <stdio.h>
#include <stdbool.h>
int main(void){
	int vetorA[30], vetorB[30], vetorC[60];
	for(int i = 0;i<30;i++){
		vetorA[i]=rand()%100;
		vetorB[i]=rand()%100;
	}
	bool verVetor = true;
	int i1 = 0, i2 = 0;
	for(int vets=0;vets<60;vets++){
		if(verVetor == true && i1<30){
			vetorC[vets] = vetorA[i1];
			verVetor = false;
			i1++;
		}else{
			vetorC[vets] = vetorB[i2];
			verVetor = true;
			i2++;
			}
		}
	for(int index=0;index<60;index++){
		printf("Posicao %d do Vetor C: %d\n", index+1, vetorC[index]);
	}
	for(int index=0;index<30;index++){
			printf("Posicao %d do Vetor A: %d\n", index+1, vetorA[index]);
			printf("Posicao %d do Vetor B: %d\n", index+1, vetorB[index]);
	}
}
