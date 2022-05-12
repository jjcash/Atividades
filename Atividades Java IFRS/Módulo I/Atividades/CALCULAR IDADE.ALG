algoritmo "calcular idade"
var
   ano_nascimento, ano_atual, meses, anos, dias, semanas : inteiro
inicio
      escreval("Insira o Ano de Nascimento: ")
      leia(ano_nascimento)
      escreval("Insira o Ano Atual: ")
      leia(ano_atual)
      anos <- ano_atual-ano_nascimento
      meses <- anos*12
      dias <- anos*365
      semanas <- anos*52
      escreval("Idade em Anos: ", anos)
      escreval("Idade em Meses: ", meses)
      escreval("Idade em Semanas: ", semanas)
      escreval("Idade em Dias: ", dias)
fimalgoritmo