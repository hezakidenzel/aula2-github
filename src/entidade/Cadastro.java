package entidade;

public class Cadastro {

	private int quarto;
	private double aluguel;
	private String nome;
	private String email;
	public Cadastro(int quarto, double aluguel, String nome, String email) {
		this.quarto = quarto;
		this.aluguel = aluguel;
		this.nome = nome;
		this.email = email;
	}
	public Cadastro() {
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
