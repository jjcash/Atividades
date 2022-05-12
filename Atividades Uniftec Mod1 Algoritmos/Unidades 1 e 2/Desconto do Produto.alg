algoritmo "Desconto do Produto"
var
   idade, produto, desconto : real
inicio
      escreval("Insira a Idade do Cliente: ")
      leia(idade)
      escreval("Insira o Valor do Produto: ")
      leia(produto)
      desconto <- produto*idade/100
      escreval("Valor Final do Produto: ", produto-desconto)
fimalgoritmo
