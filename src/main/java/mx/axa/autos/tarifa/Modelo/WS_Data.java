package mx.axa.autos.tarifa.Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;  

import oracle.jdbc.OracleTypes; 
import mx.axa.autos.tarifa.Funciones.Func_auxiliar;
import mx.axa.tarifa.Objetos_Servicios.*;

public class WS_Data {
	private static Conexion conexion;
	
	public WS_DatosGenerales obtenWSDatosGenerales(String convenio, String version){
		WS_DatosGenerales r = new WS_DatosGenerales();
		r.setMoneda(obtenWSMoneda(convenio, version));
		r.setProducto(obtenWSProducto(convenio, version));
		r.setTipovigencia(obtenWSTipoVigencia(convenio, version));
		r.setSegmentomercado(obtenWSSegmentoMercado(convenio, version));
		r.setCartera(obtenWSCartera(convenio, version));
		return r;
	}
	
	public WS_Moneda obtenWSMoneda(String convenio, String version){
		int i = 0;
		WS_Moneda r = new WS_Moneda();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_MONEDA(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_MONEDA"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setMoneda_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_producto obtenWSProducto(String convenio, String version){
		int i = 0;
		WS_producto r = new WS_producto();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_PRODUCTO(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_PRODUCTO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setProducto_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_TipoVigencia obtenWSTipoVigencia(String convenio, String version){
		int i = 0;
		WS_TipoVigencia r = new WS_TipoVigencia();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_TIPOVIGENCIA(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_TIPOVIGENCIA"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setTipovigencia_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_SegmentoMercado obtenWSSegmentoMercado(String convenio, String version){
		int i = 0;
		WS_SegmentoMercado r = new WS_SegmentoMercado();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_SEGMENTOMERCADO(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_SEGMENTO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setSegmentomercado_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Cartera obtenWSCartera(String convenio, String version){
		int i = 0;
		WS_Cartera r = new WS_Cartera();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_CARTERA(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_CARTERA"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setCartera_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_DatosCliente obtenDatosCliente(String convenio, String version){
		WS_DatosCliente r = new WS_DatosCliente();
		r.setGenero(obtenWSGenero(convenio, version));
		//r.setGiro(giro);
		//r.setOcupacion(ocupacion);
		//r.setEstadocivil(estadocivil);
		return r;
	}
	
	public WS_Genero obtenWSGenero(String convenio, String version){
		int i = 0;
		WS_Genero r = new WS_Genero();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_GENERO(?,?,?)}");
			sp.setString("IN_CONVENIO", convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			c = new WS_Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				c[i] = f.asignaWSData(rs.getString("COD_CARTERA"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setGenero_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	
	}

