package estruturasRepetitivas;

import java.util.Scanner;

public class whileExe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {
			senha = sc.nextInt();
	

			if(senha != 2002)System.out.println(senha + " senha incorreta");
		}
		System.out.println("senha correta " );
		sc.close();

	}

}
