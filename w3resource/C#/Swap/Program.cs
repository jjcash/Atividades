﻿int firstNumber, secondNumber, swap;
Console.WriteLine("Insira o primeiro número: ");
firstNumber = int.Parse(Console.ReadLine());
Console.WriteLine("Insira o segundo número: ");
secondNumber = int.Parse(Console.ReadLine());
swap = firstNumber;
firstNumber = secondNumber;
secondNumber = swap;
Console.WriteLine($"Primeiro número trocado: {firstNumber}");
Console.WriteLine($"Segundo número trocado: {secondNumber}");