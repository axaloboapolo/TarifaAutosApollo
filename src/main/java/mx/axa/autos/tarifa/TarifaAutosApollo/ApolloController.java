package mx.axa.autos.tarifa.TarifaAutosApollo;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.axa.autos.tarifa.Modelo.Call_Sp;
import mx.axa.autos.tarifa.Objetos.Obj_Marca;
import mx.axa.autos.tarifa.Objetos.Obj_SubTipo;
import mx.axa.autos.tarifa.Objetos.Obj_Usuario;
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
	public @ResponseBody Obj_SubTipo[] getSubtipo(){
		int i = 0;
		int ii = 0;
		Func_auxiliar q = new Func_auxiliar();
		Obj_SubTipo[] p;
		String[][] r;
		Call_Sp o = new Call_Sp();
		r = o.obtenSubTipo();
		while(r[i][0]!=null){
			ii = ii +1;
			i = i +1;
		}
		i = 0;
		p = new Obj_SubTipo[ii];
		while(i<ii){
			p[i]= q.asigna(r[i][0],r[i][1]);
			i = i +1;
		}
		return p;
	}
	@RequestMapping(value="/marca", method=RequestMethod.GET)
	public @ResponseBody Obj_Marca[] getMarcas(){
		Obj_Marca[] p;
		Call_Sp o = new Call_Sp();
		p = o.obtenMarca();
		return p;
	}

}
