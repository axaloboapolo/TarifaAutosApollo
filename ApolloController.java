package mx.axa.autos.tarifa.TarifaAutosApollo;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.axa.autos.tarifa.Modelo.Call_Sp;
import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Obj_Cliente;
import mx.axa.autos.tarifa.Objetos.Obj_DatosGenerales;
import mx.axa.autos.tarifa.Objetos.Obj_Usuario;
import mx.axa.autos.tarifa.Objetos.Obj_Cobertura;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Deducible;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_SA;

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
	public @ResponseBody Obj_Cobertura[] getCobertura(){
		Obj_Catalogo[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenCobertura();
		return p;
	}
	@RequestMapping(value="/deducible", method=RequestMethod.GET)
	public @ResponseBody Sub_Obj_Deducible[] getDeducible(){
		Sub_Obj_Deducible[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenDeducible();
		return p;
	}
	@RequestMapping(value="/suma" , method=RequestMethod.GET)
	public @ResponseBody Sub_Obj_SA[] getSA(){
		Sub_Obj_SA[] p;
		Call_Sp o = new Call_Sp();
		p =o.obtenSumaA();
		return p;
		}
	@RequestMapping(value="/wsdatosgenerales", method=RequestMethod.GET)
	public @ResponseBody Obj_DatosGenerales getDatosGenerales(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		Obj_DatosGenerales p;
		Call_Sp o = new Call_Sp();
		p = o.obtenDatosGenerales(convenio, version);
		return p;
	}
	@RequestMapping(value="/wscliente", method=RequestMethod.GET)
	public @ResponseBody Obj_Cliente getDatosCliente(@RequestParam(value="convenio", required=true) String convenio,
			  @RequestParam(value="version", required=true) String version) throws SQLException{
		Obj_Cliente p;
		Call_Sp o = new Call_Sp();
		p = o.obtenCliente(convenio, version);
		return p;
	}
	
}
