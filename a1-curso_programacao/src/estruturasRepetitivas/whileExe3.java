package estruturasRepetitivas;

import java.util.Scanner;

public class whileExe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod = 0;
		int soma = 0;
	

		while (cod!=4) {
			
			cod = sc.nextInt();
			if (cod > 4) System.out.println("tente novamente");
			else soma+=1;
			
		//	cod > 4 ? soma + = 1 : "tente novamente";
			

	

			System.out.println(cod );
		}
		System.out.println("clientes "+ soma );
		sc.close();

	}

}
