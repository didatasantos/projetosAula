package program;

import java.util.Scanner;

import entities.FolhaSal;

public class Main {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	FolhaSal fSal = new FolhaSal();
	
	System.out.println("Nome: ");
	fSal.name = sc.next();
	System.out.println("Salaário bruto: ");
	fSal.grossSalary = sc.nextDouble();
	System.out.println("Imposto: ");
	fSal.tax = sc.nextDouble();
	
	System.out.println(fSal);
	
	System.out.println("qual a porcentagem do aumento: ");
	fSal.aumento = sc.nextDouble();
	
	System.out.println(fSal);
	
	

	sc.close();
	
}
}
