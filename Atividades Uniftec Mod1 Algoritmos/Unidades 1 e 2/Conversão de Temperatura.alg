algoritmo "conversao de temperaturas"
var
 celsius, fahrenheit, kelvin : real
 inicio
  escreva("Insira a temperatura em Célsius: ")
  leia (celsius)
  fahrenheit <- celsius*1.8+32
  kelvin <- celsius+273.15
  escreval("Temperatura em Célsius: ", celsius)
  escreval("Temperatura em fahrenheit: ", fahrenheit)
  escreval("Temperatura em Kelvin: ", kelvin)
fimalgoritmo
