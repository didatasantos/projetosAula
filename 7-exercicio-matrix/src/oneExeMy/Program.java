package oneExeMy;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < mat.length; i++) {
			// System.out.println("mat[i] " + mat[i]);
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(" i: " + i + " j : " + j + " mat[i][j] " + mat[i][j]);
			}
		}
		sc.nextLine();
		System.out.println("Numero buscado");
		int busca = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				// System.out.println("buscar " + busca + " mat[i][j]) " + mat[i][j]);

				if (mat[i][j] == busca) {
					mensagem(mat[i][j] + " " + " numero encontrado");

					mensagem(mat[i][j - 1] + " -> " + " esqueda");
					mensagem(mat[i][j + 1] + " -> " + " esqueda");
					mensagem(mat[i + 1][j] + " -> " + " em cima");
					mensagem(mat[i - 1][j] + " -> " + " em baixo");
					break;
				} else {
					// mensagem("N�mero n�o encontrado!");
				}

				/*
				 * if (busca == mat[i][j]) { System.out.println(mat[i][j] + "igual"); } else {
				 * System.out.println("Tente novamente"); busca = sc.nextInt(); }
				 */
				// mat[i][j] + "igual"};
				// System.out.println("mat[i][j] " + mat[i][j]);
			}

			/*
			 * for (int[] bus : mat) { for (int b : bus) { mensagem(b + " 1 "); if (b ==
			 * busca) { mensagem(b + " 2 "); break; } else {
			 * mensagem("N�mero n�o encontrado!"); }
			 * 
			 * }
			 * 
			 * }
			 */
		}

		sc.close();
	}

	public static void mensagem(String msg) {
		System.out.println(msg);
	}

	public static void mensagem(int msg) {
		System.out.println(msg);
	}
}
