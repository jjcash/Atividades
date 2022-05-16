#include <stdio.h>
#include <math.h>
int main (void){
    int base, volume;
    printf("Insira a area da base:\n");
    scanf("%d", &base);
    volume = pow(base, 3);
    printf("Volume do cubo: %d", volume);
}