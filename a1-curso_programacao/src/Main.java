import java.util.Locale; // aproxima do erro e seleciona a configuração

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y = 32.3556;
		System.out.println(y);
		System.out.printf("%.10f%n", y); // %n = \n = quebra de linha 
		System.out.printf("%.2f\n", y);
		System.out.println("Ola Mundo!");
		Locale.setDefault(Locale.US);  // converter o a virgula em ponto padrao br para us
		System.out.printf("RESULTADO = %.2f metros\n\n", y);
		System.out.println("Ola Mundo!");

		String nome = "maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
		// %s puxa string, %d puxa int, %f puxa double
	}

}



