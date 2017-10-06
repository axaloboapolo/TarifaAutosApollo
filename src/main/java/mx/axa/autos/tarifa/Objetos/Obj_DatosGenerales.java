package mx.axa.autos.tarifa.Objetos;

public class Obj_DatosGenerales {
	private Sub_Obj_Cartera[] cartera;
	private Sub_Obj_Moneda[] moneda;
	private Sub_Obj_Producto[] producto;
	private Sub_Obj_Segmento[] segmento;
	public Sub_Obj_Cartera[] getCartera() {
		return cartera;
	}
	public void setCartera(Sub_Obj_Cartera[] cartera) {
		this.cartera = cartera;
	}
	public Sub_Obj_Moneda[] getMoneda() {
		return moneda;
	}
	public void setMoneda(Sub_Obj_Moneda[] moneda) {
		this.moneda = moneda;
	}
	public Sub_Obj_Producto[] getProducto() {
		return producto;
	}
	public void setProducto(Sub_Obj_Producto[] producto) {
		this.producto = producto;
	}
	public Sub_Obj_Segmento[] getSegmento() {
		return segmento;
	}
	public void setSegmento(Sub_Obj_Segmento[] segmento) {
		this.segmento = segmento;
	}
}
