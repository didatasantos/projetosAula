package boxingAndUnboxingAndWrapper;

public class AppBoxingAndUnboxing {
	
	public static void main(String[]args) {
		int x = 20;
		Object obj = x; //boxing - transformado a variável primitiva em classe
		System.out.println(obj);
		int y = (int) obj; // voltando a classe para a variável primitiva
		System.out.println(y);

	}

}
