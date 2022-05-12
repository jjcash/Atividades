algoritmo "Ativ1_Altura"
var
anos_m, anos_f : inteiro
altura_m, altura_f : real
inicio
altura_m <- 0
altura_f <- 0
anos_m <- 0
anos_f <- 0
      enquanto (altura_m <= altura_f) ou ((anos_m = 20) e (anos_f = 20)) faca
               escreval("Digite a idade do menino: ")
               leia(anos_m)
               escreval("Digite a altura do menino em cm: ")
               leia(altura_m)
               escreval("Digite a idade da menina: ")
               leia(anos_f)
               escreval("Digite a altura da menina em cm: ")
               leia(altura_f)
      fimenquanto
      escreval("Idade do menino: ", anos_m)
      escreval("Altura do menino: ", altura_m)
      escreval("Idade da menina: ", anos_f)
      escreval("Altura da menina: ", altura_f)
fimalgoritmo
