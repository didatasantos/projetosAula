package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> empregados = new ArrayList<>();
		System.out.println("Quantidade de funcionários: ");
		int qtidade = sc.nextInt();
		for (int i = 0; i < qtidade; i++) {

			System.out.println("Nome");
			String name = sc.next();
			System.out.println("horas trabalhadas");
			int hours = sc.nextInt();
			System.out.println("Valor por Horas trabalhadas");	
			Double valuePerHour = sc.nextDouble();	
			
			System.out.println("Você é terceirizado? s/n");
			char op = sc.next().charAt(0);

			if (op == 's') {
				
				System.out.println("additionalCharge?");
				double additionalCharge = sc.nextDouble();
				empregados.add(new OutSourceEmployee(name, hours, valuePerHour, additionalCharge));

				// System.out.println(outSourceEmployee );

			} else {
				empregados.add(new Employee(name, hours, valuePerHour));

			}
		} // System.out.println(empregados);

		for (Employee x : empregados) {
			System.out.print(x.getName() + " " + x.payment() + "\n");
		}
		sc.close();

	}

}
