#include <stdio.h>
int main (void){
	int salario;
	double ferias, total;
	printf("Digite o salario do funcionario: ");
	scanf("%d", &salario);
	ferias = salario/3.0;
	total = salario+ferias;
	printf("Salario bruto: %d\n", salario);
	printf("Valor das ferias: %lf\n", ferias);
	printf("Salario total: %lf\n", total);
}
