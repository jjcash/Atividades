algoritmo "horas trabalhadas"
var
   horas_tr, sal_min, sal : real
inicio
      escreval("Digite a Quantidade de Horas Trabalhadas: ")
      leia(horas_tr)
      escreval("Digite o Sal�rio M�nimo: ")
      leia(sal_min)
      sal <- sal_min*horas_tr
      escreval("Sal�rio: ", sal)
fimalgoritmo