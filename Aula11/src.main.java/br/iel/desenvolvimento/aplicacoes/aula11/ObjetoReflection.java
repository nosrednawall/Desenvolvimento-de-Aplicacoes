package br.iel.desenvolvimento.aplicacoes.aula11;

public class ObjetoReflection {

	private String nome;
	private String descricao;
	private String altura;
	
	@Override
	public String toString() {
		return "O objeto possui o nome de: "
				+this.nome
				+" e a descrição de: "
				+this.descricao
				+" e a altura de "
				+this.altura.toString();
	}
	
	//omitindo getters and setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
}
