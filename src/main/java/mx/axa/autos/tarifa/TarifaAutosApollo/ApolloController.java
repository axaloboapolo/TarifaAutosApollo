package mx.axa.autos.tarifa.TarifaAutosApollo;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.axa.autos.tarifa.Modelo.Call_Sp;
import mx.axa.autos.tarifa.Modelo.WS_Data;
import mx.axa.autos.tarifa.Objetos.Obj_CargaArchivo_Cot;
import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Obj_Cliente;
import mx.axa.autos.tarifa.Objetos.Obj_DatosGenerales;
import mx.axa.autos.tarifa.Objetos.Obj_Usuario;
import mx.axa.autos.tarifa.Objetos.Obj_Cobertura;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Deducible;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_SA;
import mx.axa.tarifa.Objetos_Servicios.WS_CatCP;
import mx.axa.tarifa.Objetos_Servicios.WS_DatosCliente;
import mx.axa.tarifa.Objetos_Servicios.WS_DatosGenerales;
import mx.axa.tarifa.Objetos_Servicios.WS_Obj_Fichero;
import mx.axa.tarifa.Objetos_Servicios.*;
import mx.axa.autos.tarifa.Funciones.Func_LeerCsv;
import mx.axa.autos.tarifa.Funciones.Func_auxiliar;

@Controller
public class ApolloController {

	@RequestMapping(value="/ingresa", method=RequestMethod.POST)
	public @ResponseBody Obj_Usuario getPerfil(@RequestParam(value="usuario", required=true) String usuario,
										  @RequestParam(value="pass", required=true) String password) throws SQLException{
		Call_Sp o = new Call_Sp();
		String perfil;
		Obj_Usuario u = new Obj_Usuario();
		u.setUsuario(usuario);
		u.setPassword(password);
		perfil = o.obtenUsuario(usuario, password);
		u.setPerfil(perfil);
		return u;
	}
	@RequestMapping(value="/subtipo", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getSubtipo(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenSubTipo();
		return p;
	}
	@RequestMapping(value="/marca", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getMarcas(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenMarca();
		return p;
	}
	@RequestMapping(value="/categoria", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getCategoria(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenCategoria();
		return p;
	}
	@RequestMapping(value="/tipovalor", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getTipoValor(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenTipoValor();
		return p;
	}																											
	@RequestMapping(value="/cobertura", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getCobertura(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenCobertura();
		return p;
	}
	@RequestMapping(value="/deducible", method=RequestMethod.GET)
	public @ResponseBody Sub_Obj_Deducible[] getDeducible(@RequestParam(value="cobertura",required=true)String cobertura){
		Sub_Obj_Deducible[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenDeducible(cobertura);
		return p;
	}
	@RequestMapping(value="/suma" , method=RequestMethod.GET)
	public @ResponseBody Sub_Obj_SA[] getSA(@RequestParam(value="cobertura",required=true)String cobertura){
		Sub_Obj_SA[] p;
		Call_Sp o = new Call_Sp();
		p =o.obtenSumaA(cobertura);
		return p;
		}
	@RequestMapping(value="/wsdatosgenerales", method=RequestMethod.GET)
	public @ResponseBody WS_DatosGenerales getDatosGenerales(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_DatosGenerales p;
		WS_Data o = new WS_Data();
		p = o.obtenWSDatosGenerales(convenio, version);
		return p;
	}
	@RequestMapping(value="/wscliente", method=RequestMethod.GET)
	public @ResponseBody WS_DatosCliente getDatosCliente(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_DatosCliente p;
		WS_Data o = new WS_Data();
		p = o.obtenDatosCliente(convenio, version);
		return p;
	}
	
	@RequestMapping(value="/wscp", method=RequestMethod.GET)
	public @ResponseBody WS_CatCP[] getDatosCP(@RequestParam(value="cp", required=true) int cp) throws SQLException{
		WS_CatCP[] p;
		WS_Data o = new WS_Data();
		p = o.obtenWScatCP(cp);
		return p;
	}
	
	@RequestMapping(value="/uso", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getUso(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenUso();
		return p;
	}
	
	@RequestMapping(value="/indicecat", method=RequestMethod.GET)
	public @ResponseBody Obj_Catalogo[] getIndiceCat(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenIndiceCat();
		return p;
	}

	@RequestMapping(value="/wsfichero", method=RequestMethod.GET)
	public @ResponseBody WS_Obj_Fichero[] getFichero(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_Obj_Fichero [] p;
		WS_Data o = new WS_Data();
		p = o.obtenWSObjFichero(convenio,version);
		return p;
	}

	@RequestMapping(value="/wscoberturas", method=RequestMethod.GET)
	public @ResponseBody WS_Obj_CoberturaRest[] getCoberturaRest(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_Obj_CoberturaRest [] p;
		WS_Data o = new WS_Data();
		p = o.obtenWSObjCobRest(convenio,version);
		return p;
	}
	
	@RequestMapping(value="/wsriesgos", method=RequestMethod.GET)
	public @ResponseBody WS_DatosRiesgos getDatosRiesgos(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_DatosRiesgos p;
		WS_Data o = new WS_Data();
		p = o.obtenWSDatosRiesgos(convenio,version);
		return p;
	}
	
	@RequestMapping(value="/wsmanejo", method=RequestMethod.GET)
	public @ResponseBody WS_DatosManejo getDatosManejo(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		WS_DatosManejo p;
		WS_Data o = new WS_Data();
		p = o.obtenWSDatosManejo(convenio,version);
		return p;
	}
	 
	@RequestMapping(value="/wscotporarchivo", method=RequestMethod.GET)
	 public @ResponseBody Obj_CargaArchivo_Cot[] getCotArchivo(@RequestParam(value="ruta", required = true)String ruta) throws IOException{
		Obj_CargaArchivo_Cot[] r;
		Func_LeerCsv l = new Func_LeerCsv();
		r = l.leerArchivoCot(ruta);
		return r;
	}
	
}