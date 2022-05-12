algoritmo "Ativ1"
var
   nome_produto:vetor[1..10] de literal
   codigo_produto:vetor[1..10] de inteiro
   valor_produto:vetor[1..10] de real
   count1, count2, count3, count : inteiro
inicio
      count1 <- 1
      count2 <- 1
      count3 <- 1
      count <- 1
      para count1 de 1 ate 10 faca
           escreval("Insira o nome do produto N.", count1)
           leia(nome_produto[count1])
      fimpara
      para count2 de 1 ate 10 faca
           escreval("Insira o codigo do produto N.",  count2)
           leia(codigo_produto[count2])
      fimpara
      para count3 de 1 ate 10 faca
           escreval("Insira o valor do produto N.", count3)
           leia(valor_produto[count3])
      fimpara
      para count de 1 ate 10 faca
           se (codigo_produto[count] % 2 = 0) e (valor_produto[count] > 1000) entao
              valor_produto[count] <- valor_produto[count] * 20 / 100
              senao
              se (codigo_produto[count] % 2 = 0) entao
                 valor_produto[count] <- valor_produto[count] * 15 / 100
                 senao
                 se (valor_produto[count] > 1000) entao
                    valor_produto[count] <- valor_produto[count] * 10 / 100
                    fimse
                 fimse
              fimse
           fimpara
      para count de 1 ate 10 faca
      escreval("Produto N.: ", count)
      escreval("Nome do produto: ", nome_produto[count])
      escreval("Codigo do Produto: ", codigo_produto[count])
      escreval("Novo valor do produto: ", valor_produto[count])
      fimpara
fimalgoritmo
