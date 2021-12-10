package estruturasRepetitivas;

import java.util.Scanner;

public class while3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
	
		while(x<5) {
			y=x*3;
			System.out.print(y + "y");
			
			
			x += 1; 
			System.out.print(x + "x");
		}

		sc.close();

	}

}
