#include <stdio.h>
#include <math.h>
int calcularVolume(int raio){
	int volume;
	volume = 4 * 3.14 * pow(raio, 3)/3; 
	return volume;
}
int main(void){
	printf("Insira o raio da esfera: ");
	int raio;
	scanf("%d", &raio);
	int volume = calcularVolume(raio);
	printf("Volume da esfera: %d", volume);
}
