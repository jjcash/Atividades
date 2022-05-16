#include <stdio.h>
int main(void){
    double precoOriginal, precoDesconto, desconto;
    printf("Insira o valor do produto:");
    scanf("%lf", &precoOriginal);
    desconto = precoOriginal*10/100;
    precoDesconto = precoOriginal-desconto;
    printf("Valor Original: %.2lf\n", precoOriginal);
    printf("Valor do Desconto: %.2lf\n", desconto);
    printf("Valor Final: %.2lf", precoDesconto);
}