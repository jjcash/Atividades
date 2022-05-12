algoritmo "Horas Trabalhadas"
// Função : Escreva um algoritmo que leia o número de horas trabalhadas por um profissional autônomo e também o valor hora e o percentual de imposto que ele deve pagar. Calcule o valor do imposto a ser descontado desse profissional e o valor líquido que ele tem por receber. Escreva, primeiramente, o valor do imposto e na sequência o valor líquido.
// Autor : Guilherme Zampiron Daniel
// Data : 09/03/2022
// Seção de Declarações 
var
 imposto, valor_liquido, total, horas, valor : real
 inicio
  escreva ("Digite o número de horas trabalhadas: ")
  leia(horas)
  escreva ("Digite o valor da hora: ")
  leia(valor)
  imposto <- (horas * valor)15 / 100
  total <- horas * valor
  valor_liquido <- imposto * 75/100
  escreva ("Valor do Imposto: ", imposto)
  escreva ("Valor liquido: ", valor_liquido)
  // Seção de Comandos
fimalgoritmo
