algoritmo "salario com comissao"
var
   salario_base, vendas, salario : real
inicio
      leia (salario_base, vendas)
      salario <- (vendas*4/100)+salario_base
      escreva(salario)
      fimalgoritmo