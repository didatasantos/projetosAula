
package estruturasSequenciais;

import java.util.Scanner;

public class exeOne {

	public static void main(String[] args) {

		Scanner f = new Scanner(System.in);
		int x;
		x = f.nextInt();

		if (x > 0) {
			System.out.println("número positivo");
		} else if (x == 0) {
			System.out.println("nulo");
		} else {
			System.out.println("negativo");
		}

		System.out.println();
		f.close();
	}
}
