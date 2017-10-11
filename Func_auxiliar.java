package mx.axa.autos.tarifa.Funciones;

import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Cartera;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Deducible;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_EdoCivil;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Genero;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Giro;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Producto;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_SA;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Segmento;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Moneda;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Ocupacion;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Deducible;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_SA;
public class Func_auxiliar {

	public Obj_Catalogo asignaData(String codigo, String descripcion){
		Obj_Catalogo r = new Obj_Catalogo();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		return r;
	}
	public Sub_Obj_Cartera asignaCartera(String codigo, String descripcion, String id_ema){
		Sub_Obj_Cartera r = new Sub_Obj_Cartera();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		r.setId_ema(id_ema);
		return r;
	}
	/*
	public Sub_Obj_Moneda asignaMoneda(String cod_momneda){
		Sub_Obj_Moneda r = new Sub_Obj_Moneda();
		r.setMoneda(cod_momneda);
		return r;
	}*/
	public Sub_Obj_Producto asignaProducto(String cod_producto){
		Sub_Obj_Producto r = new Sub_Obj_Producto();
		r.setProducto(cod_producto);
		return r;
	}
	public Sub_Obj_Segmento asignaSegmento(String codigo, String descripcion, String id_ema){
		Sub_Obj_Segmento r = new Sub_Obj_Segmento();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		r.setId_ema(id_ema);
		return r;
	}
	public Sub_Obj_Moneda asignaMoneda(String cod_moneda){
		Sub_Obj_Moneda r = new Sub_Obj_Moneda();
		r.setMoneda_col(cod_moneda);
		return r;
	}
	public Sub_Obj_EdoCivil asignaEdoCivil(String codigo, String descripcion){
		Sub_Obj_EdoCivil r = new Sub_Obj_EdoCivil();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Genero asignaGenero(String codigo, String descripcion){
		Sub_Obj_Genero r = new Sub_Obj_Genero();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Giro asignaGiro(String codigo, String descripcion){
		Sub_Obj_Giro r = new Sub_Obj_Giro();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Ocupacion asignaOcupacion(String codigo, String descripcion){
		Sub_Obj_Ocupacion r = new Sub_Obj_Ocupacion();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Deducible asignaDeducible(double deducible){
		Sub_Obj_Deducible r = new Sub_Obj_Deducible();
		r.setDeducible(deducible);
		return r;
	  }
	public Sub_Obj_SA asignaSA (double suma){
		Sub_Obj_SA r = new Sub_Obj_SA();
		r.setSa(suma);
		return r;
		
	}
	
}
