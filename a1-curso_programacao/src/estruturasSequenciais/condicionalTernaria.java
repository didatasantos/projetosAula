package estruturasSequenciais;

import java.util.Scanner;

public class condicionalTernaria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int preco = sc.nextInt();

		double desconto = 0;

		desconto = (preco >= 30) ? preco* 0.10 : preco * 0.05;
		
		System.out.println(desconto);
		 

		
		sc.close();

	}

}
