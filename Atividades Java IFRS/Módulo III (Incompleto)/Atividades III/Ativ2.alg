algoritmo "Ativ2"
var
   matriz : vetor [1..10, 1..10] de inteiro
   count : inteiro
   soma : real
inicio
      para count de 1 ate 10 faca
           matriz[count, count] <- randi(10)+1
      fimpara
      para count de 1 ate 10 faca
           soma <- soma + matriz[count, count]
      fimpara
      soma <- soma / 10
      escreval(soma)
fimalgoritmo


