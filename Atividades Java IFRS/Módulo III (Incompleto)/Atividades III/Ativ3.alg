algoritmo "Ativ3"
var
   matriz : vetor [1..5, 1..5] de real
   soma : real
   count : inteiro
inicio
      para count de 5 ate 1 passo -1 faca
           matriz[count, count] <- randi(10)
      fimpara
      para count de 5 ate 1 passo -1 faca
           soma <- soma + matriz[count, count]
      fimpara
      escreval(soma)
fimalgoritmo
