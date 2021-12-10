package estruturasSequenciais;

import java.util.Scanner;

public class exeFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual item gostaria:");
		int codigo = sc.nextInt();
		System.out.println("Qual quantidade gostaria:");
		int quantidade = sc.nextInt();
		double total = 0;

		if (codigo == 1)
			total = quantidade * 4;
		else if (codigo == 2)
			total = quantidade * 4.5;
		else if (codigo == 3)
			total = quantidade * 5;
		else if (codigo == 4)
			total = quantidade * 2;
		else if (codigo == 5)
			total = quantidade * 5.5;

		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();

	}

}
