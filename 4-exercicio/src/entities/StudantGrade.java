package entities;

public class StudantGrade {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double aprovacao;

	public String notaInvalida() {
		return "Nota Inválida";
	}

	public double mediaAluno() {
		aprovacao = nota1 + nota2 + nota3;
		return aprovacao;

	}

	public double pontosFaltantes() {
		if (aprovacao < 60) {
			return 60 - aprovacao;
		} else {
			return 0.0;
		}
	}
	
	

	public String toString(String a, double b) {
		return a + ",  " + " " + String.format("%.2f", b);
	}

}
