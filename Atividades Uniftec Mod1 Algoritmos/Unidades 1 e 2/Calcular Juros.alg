algoritmo "calculo prestacao em atraso"
var
 valor, juros_dia, dias_atraso, total_pagar, total_juros : real
inicio
 escreva("Insira o valor da presta��o: ")
 leia(valor)
 escreva("Quantos dias est� atrasada?: ")
 leia(dias_atraso)
 escreva("Quanto � a porcentagem de juros ao dia: ")
 leia(juros_dia)
 total_juros <- ((juros_dia/100)*valor)*dias_atraso)
 total_pagar <- total_juros+valor
 escreval("Valor da Presta��o: ", valor)
 escreval("Valor Total dos Juros: ", total_juros)
 escreval("Total a pagar: ", total_pagar)
 fimalgoritmo
