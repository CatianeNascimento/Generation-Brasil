package fundamentosPOO;

public class TesteIngresso {

	public static void main(String[] args) {

		Ingresso ingresso1 = new Ingresso("Gato de Botas", "12/03/2023", "15:35", "meia-entrada", "cinema", 12.50, 745);
		Ingresso ingresso2 = new Ingresso("Rebeldes", "10/11/2023", "21:00", "camarote", "show", 250.00, 654);
		
		ingresso1.Visualizar();
		ingresso2.Visualizar();
	}

}
