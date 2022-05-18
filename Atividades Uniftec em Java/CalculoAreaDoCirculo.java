public class CalculoAreaDoCirculo {
    public static void main(String[] args){
        double diametro, area;
        System.out.print("Insira o diametro do circulo: ");
        diametro = Double.parseDouble(System.console().readLine());
        area = (Math.PI*Math.pow(diametro, 2))/4;
        System.out.printf("Area do Circulo: %.2f", area);
    }
}
