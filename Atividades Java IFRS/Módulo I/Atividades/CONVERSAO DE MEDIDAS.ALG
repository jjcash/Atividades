algoritmo "conversao de medidas"
var
   pe, jarda, milha, polegada : real
inicio
      escreva("Escreva a medida em pés para converter: ")
      leia(pe)
      polegada <- pe*12
      jarda <- pe/3
      milha <- jarda/1760
      escreval("Polegadas: ", polegada)
      escreval("Jardas: ", jarda:9:2)
      escreval("Milhas: ", milha:9:2)
fimalgoritmo