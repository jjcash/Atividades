Algoritmo "Salário ABC Informática"
Var
   salario_liq, salario_base, bonus, tempo:real
Inicio
      escreval("Insira o Salário Base do Funcionário: ")
      leia(salario_base)
      escreval("Insira o Tempo de Serviço do Funcionário: ")
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
      escreval("Salário Base: ", salario_base)
      escreval("Valor do Bônus: ", salario_base*bonus)
      escreval("Salário com Bônus: ", salario_base*bonus+salario_base)
Fimalgoritmo





