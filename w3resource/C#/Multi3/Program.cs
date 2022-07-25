bool teste = true;
while(teste){
Console.WriteLine("Insira o primeiro número: ");
string input1 = Console.ReadLine();
int num1, num2, num3;
string input2 = "X", input3 = "X";
if(Int32.TryParse(input1, out num1)){
    Console.WriteLine("Insira o segundo número: ");
    input2 = Console.ReadLine();
}else{
    Console.WriteLine("O número digitado é inválido!");
    break;
} 
if(Int32.TryParse(input2, out num2)){
    Console.WriteLine("Insira o terceiro número: ");
    input3 = Console.ReadLine();
}else{
    Console.WriteLine("O número digitado é inválido!");
    break;
}
if(Int32.TryParse(input3, out num3)){
    Console.WriteLine($"O resultado da multiplicação dos três números é {num1*num2*num3}");
}else{
    Console.WriteLine("O número digitado é inválido!");
}
    Console.WriteLine("Continuar? S ou N");
    string test = Console.ReadLine();
    test = test.ToUpper();
    if(test == "S"){
        teste = true;
    }else{
        teste = false;
    }
}


