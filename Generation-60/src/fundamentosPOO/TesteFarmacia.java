package fundamentosPOO;

public class TesteFarmacia {

	public static void main(String[] args) {


		Farmacia farmacia1 = new Farmacia("Bella Farma", "Avenida Sadamu Inoue n 5447", "04788-032", 1502, 8);
		Farmacia farmacia2 = new Farmacia("DrogaMais", "Rua João IV n 504", "05215-095", 754, 10);
		
		farmacia1.Visualizar();
		farmacia2.Visualizar();
	}

}
