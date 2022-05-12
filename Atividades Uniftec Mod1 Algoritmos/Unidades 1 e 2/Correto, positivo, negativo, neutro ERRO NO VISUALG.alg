algoritmo "semnome"
var
num : real
inicio
escreval("insira um numero: ")
leia(num)
se (num = 10) entao
   escreval("correto")
senao
   se (num > 0) entao
      escreval("positivo")
   senao
      se (num < 0) entao
         escreval("negativo")
      senao
         escreval("neutro")
      fimse
fimalgoritmo
