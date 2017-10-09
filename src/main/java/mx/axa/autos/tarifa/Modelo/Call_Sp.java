package mx.axa.autos.tarifa.Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;  
import java.sql.Types;

import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Obj_DatosGenerales;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Cartera;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Moneda;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Producto;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Segmento;
import oracle.jdbc.OracleTypes; 
import mx.axa.autos.tarifa.Funciones.Func_auxiliar;
public class Call_Sp {

	private static Conexion conexion;

	public String obtenUsuario(String usuario, String pass){
		
		String salida = null;
		conexion = new Conexion();
			try{
				Connection con =conexion.getconnection();
				CallableStatement sp = con.prepareCall("{call SP_CONS_PERFIL(?,?,?)}");
				sp.setString("IN_USUARIO", usuario);
				sp.setString("IN_CONTRASE", pass);
				sp.registerOutParameter("OUT_PERFIL", Types.NVARCHAR);
				sp.execute();
				salida = sp.getString("OUT_PERFIL");
				con.close();
				} catch (SQLException e) {
					return e.getMessage();
				}finally{		
			}
			return salida;
		}
	
	public Obj_Catalogo[] obtenSubTipo(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Obj_Catalogo[] m = null;
		conexion = new Conexion();
			try{
				Connection con =conexion.getconnection();
				CallableStatement sp = con.prepareCall("{call SP_CONS_SUBTIPO(?)}");
				sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
				sp.execute();
				ResultSet rs = (ResultSet)sp.getObject("OUT_C");
				while(rs.next()){
					i = i + 1;
				}
				m = new Obj_Catalogo[i];
				sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
				sp.execute();
				rs = (ResultSet)sp.getObject("OUT_C");
				i=0;
				while(rs.next()){
					m[i] = f.asignaData(rs.getString("CODIGO"), rs.getString("DESCRIPCION"));
					i = i + 1;
				}
				con.close();
				} catch (SQLException e) {
					m[0] = f.asignaData("Error", e.getMessage());
					return m;
				}finally{		
			}
			return m;
		}
	public Obj_Catalogo[] obtenMarca(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Obj_Catalogo[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_MARCA(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaData(rs.getString("CODIGO"), rs.getString("DESCRIPCION"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaData("Error", e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}
	public Obj_Catalogo[] obtenCategoria(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Obj_Catalogo[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_CATEGORIA(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaData(rs.getString("CODIGO"), rs.getString("DESCRIPCION"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaData("Error", e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}	
	public Obj_Catalogo[] obtenTipoValor(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Obj_Catalogo[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_TIPOVALOR(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaData(rs.getString("CODIGO"), rs.getString("DESCRIPCION"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaData("Error", e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}	
	public Obj_Catalogo[] obtenCobertura(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Obj_Catalogo[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_COBERTURA(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Obj_Catalogo[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaData(rs.getString("CODIGO"), rs.getString("DESCRIPCION"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaData("Error", e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}
	public Obj_DatosGenerales obtenDatosGenerales(String convenio, String version){
		Obj_DatosGenerales o = new Obj_DatosGenerales();
		o.setCartera(obtenCartera());
		o.setMoneda(obtenMoneda(convenio, version));
		o.setProducto(obtenProducto(convenio, version));
		o.setSegmento(obtenSegmento());
		return o;
	}
	public Sub_Obj_Cartera[] obtenCartera(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Sub_Obj_Cartera[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_CARTERA(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Sub_Obj_Cartera[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaCartera(rs.getString("CODIGO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaCartera("Error", e.getMessage(), null);
			return m;
		}finally{		
	}
		return m;
	}
	public Sub_Obj_Moneda[] obtenMoneda(String convenio, String version){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Sub_Obj_Moneda[] m = null;
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
			m = new Sub_Obj_Moneda[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaMoneda(rs.getString("COD_MONEDA"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaMoneda(e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}
	
	public Sub_Obj_Producto[] obtenProducto(String convenio, String version){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Sub_Obj_Producto[] m = null;
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
			m = new Sub_Obj_Producto[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaProducto(rs.getString("COD_PRODUCTO"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaProducto(e.getMessage());
			return m;
		}finally{		
	}
		return m;
	}
	
	public Sub_Obj_Segmento[] obtenSegmento(){
		int i = 0;
		Func_auxiliar f = new Func_auxiliar();
		Sub_Obj_Segmento[] m = null;
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_CARTERA(?)}");
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			m = new Sub_Obj_Segmento[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				m[i] = f.asignaSegmento(rs.getString("CODIGO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			m[0] = f.asignaSegmento("Error", e.getMessage(), null);
			return m;
		}finally{		
	}
		return m;
	}
}
