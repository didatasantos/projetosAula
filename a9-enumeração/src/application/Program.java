package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
			
		System.out.println(sdf1.format(date));
		
		Order order = new Order(1080, date, OrderStatus.PENDING_PAYMENT);
		
	System.out.println(order + " 1");
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	
	}
}
