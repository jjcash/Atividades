algoritmo "Gasto de Combust�vel"
var
   codigo : inteiro
   distancia, fator : real
inicio
      escreval("Insira o C�digo do Ve�culo: ")
      leia(codigo)
      escreval("Insira a dist�ncia Percorrida: ")
      leia(distancia)
      fator <- 0
      escolha (codigo)
      caso 1
           fator <- 14
      caso 2
           fator <- 12
      caso 3
           fator <- 10
      caso 4
           fator <- 6
      caso 5
           fator <- 5
      fimescolha
      se (fator = 0) entao
         escreval("C�digo de Ve�culo Inv�lido!!!")
      senao
           escreval("Combust�vel Consumido: ", distancia/fator:4:0)
      fimse
fimalgoritmo
