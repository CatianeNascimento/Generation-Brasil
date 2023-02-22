package fundamentosPOO;

public class Ingresso {
	
	String identificacao;
	String data; 
	String horario; 
	String tipo;
	String categoria;
	double preco;
	int numero;
	
	public Ingresso(String identificacao, String data, String horario, String tipo, String categoria, double preco,
			int numero) {
		this.identificacao = identificacao;
		this.data = data;
		this.horario = horario;
		this.tipo = tipo;
		this.categoria = categoria;
		this.preco = preco;
		this.numero = numero;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	} 
	
	public void Visualizar() {
		System.out.println("INFORMA��ES DO INGRESSO:\n");
		System.out.println("IDENTIFICA��O: " +identificacao);
		System.out.println("DATA: " +data);
		System.out.println("HOR�RIO: " +horario);
		System.out.println("TIPO: " +tipo);
		System.out.println("CATEGORIA: " +categoria);
		System.out.println("PRE�O: " +preco);
		System.out.println();


	}
	
	
	

}
