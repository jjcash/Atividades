public class Ativ7Quadrados {
	public static void main(String[] args) {
		int res, show, check;
		show = 0;
		res = 0;
		check = 15;
		while (check >= 15 && check <= 200) {
			show = check*check;
			res = check;
			check = check+1;
			System.out.printf("A raiz quadrada de %d eh %d\n", res, show);
		}
	}
}