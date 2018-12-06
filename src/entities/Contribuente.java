package entities;

public abstract class Contribuente {

	private String nome;
	private Double reandaAnual;

	public Contribuente() {

	}

	public Contribuente(String nome, Double reandaAnual) {
		super();
		this.nome = nome;
		this.reandaAnual = reandaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getReandaAnual() {
		return reandaAnual;
	}

	public void setReandaAnual(Double reandaAnual) {
		this.reandaAnual = reandaAnual;
	}

	public abstract double despesas();

}
