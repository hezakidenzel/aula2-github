package entidade;

public class Empregado {
	
	private String nome;
	private Integer id;
	private Double salario;
	
	public Empregado(String nome, Integer id, Double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void addSalario(Double aumento) {
		salario += salario * aumento /100;
	}

	public String toString() {
		return "Empregado [nome=" + nome + ", id=" + id + ", salario=" + salario + "]";
	}
	
	
	

}
