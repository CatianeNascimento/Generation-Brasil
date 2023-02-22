package fundamentosPOO;

public class Curso {

	String tipo;
	String nome; 
	String area;
	String polo;
	double preco;
	
	
	public Curso(String tipo, String nome, String area, String polo, double preco) {
		this.tipo = tipo;
		this.nome = nome;
		this.area = area;
		this.polo = polo;
		this.preco = preco;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getPolo() {
		return polo;
	}


	public void setPolo(String polo) {
		this.polo = polo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Visualizar() {
		System.out.println("DADOS DO CURSO:\n");
		System.out.println("TIPO: " +tipo);
		System.out.println("NOME: " +nome);
		System.out.println("ÁREA: " +area);
		System.out.println("POLO: " +polo);
		System.out.println("PREÇO: " +preco);
		System.out.println();
	}
	
}
