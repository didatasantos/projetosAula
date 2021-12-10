package estruturasSequenciais;

import java.util.Scanner;

public class exeThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas começou o jogo?");
		int inicio = sc.nextInt();
		System.out.println("Que horas terminou o jogo?");
		int fim = sc.nextInt();
		sc.close();
		int duracao;
		
		if (fim <= 24 & inicio <= 24 & fim > inicio) {
			duracao = fim - inicio;
			System.out.printf("o jogo durou: " + duracao + " horas");

		} else if (fim <= 24 & inicio <= 24 & fim < inicio) {
duracao = (24 - inicio) + (fim);
			System.out.printf("o jogo durou: " + duracao + " horas");

		} else {
			System.out.println("informações erradas");
		}

	}

}
