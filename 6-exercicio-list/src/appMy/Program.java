package appMy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Emprego> list = new ArrayList<>();
		System.out.println("Informe a quantidade de funcionários");
		int n = sc.nextInt();
		int id;
		// Emprego emp = new Emprego();

		for (int i = 0; i <= n; i++) {

			System.out.println("Informeo nome: ");

			String name = sc.next();

			System.out.println("Informeo o ID: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Informeo o salario: ");
			double salary = sc.nextDouble();
			list.add(new Emprego(id, name, salary));

		}
		System.out.println(list);
		sc.nextLine();

		System.out.println("Gostaria de dar aumento para alguem? s/n ");
		char esc = sc.next().charAt(0);
		if ('s' == esc) {
			System.out.println("Digite o id do funcionário: ");
			id = sc.nextInt();
			Integer pos = position(list, id);
			if (pos != null) {
				System.out.println("Digitea porcetagem: ");
				double porcetagem = sc.nextDouble();
				list.get(pos).increaseSalary(porcetagem);
			}

		}

		System.out.println(list);

		sc.close();
	}

	public static Integer position(List<Emprego> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}