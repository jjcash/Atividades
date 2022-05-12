algoritmo "semnome"
var
num1, num2, num3 : real
inicio
escreval("insira o lado 1: ")
leia(num1)
escreval("insira o lado 2: ")
leia(num2)
escreval("insira o lado 3: ")
leia(num3)
//parte 1
se ((num1=0) ou(num2=0) ou (num3=0)) entao
   escreval("nao e um triangulo")
senao
   //parte 2
   se ( (num1+num2=num3) ou (num1+num3=num2) ou (num2+num3=num1)) entao
      escreval("nao e um triangulo")
   senao
      //parte 3
      se ((num1=num2) e (num2=num3)) entao
         escreval("triangulo equilatero")
      senao
         //parte 4
         se ((num1=num2) ou (num2=num3) ou (num1=num3)) entao
            escreval("triangulo isoceles")
         senao
            escreval("triangulo escaleno")
         fimse
      fimse
   fimse
fimse
fimalgoritmo

