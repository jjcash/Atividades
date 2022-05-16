#include <stdio.h>
int main(void){
    //não vou usar um loop porque ainda não caiu nessa disciplina
    double nota1, nota2, nota3, media;
    printf("Insira a primeira nota:");
    scanf("%lf", &nota1);
    printf("Insira a segunda nota:");
    scanf("%lf", &nota2);
    printf("Insira a terceira nota:");
    scanf("%lf", &nota3);
    media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
    printf("Media ponderada: %.1lf", media);
}