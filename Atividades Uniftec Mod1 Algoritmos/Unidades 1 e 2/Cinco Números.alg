algoritmo "Cinco Números"
var
   num1, num2, num3, num4, num5, maior : real
inicio
      escreval("Escreva o Primeiro Número: ")
      leia(num1)
      escreval("Escreva o Segundo Número: ")
      leia(num2)
      escreval("Escreva o terceiro Número: ")
      leia(num3)
      //provavelmente existe um jeito melhor bem melhor, mas eu fiz assim:
      se (num1 > num2) ou (num1 > num3) ou (num1 > num4) ou (num1 > num5) entao
         maior <- num1
      senao
           se (num2 > num1) ou (num2 > num3) ou (num2 > num4) ou (num2 > num5) entao
              maior <- num2
           senao
                se (num3 > num1) ou (num3 > num2) ou (num3 > num4) ou (num3 > num5) entao
                   maior <- num3
                senao
                     se (num4 > num1) ou (num4 > num2) ou (num4 > num3) ou (num4 > num5) entao
                        maior <- num4
                     senao
                          se (num5 > num1) ou (num5 > num2) ou (num5 > num3) ou (num5 > num4) entao
                             maior <- num5
                          fimse
                     fimse
                fimse
           fimse
      fimse
      escreval("O Maior Número é: ", maior)
fimalgoritmo
