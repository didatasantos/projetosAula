package program;

import java.util.Locale;
import java.util.Scanner;

import entities.StudantGrade;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudantGrade notaAluno = new StudantGrade();
		Locale.setDefault(Locale.US);

		System.out.println("Nome do aluno: ");
		notaAluno.name = sc.next();
		System.out.println("Nota 1: ");

		notaAluno.nota1 = sc.nextDouble();
		if (notaAluno.nota1 < 0 || notaAluno.nota1 > 30) {
			notaAluno.nota1 = 0;
			System.out.printf(notaAluno.notaInvalida() + " -> didigite novamente ");
			notaAluno.nota1 = sc.nextDouble();
		}

		System.out.println("Nota 2: ");
		notaAluno.nota2 = sc.nextDouble();

		System.out.println("Nota 3: ");
		notaAluno.nota3 = sc.nextDouble();

		double inB = notaAluno.mediaAluno();

		//System.out.println(notaAluno.toString(notaAluno.name, notaAluno.aprovacao));
		if (inB >= 60) {
			System.out.println("passou, nota: " +  notaAluno.toString(notaAluno.name, notaAluno.mediaAluno()));
		} else
			System.out.println("reprovou, faltaram " + notaAluno.toString(" ", notaAluno.pontosFaltantes()) + " pontos" );
		;
		sc.close();
	}

}
