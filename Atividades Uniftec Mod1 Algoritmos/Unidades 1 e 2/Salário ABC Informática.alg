Algoritmo "Sal�rio ABC Inform�tica"
Var
   salario_liq, salario_base, bonus, tempo:real
Inicio
      escreval("Insira o Sal�rio Base do Funcion�rio: ")
      leia(salario_base)
      escreval("Insira o Tempo de Servi�o do Funcion�rio: ")
      leia(tempo)
      se (salario_base >= 1000) e (tempo>5) entao
         bonus <- 10/100
      senao
           se (salario_base >= 1000) e (tempo = 5) ou (tempo < 5) entao
              bonus <- 5/100
           senao
                se (salario_base < 1000) entao
                   bonus <- 15/100
                fimse
           fimse
      fimse
      escreval("Sal�rio Base: ", salario_base)
      escreval("Valor do B�nus: ", salario_base*bonus)
      escreval("Sal�rio com B�nus: ", salario_base*bonus+salario_base)
Fimalgoritmo





