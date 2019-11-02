package entidade;

public class Produto {
	private String nome;
	private double preço;
	
	
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	public Produto() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	
	public String toString() {
		return "nome do produto :"
			   +nome
			   +", Valor do produto :"
			   +preço;
	}

}
