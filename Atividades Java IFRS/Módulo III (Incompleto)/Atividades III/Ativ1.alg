algoritmo "Ativ1"
var
   matriz : vetor [1..6, 1..4] de real
   maior : vetor [1..4] de real
   soma : vetor [1..6] de real
   count, linha : inteiro
inicio
      count <- 1
      linha <- 1
      para count de 1 ate 4 faca
           maior[count] <- 0
      fimpara
      para count de 1 ate 4 faca
           para linha de 1 ate 6 faca
                matriz[linha, count] <- randi(100)+1
           fimpara
      fimpara
      para count de 1 ate 4 faca
           para linha de 1 ate 6 faca
                se matriz[linha, count] > maior[count] entao
                   maior[count] <- matriz[linha, count]
                fimse
           fimpara
      fimpara
      para count de 1 ate 4 faca
           para linha de 1 ate 6 faca
                soma[linha] <- soma[linha] + matriz[linha, count]
           fimpara
      fimpara
      para count de 1 ate 4 faca
           para linha de 1 ate 6 faca
                soma[linha] <- soma[linha] * maior[count]
           fimpara
      fimpara
      para linha de 1 ate 6 faca
           escreval(soma[linha])
      fimpara
fimalgoritmo



      
   
