﻿Console.WriteLine("Insira o primeiro número: ");
double num1 = Convert.ToDouble(Console.ReadLine());
Console.WriteLine("Insira o segundo número: ");
double num2 = Convert.ToDouble(Console.ReadLine());
double resultado = num1+num2;
Console.WriteLine("{0} + {1} = {2}", num1, num2, resultado);
resultado = num1-num2;
Console.WriteLine("{0} - {1} = {2}", num1, num2, resultado);
resultado = num1*num2;
Console.WriteLine("{0} x {1} = {2}", num1, num2, resultado);
resultado = num1/num2;
Console.WriteLine("{0} / {1} = {2}", num1, num2, resultado);
resultado = num1%num2;
Console.WriteLine("{0} mod {1} = {2}", num1, num2, resultado);