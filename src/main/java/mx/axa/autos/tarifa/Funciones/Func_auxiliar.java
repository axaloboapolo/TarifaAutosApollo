package mx.axa.autos.tarifa.Funciones;

import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Cartera;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Producto;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Segmento;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Moneda;

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
}
