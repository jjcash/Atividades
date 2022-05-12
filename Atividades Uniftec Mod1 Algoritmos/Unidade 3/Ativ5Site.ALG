algoritmo "Ativ7Site"
var
   maior_idade, menor_idade, idade, check : inteiro
inicio
      maior_idade <- 0
      menor_idade <- 0
      para check de 1 ate 10 passo 1 faca
           escreval("Insira a idade: ")
           leia(idade)
           se idade >= 18 entao
              maior_idade <- maior_idade + 1
           senao
                menor_idade <- menor_idade + 1
           fimse
      fimpara
      escreval("Pessoas maiores de idade: ", maior_idade)
      escreval("Pessoas menores de idade: ", menor_idade)
fimalgoritmo