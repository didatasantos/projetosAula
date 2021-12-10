package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class exeSeven {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu salário? ");
		double salario = sc.nextDouble();
	
		
		double tributo = 0;

		if (salario<=2000)
			tributo = 0;
		else if (salario <= 3000)
			tributo = (salario - 2000)*0.08;
		else if (salario <= 4500)
			tributo = ((salario - 3000)*0.18) + (1000*0.08 );
		else if (salario > 4500)
			tributo = ((salario - 4500)*0.28)+((4500 - 3000)*0.18) + (1000*0.08);
		
		
		System.out.print(tributo);
		sc.close();

	}

}