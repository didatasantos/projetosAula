package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		List<Product> lista = new ArrayList();

		
//		if(n == 'c') {
//			String name = sc.next();
//			double price = sc.nextDouble();
//			
//			lista.add(new Product(name, price));
//		}
//		if(n == 'c') {
//			String name = sc.next();
//			double price = sc.nextDouble();
//			
//			lista.add(new Product(name, price));
//		}
		System.out.println("quantidade de produtos");
		int qtidade = sc.nextInt();
		for (int i = 0; i < qtidade; i++) {
			System.out.println("nome");
			String name = sc.next();
			System.out.println("preço");
			double price = sc.nextDouble();
			
			System.out.println("Common, used or imported (c/u/i)?");
			char n = sc.next().charAt(0);
			switch (n) {
			case 'c':

				lista.add(new Product(name, price));
				break;

			case 'u':
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("data do produto usado: ");
				Date data = sdf.parse(sc.next());
				lista.add(new UsedProduct(name, price, data));
				break;
			case 'i':
				System.out.println("Taxa de importação em centena: ");
				double customsFee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customsFee));
				break;

			default:
				break;

			}
		}
		for(Product x: lista) {
			System.out.println(x);
		}

		sc.close();

	}

}
