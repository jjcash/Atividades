algoritmo "Horas Trabalhadas"
// Fun��o : Escreva um algoritmo que leia o n�mero de horas trabalhadas por um profissional aut�nomo e tamb�m o valor hora e o percentual de imposto que ele deve pagar. Calcule o valor do imposto a ser descontado desse profissional e o valor l�quido que ele tem por receber. Escreva, primeiramente, o valor do imposto e na sequ�ncia o valor l�quido.
// Autor : Guilherme Zampiron Daniel
// Data : 09/03/2022
// Se��o de Declara��es 
var
 imposto, valor_liquido, total, horas, valor : real
 inicio
  escreva ("Digite o n�mero de horas trabalhadas: ")
  leia(horas)
  escreva ("Digite o valor da hora: ")
  leia(valor)
  imposto <- (horas * valor)15 / 100
  total <- horas * valor
  valor_liquido <- imposto * 75/100
  escreva ("Valor do Imposto: ", imposto)
  escreva ("Valor liquido: ", valor_liquido)
  // Se��o de Comandos
fimalgoritmo
