package mx.axa.tarifa.Objetos_Servicios;

public class WS_DatosCliente {
	private WS_Genero genero;
	private WS_Ocupacion ocupacion;
	private WS_Giro giro;
	private WS_EstadoCivil estadocivil;
	public WS_Genero getGenero() {
		return genero;
	}
	public void setGenero(WS_Genero genero) {
		this.genero = genero;
	}
	public WS_Ocupacion getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(WS_Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}
	public WS_Giro getGiro() {
		return giro;
	}
	public void setGiro(WS_Giro giro) {
		this.giro = giro;
	}
	public WS_EstadoCivil getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(WS_EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}
}
