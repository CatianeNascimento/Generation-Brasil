package fundamentosPOO;

public class TesteProduto {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Cadeira Gamer", "M�veis", "Preto", 359756, 1450.99);
		
		Produto produto2 = new Produto("Fone sem fio", "Acess�rios", "Branco", 69875, 250.00);
		
		produto1.Visualizar();
		produto2.Visualizar();
	}

}
