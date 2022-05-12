algoritmo "Ativ8Site"
var
   num, vzs, num_check, num_check2 : inteiro
inicio
      num_check <- 0
      num_check2 <- 0
      para vzs de 1 ate 10 passo 1 faca
           escreval("insira um numero: ")
           leia(num)
           se (num >= 10) e (num <=20) entao
              num_check <- num_check + 1
              senao
                   num_check2 <- num_check2 + 1
           fimse
      fimpara
      escreval("Numeros dentro do intervalo de 10 a 20: ", num_check)
      escreval("Numeros fora do intervalo: ", num_check2)
fimalgoritmo