import java.util.Locale;
import java.util.Scanner;

public class importDouble{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double x = sc.nextDouble();
		System.out.println("Eu digitei " + x);
		System.out.printf("Eu digitei %.2f%n", x); // quando coloco o %.2f ele reconhece a virgula e puxa pra localidade
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Eu digitei %.2f%n", x); // por causa do setDefault ele puxa o ponto dos eua
		sc.close();
		
		
	}

}
