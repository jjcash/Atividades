algoritmo "calculo do iptu 2"
var
   codigo : inteiro
   fator, area, valor_iptu : real
   tipo_imovel : caractere
inicio
      escreval("Digite o Código do Imóvel:")
      leia(codigo)
      escreval("Digite Área do Imóvel:")
      leia(area)
      //valor que será testado para validar código válido
      fator <- 0
      escolha (codigo)
      caso 1
           fator <- 200
           tipo_imovel <- "Residencial - Casa"
      caso 2
           fator <- 180
           tipo_imovel <- "Residencial - Prédio"
      caso 3
           fator <- 300
           tipo_imovel <- "Comercial - Casa"
      caso 4
           fator <- 280
           tipo_imovel <- "Comercial - Prédio"
      caso 5
           fator <- 400
           tipo_imovel <- "Industrial"
      fimescolha
      se (fator = 0) entao
         escreval("Tipo de Imóvel Inválido")
      senao
           valor_iptu <- area*fator
           escreval("Área: ", area)
           escreval("Tipo de Imóvel: ", tipo_imovel)
           escreval("IPTU: ", valor_iptu
      fimse
fimalgoritmo
