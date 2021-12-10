
import java.util.Locale;
import java.util.Scanner;

public class importNextLine {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i;

		String x, y, z;
		i = sc.nextInt();
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		System.out.println("Dados digitados:");
		
		System.out.println(i);
		
		System.out.println(x);
		System.out.println(y);
		System.out.printf(z);

		sc.close();

	}

}
