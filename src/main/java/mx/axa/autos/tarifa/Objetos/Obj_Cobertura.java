package mx.axa.autos.tarifa.Objetos;

public class Obj_Cobertura {

	private String descripcion;
	 private Sub_Obj_Deducible[] deducible;
	 private Sub_Obj_SA[] suma;

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Sub_Obj_Deducible[] getDeducible() {
		return deducible;
	}
	public void setDeducible(Sub_Obj_Deducible[] deducible) {
		this.deducible = deducible;
	}
	public Sub_Obj_SA[] getSuma() {
		return suma;
	}
	public void setSuma(Sub_Obj_SA[] suma) {
		this.suma = suma;
	}
	 
	 
	}
