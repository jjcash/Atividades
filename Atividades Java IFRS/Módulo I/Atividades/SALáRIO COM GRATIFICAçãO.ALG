Algoritmo "Salário com gratificação"
Var
   salario_base, salario : real
Inicio
      leia(salario_base)
      salario <- ((((salario_base*5/100)+salario_base)*7/100)-salario_base)*-1
      escreva(salario)
Fimalgoritmo