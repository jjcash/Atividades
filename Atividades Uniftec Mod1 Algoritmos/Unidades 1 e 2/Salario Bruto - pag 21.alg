algoritmo "Adicional de Férias"
var
 nome : caractere
 salario_bruto, ferias, total_bruto, x : real
 inicio
  escreva (" Nome: ")
  leia (nome)
  escreva ("Salario Bruto: ")
  leia (salario_bruto)
  ferias <- salario_bruto * 1 / 3
  total_bruto <- salario_bruto + ferias
  escreva ("Nome: ", nome)
  escreva ("Total Ferias: ", ferias:4:2)
  escreva ("Total Bruto: ", total_bruto:4:2)
fimalgoritmo
