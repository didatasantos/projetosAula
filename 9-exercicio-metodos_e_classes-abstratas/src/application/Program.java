package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuintes;
import entities.Pf;
import entities.Pj;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList();

		System.out.println("Enter de number of tax payers: ");
		int nTaxPayers = sc.nextInt();

		for (int i = 0; i < nTaxPayers; i++) {
			System.out.println("Pessoa Juridica ou Física (j/f)");
			char choice = sc.next().charAt(0);
			if (choice == 'j') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Salary: ");
				double salary = sc.nextDouble();
				System.out.println("Numero de funcionários da empresa ");
				int nFuncinarios = sc.nextInt();
				list.add(new Pj(name, salary, nFuncinarios));
			} else {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Salary: ");
				double salary = sc.nextDouble();
				System.out.println("Gastos com saúde");
				double gastosSaude = sc.nextDouble();
				list.add(new Pf(name, salary, gastosSaude));
			}
			
			
		}
		double soma=0;
		for (Contribuintes x: list) {
		
			System.out.println("Nome: "+x.getName() + "\n");
			
			soma += x.taxPayment();
				
		}
		System.out.println(String.format("Total de tributos: "+"%.2f", soma));
		sc.close();
	}
}
