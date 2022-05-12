algoritmo "Ativ2"
var
   numero:vetor[1..5] de inteiro
   count, soma : inteiro
inicio
      count <- 1
      soma <- 0
      para count de 1 ate 5 faca
           escreval("Digite o numero ", count)
           leia(numero[count])
      fimpara
      para count de 1 ate 5 faca
             soma <- soma + numero[count]
      fimpara
      escreva(numero[1])
      escreva(" +")
      escreva(numero[2])
      escreva(" +")
      escreva(numero[3])
      escreva(" +")
      escreva(numero[4])
      escreva(" +")
      escreva(numero[5])
      escreva(" =")
      escreva(soma)
fimalgoritmo
