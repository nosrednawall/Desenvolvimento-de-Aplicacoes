import java.io.Serializable;

public class Aluno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ag;
	private String nome;
	
	public int getAg() {	
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
