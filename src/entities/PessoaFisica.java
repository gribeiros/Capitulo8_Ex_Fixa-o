package entities;

public class PessoaFisica extends Contribuente {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double reandaAnual, Double gastosSaude) {
		super(nome, reandaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double despesas() {
		if (super.getReandaAnual() < 2000) {
			return (super.getReandaAnual() * 0.15) - (gastosSaude * 0.50);
		} else {
			return (super.getReandaAnual() * 0.25) - (gastosSaude * 0.50);

		}
	}

}
