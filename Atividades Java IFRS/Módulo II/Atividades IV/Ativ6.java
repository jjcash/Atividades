public class Ativ6 {
	public static void main(String[] args) {
		int dado, teste;
		System.out.println("Lancar o dado? '1' para sim ou '2' para nao?");
		teste = Integer.parseInt(System.console().readLine());
		do{
			dado=(int)(1+Math.random()*6);
			System.out.printf("Numero no dado: %d\n", dado);
			System.out.println("Deseja lancar o dado novamente? '1' para sim ou '2' para nao?");
			teste = Integer.parseInt(System.console().readLine());
		}while(teste==1);
	}
}	