package estruturasSequenciais;

import java.util.Scanner;

public class exeFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual valor? ");
		int valor = sc.nextInt();

		String intervalo = "";

		if (valor < 0 || valor > 100)
			intervalo = "fora do intervalo";
		else if (valor <= 25)
			intervalo = "0 a 25";
		else if (valor <= 50)
			intervalo = "25 a 50";
		else if (valor <= 75)
			intervalo = "50 a 75";
		else if (valor <= 100)
			intervalo = "75 a 100";

		System.out.print(intervalo);
		sc.close();

	}

}