package mx.axa.autos.tarifa.Funciones;

import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;

public class Func_auxiliar {

	public Obj_Catalogo asignaData(String codigo, String descripcion){
		Obj_Catalogo r = new Obj_Catalogo();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		return r;
	}
}
