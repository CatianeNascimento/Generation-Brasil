package fundamentosPOO;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Catiane", "Rua Jasmine, n 5", "catiane@gmail.com", "000.000.000-00", 5555-5555);
		
		Cliente cliente2 = new Cliente("João", "Avenida Nações, n 554", "joao@hotmail.com", "444.555.666.77", 8899-1011);
		
		cliente1.Visualizar();
		cliente2.Visualizar();
	}

}
