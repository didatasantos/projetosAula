package OtherThings;

import java.util.Scanner;

public class BitABit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 32; // 32 = 0b100000 pois o sexto bit � um - conferir na calc.programador
		int n = sc.nextInt(); // ex.89 pois o sexto bit de tr�s pra frente � 1, dai dar� verdadeiro
		if ((n & mask) != 0) {
			System.out.println("6th bit � verdadeiro");
		} else {
			System.out.println("6th bit � falso");
		}
		sc.close();

	}
}
