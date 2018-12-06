package entities;

public class PessoaJuridica extends Contribuente {

	private Integer numeroFuncioinarios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncioinarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncioinarios() {
		return numeroFuncioinarios;
	}

	public void setNumeroFuncioinarios(Integer numeroFuncioinarios) {
		this.numeroFuncioinarios = numeroFuncioinarios;
	}

	@Override
	public double despesas() {
		if (numeroFuncioinarios > 10) {
			return super.getReandaAnual() * 0.14;
		} else {
			return super.getReandaAnual() * 0.16;
		}

	}

}
