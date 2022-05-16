#include <stdio.h>
#include <math.h>
int main(void){
    int valor1, valor2, valor3, soma, quadrado;
    printf("Insira o primeiro valor:");
    scanf("%d", &valor1);
    printf("Insira o segundo valor:");
    scanf("%d", &valor2);
    printf("Insira o terceiro valor:");
    scanf("%d", &valor3);
    soma = valor1+valor2+valor3;
    quadrado = pow(soma, 2);
    printf("Quadrado da soma: %d", quadrado);
}