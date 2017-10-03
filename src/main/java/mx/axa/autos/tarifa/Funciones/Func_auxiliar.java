package mx.axa.autos.tarifa.Funciones;

import mx.axa.autos.tarifa.Objetos.Obj_SubTipo;
import mx.axa.autos.tarifa.Objetos.Obj_Marca;

public class Func_auxiliar {
	public Obj_SubTipo asigna(String codigo, String descripcion){
		Obj_SubTipo r = new Obj_SubTipo();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		return r;
	}
	public Obj_Marca asignamarca(String codigo, String descripcion){
		Obj_Marca r = new Obj_Marca();
		r.setClave(codigo);
		r.setDescripcion(descripcion);
		return r;
	}
}
