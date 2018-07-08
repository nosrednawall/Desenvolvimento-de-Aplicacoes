package fabrica;

import modelo.Veiculo;

public class Fabrica extends Veiculo{
	
	private String marca;
	private String modelo;
	
	//construtor
	public Fabrica(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	//getters and setters nao utilizados
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
