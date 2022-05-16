#include <stdio.h>
int main(void){
    double precoSessao, precoIngresso, valorLucrar, valorLucro30;
    printf("Insira o preco de um sessao: ");
    scanf("%lf", &precoSessao);
    printf("Insira o preco do Ingresso: ");
    scanf("%lf", &precoIngresso);
    valorLucrar = precoSessao/precoIngresso;
    valorLucro30 = ((precoSessao*30/100)+precoSessao)/precoIngresso;
    printf("Quantidade de ingressos que precisam ser vendidos para lucrar: %.0lf\n", valorLucrar);
    printf("Quantidade de ingressos para ter lucro de 30 porcento: %.0lf", valorLucro30);
}