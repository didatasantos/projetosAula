package OtherThings;

import java.util.Scanner;

public class BitABit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 32; // 32 = 0b100000 pois o sexto bit é um - conferir na calc.programador
		int n = sc.nextInt(); // ex.89 pois o sexto bit de trás pra frente é 1, dai dará verdadeiro
		if ((n & mask) != 0) {
			System.out.println("6th bit é verdadeiro");
		} else {
			System.out.println("6th bit é falso");
		}
		sc.close();

	}
}
