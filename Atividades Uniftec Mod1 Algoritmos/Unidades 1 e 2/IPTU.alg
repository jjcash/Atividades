algoritmo "calculo IPTU"
var
   iptu, area : real
inicio
      escreval("Digite o Tipo de IPTU: ")
      leia(iptu)
      escreval("Digite a �rea do Im�vel: ")
      leia(area)
                       se iptu=1 entao
                       escreval("Tipo de Imov�l: Residencial-Casa. Valor: R$ ", 200*area)
                       escreval("Area: ", area)
                       escreval("Valor do IPTU por M2: R$200)
                       senao
                            se iptu=2 entao
                            escreval("Tipo de Imov�l: Residencial-Predio. Valor: R$ ", 180*area)
                            escreval("Area: ", area)
                            escreval("Valor do IPTU por M2: R$180")
                            senao
                                 se iptu=3 entao
                                 escreval("Tipo de Imov�l: Comercial-Casa. Valor: R$ ", 300*area)
                                 escreval("Area: ", area)
                                 escreval("Valor do IPTU por M2: R$300")
                                 senao
                                      se iptu=4 entao
                                      escreval("Tipo de Imov�l: Comercial-Predio. Valor: R$ ", 280*area)
                                      escreval("Area: ", area)
                                      escreval("Valor do IPTU por M2: R$280")
                                      senao
                                           se iptu=5 entao
                                           escreval("Tipo de Imov�l: Industrial. Valor: R$ ", 400*area)
                                           escreval("Area: ", area)
                                           escreval("Valor do IPTU por M2: R$400")
                                           senao
                                           escreval("Tipo de Im�vel Inv�lido!")
                                           fimse
                                      fimse
                                 fimse
                            fimse
                       fimse
fimalgoritmo




