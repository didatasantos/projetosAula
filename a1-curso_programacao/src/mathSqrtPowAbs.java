
import java.util.Locale;
import java.util.Scanner;

public class mathSqrtPowAbs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y, z;
		int p;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		p = sc.nextInt();
		z = sc.nextDouble();

		double sqrt = Math.sqrt(x);
		double pow = Math.pow(y, p);
		double abs = Math.abs(z);

		System.out.println("Dados digitados:");

		System.out.println("Raiz quadrada de " + x + " é Math.sqrt = " + sqrt);
		System.out.println("A potenciação de %2.f " + y +" elevado a " + p + " é Math.pow = " + pow);
		System.out.println("O valor absoluto de " + z + " é Math.abs = " + abs);

		sc.close();

	}

}
