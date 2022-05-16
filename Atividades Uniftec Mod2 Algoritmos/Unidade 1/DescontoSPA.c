#include <stdio.h>
int main(void){
    int quantidadeQuartos;
    double valorDiaria, valorMaximo, valorDescontado, valorCliente;
    printf("Insira o numero total de quartos no hotel: ");
    scanf("%d", &quantidadeQuartos);
    printf("Insira o valor da diaria sem desconto: ");
    scanf("%lf", &valorDiaria);
    //desconto de 27%
    valorCliente = valorDiaria*27/100;
    valorDescontado = valorCliente*quantidadeQuartos;
    valorMaximo = valorDiaria*quantidadeQuartos-valorDescontado;
    printf("Valor a ser pago pelo cliente: %.2lf\n", valorCliente);
    printf("Valor total que o SPA podera arrecadar: %.2lf\n", valorMaximo);
    //total caso esteja lotado
    printf("Valor que o SPA deixara de receber em funcao do desconto: %.2lf", valorDescontado);
}