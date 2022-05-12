algoritmo "Impar"
var
 n1, n2, resta : inteiro
 par : logico
 inicio
  escreva(" Numero A de 1 a 10: ")
  leia(n1)
  escreva(" Numero B de 1 a 10: ")
  leia(n2)
  escreva(" Numero A: ", n1)
  escreva(" Numero B: ", n2)
  resta <- (n1 mod n2)
  escreva(" Resta: ", resta)
  par <- resta = 0, 2, 4, 6, 8, 10
  escreva(" Resultado é par?: ", par)
fimalgoritmo
