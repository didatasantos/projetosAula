package program;

import java.util.Scanner;

import entities.areaProgram;

public class main {
	
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	areaProgram areaP = new areaProgram();
	System.out.println("Qual a largura?");

	areaP.width = sc.nextDouble();
	
	
	System.out.println("Qual a altura?");
	areaP.height = sc.nextDouble();
	
	System.out.print(areaP);
	sc.close();
	
}
}
