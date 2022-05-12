algoritmo "Ativ2_Hr_Min"
var
dia, horas, minutos, temp : inteiro
ver : caracter
inicio
      dia <- 1440
      horas <- 0
      repita
            escreval("Insira as horas: ")
            leia(horas)
            escreval("Insira os minutos: ")
            leia(minutos)
            horas <- horas * 60
            temp <- horas + minutos
            dia <- dia - temp
            se (dia < 1440) entao
               escreval("Minutos que se passaram desde o inicio do dia: ", dia)
               escreval("Continuar 'S' ou 'N'?")
               leia(ver)
               senao
                    ver <- N
                    escreval("Você já passou do fim do dia!")
                    dia <- 1440
            fimse
      ate (ver = N)
fimalgoritmo
      
               
