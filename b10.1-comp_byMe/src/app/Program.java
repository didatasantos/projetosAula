package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String [] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("Seu nome");
		 String name= sc.next();
		 System.out.println("email");
		 String email = sc.next();
		 System.out.println("aniversário");
		 Date birthDate = sdf.parse(sc.next());
		// Date data = new Date();		
		// Client client = new Client(name, email, birthDate);
		
		 //System.out.println(client);
		 System.out.println("How many items to this order");
		 int qtdadeOrdens = sc.nextInt();
		Client client =  new Client(name, email, birthDate);
		 System.out.println("Status");
		 String statusLevel = sc.next();
		 Order order = new Order(new Date(), OrderStatus.valueOf(statusLevel), client);
		
		 for(int i=0;i<qtdadeOrdens;i++) {

			 System.out.println("Nome do produto");
			 String nameProduct = sc.next();
			 System.out.println("Quantidade");
			 int quantity = sc.nextInt();
			 		 
			 System.out.println("preço");
			double price = sc.nextDouble();
			Product product	 = new Product(nameProduct, price);
		
			
			 OrderItem orderItem = new OrderItem(quantity, price, product); 

		
				order.addProducts(orderItem);
				
			
			//System.out.println(product);
			//System.out.println(order.getItems()+ " ver");
			// orderItem.addItem(orderItem);
		 }
		 System.out.println(order);
		sc.close();
	}
}
	