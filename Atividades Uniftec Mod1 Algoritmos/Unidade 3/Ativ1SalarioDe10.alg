algoritmo "Ativ1SalarioDe10"
var
   acima, abaixo, sal : real
   cont : inteiro
inicio
      acima <- 0
      abaixo <- 0
      sal <- 0
      cont <- 0
      para cont de 1 ate 10 faca
           escreval("Digite o salario do funcionario: ")
           leia(sal)
                    se sal >= 5000 entao
                    acima <- acima + 1
                    senao
                         abaixo <- abaixo + 1
                    fimse
           fimpara
      escreval("Salarios maior ou iguais a 5k: ", acima)
      escreval("Salarios abaixo de 5k: ", abaixo)
fimalgoritmo



