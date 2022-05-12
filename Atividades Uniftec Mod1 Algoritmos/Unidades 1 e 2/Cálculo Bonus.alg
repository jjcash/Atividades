algoritmo "calculo bonus"
var
 salario_base, total, bonus : real
inicio
 escreva("Insira o Sálario Base do Funcionário: ")
 leia(salario_base)
 bonus <- ((salario_base*20/100)+salario_base)-salario_base*7/100
 total <- (bonus*7/100)-bonus
 escreva("Total do Sálario: ", bonus)
fimalgoritmo
