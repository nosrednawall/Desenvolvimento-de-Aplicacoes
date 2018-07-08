package agenciafinanceira.entity;

public class Cotacao {

	private double valorInformado;
	private MoedaCotadaEnum moedaCotada;
	private Integer qtdaDias;

	@Override
	public String toString() {
		return "Cotacao [valorInformado=" + valorInformado + ", moedaCotada=" + moedaCotada + ", qtdaDias=" + qtdaDias
				+ "]";
	}

	public double getValorInformado() {
		return valorInformado;
	}

	public void setValorInformado(double valorInformado) {
		this.valorInformado = valorInformado;
	}

	public MoedaCotadaEnum getMoedaCotada() {
		return moedaCotada;
	}

	public void setMoedaCotada(MoedaCotadaEnum moedaCotada) {
		this.moedaCotada = moedaCotada;
	}

	public Integer getQtdaDias() {
		return qtdaDias;
	}

	public void setQtdaDias(Integer qtdaDias) {
		this.qtdaDias = qtdaDias;
	}

	
}
