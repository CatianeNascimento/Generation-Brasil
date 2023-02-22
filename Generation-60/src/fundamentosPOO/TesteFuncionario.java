package fundamentosPOO;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Gabriela", "marketing", "estagiaria", 47857, 1200.00);
		
		Funcionario funcionario2 = new Funcionario("Gabriel", "contabilidade", "contador", 2875, 3000.00);
		
		funcionario1.Visualizar();
		funcionario2.Visualizar();
		
	}
}
