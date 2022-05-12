public class Ativ1 {
	public static void main(String[] args) {
		String nome_produto[]=new String[10];
		int codigo_produto[]=new int[10];
		double valor_produto[]=new double[10];
		int count1;
		for(int count=0;count<10;count++){
			System.out.printf("Insira o nome do produto %d: ", count+1);
			nome_produto; // adicionar nome do produto (Exemplo: Farinha, pao, etc.)
		}
		for(int count=0;count<10;count++){
			System.out.printf("Insira o codigo do produto %d: ", count+1);
			codigo_produto[count]=Integer.parseInt(System.console().readLine());
		}
		for(int count=0;count<10;count++){
			System.out.printf("Insira o codigo do produto %d: ", count+1);
			valor_produto[count]=Double.parseDouble(System.console().readLine());
		}
		for(int count=0;count<10;count++){
			if((codigo_produto[count]%2==0)&&(valor_produto[count]>1000)){
				valor_produto[count]+=valor_produto[count]*20/100;
			}else if(codigo_produto[count]%2==0){
				valor_produto[count]+=valor_produto[count]*15/100;
			}else if(valor_produto[count]>1000){
				valor_produto[count]+=valor_produto[count]*10/100;
			}
		}
		for(int count=0;count<10;count++){
			System.out.printf("Nome do produto %d: %s\n", count+1, nome_produto[count]);
			System.out.printf("Codigo do produto %d: %d", count+1, codigo_produto[count]);
			System.out.printf("Valor novo do produto %d: %.2f", count+1, valor_produto[count]);
		}
	}
}