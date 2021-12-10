package estruturasRepetitivas;

import java.util.Scanner;

public class whileExe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 2;
		int y = 2;
		

		while (x != 0 & y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
	

			if(y != 0 & x != 0)System.out.println(x + " "+ y);
		}
		System.out.println(" " );
		sc.close();

	}

}
