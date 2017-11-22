package mx.axa.autos.tarifa.TablasTarifa;

import java.util.Date;

public class T_M4_TCambio {
	private int Id;
	private Date Fecha_Inicio;
	private Date Fecha_Fin;
	private String Linea_Negocio;
	private String Id_Producto;
	private String Id_Tarifa;
	private String Id_Convenio;
	private String Id_Version;
	private float Tipo_Cambio;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}
	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}
	public Date getFecha_Fin() {
		return Fecha_Fin;
	}
	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}
	public String getLinea_Negocio() {
		return Linea_Negocio;
	}
	public void setLinea_Negocio(String linea_Negocio) {
		Linea_Negocio = linea_Negocio;
	}
	public String getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(String id_Producto) {
		Id_Producto = id_Producto;
	}
	public String getId_Tarifa() {
		return Id_Tarifa;
	}
	public void setId_Tarifa(String id_Tarifa) {
		Id_Tarifa = id_Tarifa;
	}
	public String getId_Convenio() {
		return Id_Convenio;
	}
	public void setId_Convenio(String id_Convenio) {
		Id_Convenio = id_Convenio;
	}
	public String getId_Version() {
		return Id_Version;
	}
	public void setId_Version(String id_Version) {
		Id_Version = id_Version;
	}
	public float getTipo_Cambio() {
		return Tipo_Cambio;
	}
	public void setTipo_Cambio(float tipo_Cambio) {
		Tipo_Cambio = tipo_Cambio;
	}

}
