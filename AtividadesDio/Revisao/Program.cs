﻿using System;
namespace Revisao{
    class program{
        static void Main(string[] args){
            
            Aluno[] alunos = new Aluno[5];
            string opcaoUsuario = obterOpcaoUsuario();
            var indiceAluno = 0;

            while (opcaoUsuario.ToUpper() != "X")
            {
                switch (opcaoUsuario)
                {
                    case "1":
                        Console.WriteLine("Informe o nome do aluno: ");
                        var aluno = new Aluno();
                        aluno.Nome = Console.ReadLine();
                        
                        Console.WriteLine("Informe a nota do aluno: ");
                        
                        if (decimal.TryParse(Console.ReadLine(), out decimal nota)){
                            aluno.Nota = nota;
                        }else{
                            throw new ArgumentException("O valor da nota deve ser decimal.");
                        }

                        alunos[indiceAluno] = aluno;
                        indiceAluno++;
                        break;

                    case "2":
                        foreach(var a in alunos){
                            if (!string.IsNullOrEmpty(a.Nome))
                            Console.WriteLine($"Aluno: {a.Nome} - Nota: {a.Nota}");
                        }
                        break;

                    case "3":
                        decimal notaTotal = 0;
                        var nrAlunos = 0;
                        for(int index=0;index<alunos.Length;index++){
                            if(!string.IsNullOrEmpty(alunos[index].Nome)){
                                notaTotal = notaTotal + alunos[index].Nota;
                                nrAlunos++;
                                }
                            }
                            var mediaGeral = notaTotal/nrAlunos;
                            Conceito conceitoGeral;
                            if(mediaGeral<2){
                                conceitoGeral = Conceito.E;
                            }else if (mediaGeral<4){
                                conceitoGeral = Conceito.D;
                            }else if (mediaGeral<6){
                                conceitoGeral = Conceito.C;
                            }else if (mediaGeral<8){
                                conceitoGeral = Conceito.B;
                            }else{
                                conceitoGeral = Conceito.A;
                            }
                            Console.WriteLine($"Media Geral: {mediaGeral} - Conceito: {conceitoGeral}");
                        break;
                    default:
                        throw new ArgumentOutOfRangeException();
                }
                opcaoUsuario = obterOpcaoUsuario();
            }
        }

        private static string obterOpcaoUsuario()
        {
            Console.WriteLine("Informe a opcao desejada: ");
            Console.WriteLine("1 - Inserir novo aluno.");
            Console.WriteLine("2 - Listar alunos.");
            Console.WriteLine("3 - Calcular media geral.");
            Console.WriteLine("X - Sair.");
            Console.WriteLine();
            
            string opcaoUsuario = Console.ReadLine();
            Console.WriteLine();
            return opcaoUsuario;
        }
    }
}