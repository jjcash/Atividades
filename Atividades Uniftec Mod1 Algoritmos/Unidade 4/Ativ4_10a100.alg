algoritmo "Ativ4_10a100"
var
num, count : inteiro
inicio
      count <- 0
      num <- 1
      enquanto (num <> 0) faca
      escreval("Digite um n�mero: ")
      leia(num)
      se (num >= 10) e (num <= 100) entao
         count <- count + 1
      fimse
      fimenquanto
      escreval("O total de n�meros dentro do intervalo de 10 a 100 � ", count)
fimalgoritmo
