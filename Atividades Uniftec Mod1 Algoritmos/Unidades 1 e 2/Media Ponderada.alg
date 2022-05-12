algoritmo "Média Ponderada"
var
 nome : caractere
 n1, n2, n3, n4, n5, n6, n7, n8, m1, m2, m3, m4, m5, m6, m7, m8, valor, media : real
 aprovado : logico
 inicio
  escreva("Nome do Aluno: ")
  leia(nome)
  escreva("Nota Mes 1: ")
  leia(n1)
  escreva("Nota Mes 2: ")
  leia(n2)
  escreva("Nota Mes 3: ")
  leia(n3)
  escreva("Nota Mes 4: ")
  leia(n4)
  escreva("Nota Mes 5: ")
  leia(n5)
  escreva("Nota Mes 6: ")
  leia(n6)
  escreva("Nota Mes 7: ")
  leia(n7)
  escreva("Nota Mes 8: ")
  leia(n8)
  m1 <- 1
  m2 <- 2
  m3 <- 3
  m4 <- 4
  m5 <- 5
  m6 <- 6
  m7 <- 7
  m8 <- 8
  valor <- ((n1 * m1) + (n2 * m2) + (n3 * m3) + (n4 * m4) + (n5 * m5) + (n6 * m6) + (n7 * m7) + (n8 * m8)) / (m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8)
  aprovado <- (valor >= 6)
  media <- valor
  escreva("Nome: ", nome)
  escreva(" Media: ", media:2:1)
  escreva(" Aprovado: ", aprovado)
fimalgoritmo
