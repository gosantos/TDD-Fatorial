/**
 * 
 * @author 	Guilherme Oliveira
 * @email 	guilhermeoliveira564@gmail.com
 * @github 	github.com/gosantos
 * 
 */

public class Fatorial {
	public static void main(String[] args){
		Fatorial fatorial = new Fatorial();
		for (int i = 0; i < 10; i++) {
			System.out.println(fatorial.calc(i));
		}
	}
	public int calc(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calc(n - 1);
		}
	}

}
