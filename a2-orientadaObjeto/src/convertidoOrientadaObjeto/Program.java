package convertidoOrientadaObjeto;

import java.util.Locale;
import java.util.Scanner;

import entidadesOrientObj.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle(); 
		y = new Triangle();
		/* "new" criando o obj - instanciando o obj, puxa a variavel 
		da memoria st�tica(stack) para a mem�ria din�mica(heap, 
		que sao usanda durante a execu��o), nesse momento o endere�o da
		mem�ria criado no heap vai ser anotado na mem�ria stack para ficar 
		identificado */
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
