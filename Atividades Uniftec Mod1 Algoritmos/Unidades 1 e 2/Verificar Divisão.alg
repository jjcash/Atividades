algoritmo "verificar divis�o"
var
   numero : inteiro
inicio
      escreval("Insira um N�mero!:")
      leia(numero)
      se (numero mod 10 = 0) entao
         escreval("O N�mero � Divis�vel por 10!")
      senao
           se (numero mod 5 = 0) entao
              escreval("O N�mero � Divis�vel por 5!")
           senao
                se (numero mod 3 = 0) entao
                   escreval("O N�mero � Divis�vel por 3!")
                senao
                     se (numero mod 2 = 0) entao
                        escreval("O N�mero � Divis�vel por 2!")
                     senao
                          escreval("N�o � Divis�vel!")
                          fimse
                     fimse
                fimse
           fimse
fimalgoritmo
