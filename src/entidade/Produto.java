package entidade;

public class Produto {
	private String nome;
	private double pre�o;
	
	
	public Produto(String nome, double pre�o) {
		this.nome = nome;
		this.pre�o = pre�o;
	}
	public Produto() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	
	public String toString() {
		return "nome do produto :"
			   +nome
			   +", Valor do produto :"
			   +pre�o;
	}

}
