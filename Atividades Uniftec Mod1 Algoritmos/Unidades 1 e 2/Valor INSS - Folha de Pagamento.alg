algoritmo "Valor INSS - Folha de Pagamento"
var
   salario_base, aliquota : real
   vlr_al : caractere
inicio
      escreval("Insira o Salário Base do Funcionário: ")
      leia(salario_base)
      se salario_base <= 1212 entao
         aliquota <- 7/100
         vlr_l <- "7.5%"
      senao
           se (salario_base > 1212) e (salario_base <= 2427.35) entao
              aliquota <- 9/100
              vlr_al <- "9%"
           senao
                se (salario_base > 2427.36) e (salario_base <= 3641.03) entao
                   aliquota <- 12/100
                   vlr_al <- ("12%")
                senao
                     se (salario_base > 3641.03) e (salario_base <= 7087.22) entao
                        aliquota <- 14/100
                        vlr_al <- ("14%")
                     senao
                          escreval("O Valor Digitado é Inválido!")
                     fimse
                fimse
           fimse
      fimse
      escreval("Salário Base: ", salario_base)
      escreval("Alíquota de Pagamento: ", vlr_al)
      escreval("Valor à Pagar ao INSS: ", salario_base*aliquota)
      escreval("Salário Final: ", ((salario_base*aliquota)-salario_base)*-1)
fimalgoritmo