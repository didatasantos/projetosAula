package estruturasSequenciais;

import java.util.Scanner;

public class exeTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		num = sc.nextInt();
		if (num % 2 == 1) {
			System.out.println("numero impar");
		} else {
			System.out.println("par");
		}

		sc.close();
	}

}
