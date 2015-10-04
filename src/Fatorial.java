/**
 * 
 * @author 	Guilherme Oliveira
 * @email 	guilhermeoliveira564@gmail.com
 * @github 	github.com/gosantos
 * 
 */

public class Fatorial {

	public int calc(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calc(n - 1);
		}
	}

}
