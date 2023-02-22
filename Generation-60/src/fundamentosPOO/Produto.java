package fundamentosPOO;

public class Produto {

	String nomeProduto;
	String categoria;
	String cor;
	int codigo;
	double preco;

	public Produto(String nomeProduto, String categoria, String cor, int codigo, double preco) {
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.cor = cor;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void Visualizar() {
		System.out.println("Dados do Produto\n");
		System.out.println("PRODUTO: " + nomeProduto);
		System.out.println("CATEGORIA: " +categoria);
		System.out.println("COR: " +cor);
		System.out.println("CÓDIGO: " +codigo);
		System.out.println("PREÇO: " +preco);
		System.out.println();

	}

}
