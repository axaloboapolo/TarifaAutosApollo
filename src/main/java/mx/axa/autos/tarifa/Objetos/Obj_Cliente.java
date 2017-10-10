package mx.axa.autos.tarifa.Objetos;

public class Obj_Cliente {
	private Sub_Obj_Genero[] genero;
	private Sub_Obj_Ocupacion[] ocupacion;
	private Sub_Obj_Giro[] giro;
	private Sub_Obj_EdoCivil[] edocivil;
	public Sub_Obj_Genero[] getGenero() {
		return genero;
	}
	public void setGenero(Sub_Obj_Genero[] genero) {
		this.genero = genero;
	}
	public Sub_Obj_Ocupacion[] getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(Sub_Obj_Ocupacion[] ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Sub_Obj_Giro[] getGiro() {
		return giro;
	}
	public void setGiro(Sub_Obj_Giro[] giro) {
		this.giro = giro;
	}
	public Sub_Obj_EdoCivil[] getEdocivil() {
		return edocivil;
	}
	public void setEdocivil(Sub_Obj_EdoCivil[] edocivil) {
		this.edocivil = edocivil;
	}
}
