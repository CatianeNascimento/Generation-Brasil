package fundamentosPOO;

public class TesteCurso {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Curso Livre", "Culin�ria", "turismo, hospitalidade e lazer", "Santo Amaro", 149.99);
        Curso curso2 = new Curso("Gradua��o", "Psicologia", "Humanas", "Centro", 230.00);
        
        curso1.Visualizar();
        curso2.Visualizar();
	}

}
