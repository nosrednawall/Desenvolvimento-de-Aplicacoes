package agenciafinanceira.entity;

public enum MoedaCotadaEnum {

	GUARANIS("GUARANIS"), BOLIVARIANO("BOLIVARIANO"), DOLAR_CANADENSE("DOLAR_CANADENSE"), DOLAR_EUA("DOLAR_EUA"), EURO("EURO"), 
	LIBRA_ESTERLINA("LIBRA_ESTERLINA"), PESO_ARGENTINO("PESO_ARGENTINO"), PESO_MEXICANO("PESO_MEXICANO"), PESO_USUGUAIO("PESO_USUGUAIO");

	 private String value;
	
	   MoedaCotadaEnum(String value){
	      this.value = value;
	  }


	  public String getValue() {
	      return value;
	 }
}
//
// public enum DatasLimiteEnum {
//
// IdadeMaxima(120), IdadeMinima(13);
//
// private final Integer idade;
//
// private DatasLimiteEnum(Integer idadeNumeral) {
// this.idade = idadeNumeral;
// }
//
// public Integer getIdadeNumeral() {
// return this.idade;
// }
// }