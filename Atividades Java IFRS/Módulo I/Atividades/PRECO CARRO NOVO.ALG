algoritmo "preco carro novo"
var
   preco_fabrica, preco_consumidor, lucro_dis, per_dis, tax, per_tax : real
inicio
      escreval("Insira o Preço de Fábrica: ")
      leia(preco_fabrica)
      escreval("Insira o Percentual de Lucro do Distribuidor: ")
      leia(per_dis)
      escreval("Insira o Percentual do Imposto: ")
      leia(per_tax)
      lucro_dis <- preco_fabrica*per_dis/100
      tax <- preco_fabrica*per_tax/100
      preco_consumidor <- preco_fabrica+lucro_dis+tax
      escreval("Lucro do Distribuidor: ", lucro_dis)
      escreval("Impostos: ", tax)
      escreval("Preço Final: ", preco_consumidor)
fimalgoritmo