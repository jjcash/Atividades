algoritmo "media ponderada"
var
 nota1, nota2, nota3, peso1, peso2, peso3, media_final : real
inicio
      escreval("Insira a Primeira Nota: ")
      leia(nota1)
      escreval("Insira o Peso da Primeira Nota: ")
      leia(peso1)
      escreval("Insira a Segunda Nota: ")
      leia(nota2)
      escreval("Insira o Peso da Segunda Nota: ")
      leia(peso2)
      escreval("Insira a Terceira Nota: ")
      leia(nota3)
      escreval("Insira o Peso da Terceira Nota: ")
      leia(peso3)
      media_final <- ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1 + peso2 + peso3)
      escreva(media_final:2:2)
fimalgoritmo