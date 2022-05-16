public class TresNumerosDiferentes{
    public static void main (String[] args){
        
        double num[] = new double[3];
        for(int index=0;index<num.length;index++)
        {
            System.out.printf("Insira o número %d:", index+1);
            num[index] = Double.parseDouble(System.console().readLine());
        }
        if ((num[0]==num[1]) && (num[1]==num[2])){
            System.out.print("Os números são iguais!");
        } else {
            System.out.print("Os números são diferentes!");
        }            
    }
}