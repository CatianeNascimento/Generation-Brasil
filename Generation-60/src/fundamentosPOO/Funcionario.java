package fundamentosPOO;

public class Funcionario {
	String nome;
	String setor;
	String funcao;
	int matricula;
	double salario;
	
	public Funcionario(String nome, String setor, String funcao, int matricula, double salario) {
		this.nome = nome;
		this.setor = setor;
		this.funcao = funcao;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void Visualizar() {
		System.out.println("Dados do Funcionário: ");
		System.out.println("NOME: " + nome);
		System.out.println("SETOR: "+setor);
		System.out.println("FUNÇÃO: "+funcao);
		System.out.println("MATRICULA: " +matricula);
		System.out.println("SALARIO: "+salario);
		System.out.println();

	}

	
}
