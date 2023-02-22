package fundamentosPOO;

public class Farmacia {

	private String nome;
	private String endereco;
	private String cep;
	private int qntClientesCadastrados;
	private int qntFuncionarios;

	public Farmacia(String nome, String endereco, String cep, int qntClientesCadastrados, int qntFuncionarios) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.qntClientesCadastrados = qntClientesCadastrados;
		this.qntFuncionarios = qntFuncionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getQntClientesCadastrados() {
		return qntClientesCadastrados;
	}

	public void setQntClientesCadastrados(int qntClientesCadastrados) {
		this.qntClientesCadastrados = qntClientesCadastrados;
	}

	public int getQntFuncionarios() {
		return qntFuncionarios;
	}

	public void setQntFuncionarios(int qntFuncionarios) {
		this.qntFuncionarios = qntFuncionarios;
	}

	public void Visualizar() {
		System.out.println("DADOS DA FÁRMACIA: ");
		System.out.println("NOME: " + nome);
		System.out.println("ENDEREÇO:" + endereco);
		System.out.println("CEP: " + cep);
		System.out.println("QUANTIDADE DE CLIENTES CADASTRADOS: " + qntClientesCadastrados);
		System.out.println("QUANTIDADE DE FUNCIONÁRIOS: " + qntFuncionarios);
		System.out.println();
	}

}
