public class CalcularJuros {
    public static void main(String[] args){
        double valor, jurosDia, diasAtraso, totalPagar, totalJuros;
        System.out.print("Insira o valor da prestacao: ");
        valor = Double.parseDouble(System.console().readLine());
        System.out.print("Insira em quantos dias esta atrasada: ");
        diasAtraso = Double.parseDouble(System.console().readLine());
        System.out.print("Insira quanto eh a porcentagem de juros ao dia: ");
        jurosDia = Double.parseDouble(System.console().readLine());
        totalJuros = ((jurosDia/100)*valor)*diasAtraso;
        totalPagar = totalJuros+valor;
        System.out.printf("Valor da prestacao: %.2f\n", valor);
        System.out.printf("Valor total dos juros: %.2f\n", totalJuros);
        System.out.printf("Total a pagar: %.2f", totalPagar);
    }
}