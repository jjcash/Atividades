algoritmo "calculo do iptu 2"
var
   codigo : inteiro
   fator, area, valor_iptu : real
   tipo_imovel : caractere
inicio
      escreval("Digite o C�digo do Im�vel:")
      leia(codigo)
      escreval("Digite �rea do Im�vel:")
      leia(area)
      //valor que ser� testado para validar c�digo v�lido
      fator <- 0
      escolha (codigo)
      caso 1
           fator <- 200
           tipo_imovel <- "Residencial - Casa"
      caso 2
           fator <- 180
           tipo_imovel <- "Residencial - Pr�dio"
      caso 3
           fator <- 300
           tipo_imovel <- "Comercial - Casa"
      caso 4
           fator <- 280
           tipo_imovel <- "Comercial - Pr�dio"
      caso 5
           fator <- 400
           tipo_imovel <- "Industrial"
      fimescolha
      se (fator = 0) entao
         escreval("Tipo de Im�vel Inv�lido")
      senao
           valor_iptu <- area*fator
           escreval("�rea: ", area)
           escreval("Tipo de Im�vel: ", tipo_imovel)
           escreval("IPTU: ", valor_iptu
      fimse
fimalgoritmo
