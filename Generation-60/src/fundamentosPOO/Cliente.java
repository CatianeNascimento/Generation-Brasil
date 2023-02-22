package fundamentosPOO;

public class Cliente {
	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private int telefone;
	
	public Cliente(String nome, String endereco, String email, String cpf, int telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return telefone;
	}

	public void setIdade(int idade) {
		this.telefone = idade;
	}
	
	public void Visualizar() {
		System.out.println("Cliente " +nome+ " portador do CPF: " +cpf+ " \nresidente e domiciliado no endereço: " +endereco+ " \npode ser encontrado, "
				+ "nos meios de contato abaixo: ");
		System.out.println("TELEFONE: " + telefone);
		System.out.println("EMAIL: " + email);
		System.out.println();
	}

	
	
}
