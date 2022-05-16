#include <stdio.h>
int main(void){
    double temperatura_c, temperatura_f;
    printf("Insira a temperatura em Fahrenheit:");
    scanf("%lf", &temperatura_f);
    temperatura_c = (temperatura_f-32)*5/9;
    printf("A temperatura em Celsius eh %lf", temperatura_c);
}