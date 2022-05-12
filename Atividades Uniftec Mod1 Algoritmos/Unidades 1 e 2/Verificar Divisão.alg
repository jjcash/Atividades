algoritmo "verificar divisão"
var
   numero : inteiro
inicio
      escreval("Insira um Número!:")
      leia(numero)
      se (numero mod 10 = 0) entao
         escreval("O Número é Divisível por 10!")
      senao
           se (numero mod 5 = 0) entao
              escreval("O Número é Divisível por 5!")
           senao
                se (numero mod 3 = 0) entao
                   escreval("O Número é Divisível por 3!")
                senao
                     se (numero mod 2 = 0) entao
                        escreval("O Número é Divisível por 2!")
                     senao
                          escreval("Não é Divisível!")
                          fimse
                     fimse
                fimse
           fimse
fimalgoritmo
