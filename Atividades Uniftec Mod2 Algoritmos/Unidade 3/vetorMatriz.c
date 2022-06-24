#include <stdio.h>
int main(void){
	int gabarito[10]={1,2,3,4,5,1,2,3,4,5}, respostas[5][10], notaAluno[5]={0};
	for(int i=0;i<5;i++){
		for(int index=0;index<10;index++){
			respostas[i][index]=rand()%5;
		}
	}
	for(int i=0;i<5;i++){
		for(int index=0;index<10;index++){
			if(respostas[i][index]==gabarito[index]){
				notaAluno[i]++;
			}
		}
	}
	for(int i=0;i<5;i++){
		printf("Nota do aluno %d: %d\n", i+1, notaAluno[i]);
	}
}
