package mx.axa.autos.tarifa.TablasCatalogos;

import java.util.Date;

public class Cat_Usuarios {

	private int Id;
	private String Codigo;
	private String Descripcion;
	private String Id_Ema;
	private Date Fecha_Baja;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getId_Ema() {
		return Id_Ema;
	}
	public void setId_Ema(String id_Ema) {
		Id_Ema = id_Ema;
	}
	public Date getFecha_Baja() {
		return Fecha_Baja;
	}
	public void setFecha_Baja(Date fecha_Baja) {
		Fecha_Baja = fecha_Baja;
	}
}
