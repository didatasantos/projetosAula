package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class exeSix {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual de x ? ");
		double x = sc.nextDouble();
		System.out.println("Qual de y? ");
		double y = sc.nextDouble();
		
		String intervalo = "";

		if (x == 0 & y == 0)
			intervalo = "Origem";
		else if (x >= 0 & y >= 0)
			intervalo = "Q1";
		else if (x <= 0 & y >= 0)
			intervalo = "Q2";
		else if (x <= 0 & y <= 0)
			intervalo = "Q3";
		else if (x >= 0 & y <= 0)
			intervalo = "Q4";

		System.out.print(intervalo);
		sc.close();

	}

}