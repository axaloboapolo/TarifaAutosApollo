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
		r.setGiro(obtenWSGiro(convenio, version));
		r.setOcupacion(obtenWSOcupacion(convenio, version));
		r.setEstadocivil(obtenWSEstadoCivil(convenio, version));
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
				c[i] = f.asignaWSData(rs.getString("COD_GENERO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
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
	
	public WS_Giro obtenWSGiro(String convenio, String version){
		int i = 0;
		WS_Giro r = new WS_Giro();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_GIRO(?,?,?)}");
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
				c[i] = f.asignaWSData(rs.getString("COD_GIRO"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setGiro_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Ocupacion obtenWSOcupacion(String convenio, String version){
		int i = 0;
		WS_Ocupacion r = new WS_Ocupacion();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_OCUPACION(?,?,?)}");
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
				c[i] = f.asignaWSData(rs.getString("COD_OCUPACION"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setOcupacion_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_EstadoCivil obtenWSEstadoCivil(String convenio, String version){
		int i = 0;
		WS_EstadoCivil r = new WS_EstadoCivil();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_ESTADOCIVIL(?,?,?)}");
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
				c[i] = f.asignaWSData(rs.getString("COD_ESTADOCIVIL"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setEstadocivil_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_CatCP[] obtenWScatCP(int cp){
		int i = 0;
		WS_CatCP[] r = new WS_CatCP[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_CONS_CP(?,?)}");
			sp.setInt("IN_CP", cp);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			r = new WS_CatCP[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				r[i] = f.asignaWSCatCP(rs.getString("D_CODIGO"), rs.getString("D_ASENTA"), rs.getString("D_TIPO_ASENTA"), rs.getString("D_MNPIO"), rs.getString("D_ESTADO"), rs.getString("D_CIUDAD"), rs.getString("D_CP"), rs.getString("C_ESTADO"), rs.getString("C_OFICINA"), rs.getString("C_CP"), rs.getString("C_TIPO_ASENTA"), rs.getString("C_MNPIO"), rs.getString("ID_ASENTA_CPCONS"), rs.getString("D_ZONA"), rs.getString("C_CVE_CIUDAD"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			r[0] = f.asignaWSCatCP("error", e.getMessage(), null, null, null, null, null, null, null, null, null, null, null, null, null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Obj_Fichero[] obtenWSObjFichero(String convenio, String version){
		int i=0;
		WS_Obj_Fichero[] r  =  new WS_Obj_Fichero[i];		
		Func_auxiliar f = new Func_auxiliar();
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_FICHERO(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
			sp.setString("IN_VERSION",version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			r = new WS_Obj_Fichero[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				r[i] = f.asignaWSObjFichero(rs.getString("ID"),rs.getString("CLVAMIS"),rs.getString("CVEVEH"),rs.getString("MODELO"),rs.getString("DESCRIPCION"),rs.getString("CVEMARCA"),rs.getString("CVESUBTIPO"),rs.getString("CVECATEGORIA"),rs.getString("NOMCATEGORIA"),rs.getString("MARCA"),rs.getString("VERSION"),rs.getString("CVEVERSION"),rs.getString("DESCLINEA"),rs.getString("CVELINEA"),rs.getString("GPOEST"),rs.getString("NOMGPO"),rs.getString("MARCATIPOSESA"),rs.getString("CVEAMISSESA"),rs.getString("CLASIFVEH"),rs.getString("GPORC"),rs.getString("UID_"),rs.getString("LITROS"),rs.getString("CAPACIDADCARGATON"),rs.getString("TRANSMISION"),rs.getString("AIREACONDICIONADO"),rs.getString("PASAJEROS"),rs.getString("PUERTAS"),rs.getString("CARROCERIA"),rs.getString("TAPICASIENTOS"),rs.getString("PESO"),rs.getString("POTENCIA"),rs.getString("CILINDROS"),rs.getString("CILINDRADA"),rs.getString("ACELERACION"),rs.getString("LONGITUD"),rs.getString("PARMOTOR"),rs.getString("COMBUSTIBLE"),rs.getString("TIPODEMOTOR"),
						rs.getString("TIPOCABINA"),rs.getString("CAPACIDADENPIES"),rs.getString("NUMERODEEJES"),rs.getString("TIPODESUSPENSION"),rs.getString("TIPODEEQUIPODEREFRIGERACION"),rs.getString("TIPODEMATERIAL"),rs.getString("SUBTIPODEVEHICULO"),rs.getString("CAMPO_ADIC2"),rs.getString("CAMPO_ADIC3"),rs.getString("CAMPO_ADIC4"),rs.getString("CAMPO_ADIC5"),rs.getString("CAMPO_ADIC6"),rs.getString("MONEDA"),rs.getString("VALORNUEVOJATO"),rs.getString("FACTUALIZAVNJATO"),rs.getString("FBAJAVNJATO"),rs.getString("VAUTALTO"),rs.getString("VAUTBAJO"),rs.getString("FACTUALIZAAUT"),rs.getString("FBAJAAUT"),rs.getString("VEBCALTO"),rs.getString("VEBCBAJO"),rs.getString("FACTUALIZAEBC"),rs.getString("FBAJAEBC"),rs.getString("V1SINIESTROS"),rs.getString("V2SINIESTROS"),rs.getString("FACTUALIZANUEVOSINIESTROS"),rs.getString("FACTUALIZAUSADOSINIESTROS"),rs.getString("V2ACTUARIAL1"),rs.getString("FACTUALIZAVALORACTUARIAL1"),rs.getString("FBAJAVALORACTUARIAL1"),rs.getString("VALOR_ADICIONAL_1"),rs.getString("F_ACTUALIZA_VALOR_ADI_1"),rs.getString("VALOR_ADICIONAL_2"),rs.getString("F_ACTUALIZA_VALOR_ADI_2"),rs.getString("VALOR_ADICIONAL_3"),
						rs.getString("F_ACTUALIZA_VALOR_ADI_3"));

				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			r[0] = f.asignaWSObjFichero("error", e.getMessage(),null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Obj_CoberturaRest[] obtenWSObjCobRest(String convenio, String version){
		int i = 0;
		WS_Obj_CoberturaRest[] r = new WS_Obj_CoberturaRest[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_COBERTURA(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
			sp.setString("IN_VERSION", version);
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			ResultSet rs = (ResultSet)sp.getObject("OUT_C");
			while(rs.next()){
				i = i + 1;
			}
			r = new WS_Obj_CoberturaRest[i];
			sp.registerOutParameter("OUT_C", OracleTypes.CURSOR);
			sp.execute();
			rs = (ResultSet)sp.getObject("OUT_C");
			i=0;
			while(rs.next()){
				r[i] = f.aisgnaWSObjCobRest(rs.getString("COD_COBERTURA"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"),rs.getString("SA_COBERTURA"),rs.getString("DED_COBERTURA"));
				i = i + 1;
			}
			con.close();
			} catch (SQLException e) {
			r[0] = f.aisgnaWSObjCobRest("error", e.getMessage(), null, null, null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_TipoValor obtenWSTipoValor(String convenio, String version){
		int i = 0;
		WS_TipoValor r = new WS_TipoValor();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_TIPOVALOR(?,?,?)}");
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
				c[i] = f.asignaWSData(rs.getString("COD_TIPOVALOR"), rs.getString("DESCRIPCION"), rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setTipoValor_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("Eror",e.getMessage(),null);
			return r;
		}finally{		
	}
		return r;
	}	public WS_TipoCarga obtenWSTipoCarga(String convenio, String version){
		int i = 0;
		WS_TipoCarga r = new WS_TipoCarga();
		WS_Obj_Catalogo[] c= new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_TIPOCARGA(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_TIPOCARGA"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setTipoCarga_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Servicio obtenWSServicio(String convenio, String version){
		int i = 0;
		WS_Servicio r = new WS_Servicio();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_SERVICIO(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_SERVICIO"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setServicio_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Uso obtenWSUso(String convenio, String version){
		int i = 0;
		WS_Uso r = new WS_Uso();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_USO(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_USO"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setUso_data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_DatosRiesgos obtenWSDatosRiesgos(String convenio, String version){
		WS_DatosRiesgos r = new WS_DatosRiesgos();
		r.setTipoValor(obtenWSTipoValor(convenio, version));
		r.setTipoCarga(obtenWSTipoCarga(convenio, version));
		r.setServicio(obtenWSServicio(convenio, version));
		r.setUso(obtenWSUso(convenio, version));
		return r;
	}
	
	
	public WS_MedioPago obtenWSMedioPago(String convenio, String version){
		int i = 0;
		WS_MedioPago r = new WS_MedioPago();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_MEDIOPAGO(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_MEDIOPAGO"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setMedioPago_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	public WS_FrecuenciaPago obtenWSFrecuenciaPago(String convenio, String version){
		int i = 0;
		WS_FrecuenciaPago r = new WS_FrecuenciaPago();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_FRECUENCIAPAGO(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_FRECUENCIAPAGO"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setFrecuenciaPago_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_Paquete obtenWSPaquete(String convenio, String version){
		int i = 0;
		WS_Paquete r = new WS_Paquete();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_PAQUETE(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_PAQUETE"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setPaquete_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	public WS_CanalVenta obtenWSCanalVenta(String convenio, String version){
		int i = 0;
		WS_CanalVenta r = new WS_CanalVenta();
		WS_Obj_Catalogo[] c = new WS_Obj_Catalogo[i];
		Func_auxiliar f = new Func_auxiliar(); 
		conexion = new Conexion();
		try{
			Connection con =conexion.getconnection();
			CallableStatement sp = con.prepareCall("{call SP_REST_CANALVENTA(?,?,?)}");
			sp.setString("IN_CONVENIO",convenio);
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
				c[i] = f.asignaWSData(rs.getString("COD_CANALVENTA"),rs.getString("DESCRIPCION"),rs.getString("ID_EMA"));
				i = i + 1;
			}
			r.setCanalVenta_Data(c);
			con.close();
			} catch (SQLException e) {
			c[0] = f.asignaWSData("error", e.getMessage(), null);
			return r;
		}finally{		
	}
		return r;
	}
	
	public WS_DatosManejo obtenWSDatosManejo(String convenio, String version){
		WS_DatosManejo r = new WS_DatosManejo();
		r.setMediopago(obtenWSMedioPago(convenio, version));
		r.setFrecuenciapago(obtenWSFrecuenciaPago(convenio, version));
		r.setSegmento(obtenWSSegmentoMercado(convenio, version));
		r.setPaquete(obtenWSPaquete(convenio, version));
		r.setCanalventa(obtenWSCanalVenta(convenio, version));
		return r;
	}
	
	}

