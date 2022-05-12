public class Ativ2 {
	public static void main(String[] args) {
		int count;
		for(count=1;count<=100;count++){
			System.out.printf("O numero %d em binario eh: \n", count);
			System.out.println(Integer.toBinaryString(count));
		}
	}
}