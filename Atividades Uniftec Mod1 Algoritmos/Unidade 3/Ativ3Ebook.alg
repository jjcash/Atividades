algoritmo "Ativ3Ebook"
var
   num, multi : real
   vzs, vezes: inteiro
inicio
      escreval("Valor inicial: ")
      leia(num)
      escreval("Por quanto: ")
      leia(multi)
      escreval("Quantas vezes: ")
      leia(vezes)
      para vzs de 1 ate vezes passo 1 faca
           num <- (num * multi)
           escreval(num)
      fimpara
fimalgoritmo

