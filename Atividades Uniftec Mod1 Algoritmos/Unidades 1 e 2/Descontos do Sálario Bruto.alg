algoritmo "descontos salario"
var
 salario_bruto, previdencia, salario_liquido : real
inicio
 escreva("Insira o Sal�rio Bruto: ")
 leia(salario_bruto)
 previdencia <- salario_bruto*0.10
 salario_liquido <- ((salario_bruto-previdencia)*0.30)-salario_bruto+previdencia
 escreva("Sal�rio L�quido", salario_liquido*-1)
 fimalgoritmo
