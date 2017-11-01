package mx.axa.tarifa.Objetos_Servicios;

public class WS_Obj_CoberturaRest {
	private String codCobertura;
	private String descripcion;
	private String id_ema;
	private String sumaAsegurada;
	private String deducible;
	public String getCodCobertura() {
		return codCobertura;
	}
	public void setCodCobertura(String codCobertura) {
		this.codCobertura = codCobertura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getId_ema() {
		return id_ema;
	}
	public void setId_ema(String id_ema) {
		this.id_ema = id_ema;
	}
	public String getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(String sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public String getDeducible() {
		return deducible;
	}
	public void setDeducible(String deducible) {
		this.deducible = deducible;
	}
}
