package mx.axa.autos.tarifa.Funciones;


import mx.axa.autos.tarifa.Objetos.Obj_Catalogo;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Cartera;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_EdoCivil;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Genero;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Giro;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Producto;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Segmento;
import mx.axa.tarifa.Objetos_Servicios.WS_CatCP;
import mx.axa.tarifa.Objetos_Servicios.WS_Obj_Catalogo;
import mx.axa.tarifa.Objetos_Servicios.WS_Obj_CoberturaRest;
import mx.axa.tarifa.Objetos_Servicios.WS_Obj_Fichero;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Moneda;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Ocupacion;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_Deducible;
import mx.axa.autos.tarifa.Objetos.Sub_Obj_SA;

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
	public Sub_Obj_EdoCivil asignaEdoCivil(String codigo, String descripcion){
		Sub_Obj_EdoCivil r = new Sub_Obj_EdoCivil();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Genero asignaGenero(String codigo, String descripcion){
		Sub_Obj_Genero r = new Sub_Obj_Genero();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Giro asignaGiro(String codigo, String descripcion){
		Sub_Obj_Giro r = new Sub_Obj_Giro();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Ocupacion asignaOcupacion(String codigo, String descripcion){
		Sub_Obj_Ocupacion r = new Sub_Obj_Ocupacion();
		r.setCodigo_col(codigo);
		r.setDescripcion_col(descripcion);
		return r;
	}
	public Sub_Obj_Deducible asignaDeducible(String deducible){
		Sub_Obj_Deducible r = new Sub_Obj_Deducible();
		r.setDeducible(deducible);
		return r;
	  }
	public Sub_Obj_SA asignaSA (String suma){
		Sub_Obj_SA r = new Sub_Obj_SA();
		r.setSa(suma);
		return r;
	}
	public WS_Obj_Catalogo asignaWSData(String codigo, String descripcion, String idEma){
		WS_Obj_Catalogo r = new WS_Obj_Catalogo();
		r.setCodigo(codigo);
		r.setDescripcion(descripcion);
		r.setIdEma(idEma);
		return r;
	}
	public WS_CatCP asignaWSCatCP(String d_codigo, String d_asenta, String d_tipo_asenta, String D_mnpio, String d_estado, String d_ciudad, String d_CP, String c_estado, String c_oficina, String c_CP, String c_tipo_asenta, String c_mnpio, String id_asenta_cpcons, String d_zona, String c_cve_ciudad){
		WS_CatCP r = new WS_CatCP();
		r.setD_codigo(d_codigo);
		r.setC_CP(c_CP);
		r.setC_cve_ciudad(c_cve_ciudad);
		r.setC_estado(c_estado);
		r.setC_mnpio(c_mnpio);
		r.setC_oficina(c_oficina);
		r.setC_tipo_asenta(c_tipo_asenta);
		r.setD_asenta(d_asenta);
		r.setD_ciudad(d_ciudad);
		r.setD_CP(d_CP);
		r.setD_estado(d_estado);
		r.setD_mnpio(D_mnpio);
		r.setD_tipo_asenta(d_tipo_asenta);
		r.setD_zona(d_zona);
		r.setId_asenta_cpcons(id_asenta_cpcons);
		return r;
	}
	public WS_Obj_Fichero asignaWSObjFichero(String ID ,	String CLVAMIS ,	String CVEVEH ,	String MODELO ,	String DESCRIPCION ,	String CVEMARCA ,	String CVESUBTIPO ,	String CVECATEGORIA ,	String NOMCATEGORIA ,	String MARCA ,	String VERSION ,	String CVEVERSION ,	String DESCLINEA ,	String CVELINEA ,	String GPOEST ,	String NOMGPO ,	String MARCATIPOSESA ,	String CVEAMISSESA ,	String CLASIFVEH ,	String GPORC ,	String UID_ ,	String LITROS ,	String CAPACIDADCARGATON ,	String TRANSMISION ,	String AIREACONDICIONADO ,	String PASAJEROS ,	String PUERTAS ,	String CARROCERIA ,	String TAPICASIENTOS ,	String PESO ,	String POTENCIA ,	String CILINDROS ,	String CILINDRADA ,	String ACELERACION ,	String LONGITUD ,	String PARMOTOR ,	String COMBUSTIBLE ,	String TIPODEMOTOR ,	String TIPOCABINA ,	String CAPACIDADENPIES ,	String NUMERODEEJES ,	String TIPODESUSPENSION ,	String TIPODEEQUIPODEREFRIGERACION ,	String TIPODEMATERIAL ,	String SUBTIPODEVEHICULO ,	String CAMPO_ADIC2 ,	String CAMPO_ADIC3 ,	String CAMPO_ADIC4 ,	String CAMPO_ADIC5 ,	String CAMPO_ADIC6 ,	String MONEDA ,	String VALORNUEVOJATO ,	String FACTUALIZAVNJATO ,	String FBAJAVNJATO ,	String VAUTALTO ,	String VAUTBAJO ,	String FACTUALIZAAUT ,	String FBAJAAUT ,	String VEBCALTO ,	String VEBCBAJO ,	String FACTUALIZAEBC ,	String FBAJAEBC ,	String V1SINIESTROS ,	String V2SINIESTROS ,	String FACTUALIZANUEVOSINIESTROS ,	String FACTUALIZAUSADOSINIESTROS ,	String V2ACTUARIAL1 ,	String FACTUALIZAVALORACTUARIAL1 ,	String FBAJAVALORACTUARIAL1 ,	String VALOR_ADICIONAL_1 ,	String F_ACTUALIZA_VALOR_ADI_1 ,	String VALOR_ADICIONAL_2 ,	String F_ACTUALIZA_VALOR_ADI_2 ,	String VALOR_ADICIONAL_3 ,	String F_ACTUALIZA_VALOR_ADI_3){
		WS_Obj_Fichero r = new WS_Obj_Fichero();
		r.setACELERACION(ACELERACION);
		r.setAIREACONDICIONADO(AIREACONDICIONADO);
		r.setCAMPO_ADIC2(CAMPO_ADIC2);
		r.setCAMPO_ADIC3(CAMPO_ADIC3);
		r.setCAMPO_ADIC4(CAMPO_ADIC4);
		r.setCAMPO_ADIC5(CAMPO_ADIC5);
		r.setCAMPO_ADIC6(CAMPO_ADIC6);
		r.setCAPACIDADCARGATON(CAPACIDADCARGATON);
		r.setCAPACIDADENPIES(CAPACIDADENPIES);
		r.setCARROCERIA(CARROCERIA);
		r.setCILINDRADA(CILINDRADA);
		r.setCILINDROS(CILINDROS);
		r.setCLASIFVEH(CLASIFVEH);
		r.setCLVAMIS(CLVAMIS);
		r.setCOMBUSTIBLE(COMBUSTIBLE);
		r.setCVEAMISSESA(CVEAMISSESA);
		r.setCVECATEGORIA(CVECATEGORIA);
		r.setCVELINEA(CVELINEA);
		r.setCVEMARCA(CVEMARCA);
		r.setCVESUBTIPO(CVESUBTIPO);
		r.setCVEVEH(CVEVEH);
		r.setCVEVERSION(CVEVERSION);
		r.setDESCLINEA(DESCLINEA);
		r.setDESCRIPCION(DESCRIPCION);
		r.setF_ACTUALIZA_VALOR_ADI_1(F_ACTUALIZA_VALOR_ADI_1);
		r.setF_ACTUALIZA_VALOR_ADI_2(F_ACTUALIZA_VALOR_ADI_2);
		r.setF_ACTUALIZA_VALOR_ADI_3(F_ACTUALIZA_VALOR_ADI_3);
		r.setFACTUALIZAAUT(FACTUALIZAAUT);
		r.setFACTUALIZAEBC(FACTUALIZAEBC);
		r.setFACTUALIZANUEVOSINIESTROS(FACTUALIZANUEVOSINIESTROS);
		r.setFACTUALIZAUSADOSINIESTROS(FACTUALIZAUSADOSINIESTROS);
		r.setFACTUALIZAVALORACTUARIAL1(FACTUALIZAVALORACTUARIAL1);
		r.setFACTUALIZAVNJATO(FACTUALIZAVNJATO);
		r.setFBAJAAUT(FBAJAAUT);
		r.setFBAJAEBC(FBAJAEBC);
		r.setFBAJAVALORACTUARIAL1(FBAJAVALORACTUARIAL1);
		r.setFBAJAVNJATO(FBAJAVNJATO);
		r.setGPOEST(GPOEST);
		r.setGPORC(GPORC);
		r.setID(ID);
		r.setLITROS(LITROS);
		r.setLONGITUD(LONGITUD);
		r.setMARCA(MARCA);
		r.setMARCATIPOSESA(MARCATIPOSESA);
		r.setMODELO(MODELO);
		r.setNOMCATEGORIA(NOMCATEGORIA);
		r.setNOMGPO(NOMGPO);
		r.setNUMERODEEJES(NUMERODEEJES);
		r.setPARMOTOR(PARMOTOR);
		r.setPASAJEROS(PASAJEROS);
		r.setPESO(PESO);
		r.setPOTENCIA(POTENCIA);
		r.setPUERTAS(PUERTAS);
		r.setSUBTIPODEVEHICULO(SUBTIPODEVEHICULO);
		r.setTAPICASIENTOS(TAPICASIENTOS);
		r.setTIPOCABINA(TIPOCABINA);
		r.setTIPODEEQUIPODEREFRIGERACION(TIPODEEQUIPODEREFRIGERACION);
		r.setTIPODEMATERIAL(TIPODEMATERIAL);
		r.setTIPODEMOTOR(TIPODEMOTOR);
		r.setTIPODESUSPENSION(TIPODESUSPENSION);
		r.setTRANSMISION(TRANSMISION);
		r.setUID_(UID_);
		r.setV1SINIESTROS(V1SINIESTROS);
		r.setV2ACTUARIAL1(V2ACTUARIAL1);
		r.setV2SINIESTROS(V2SINIESTROS);
		r.setVALOR_ADICIONAL_1(VALOR_ADICIONAL_1);
		r.setVALOR_ADICIONAL_2(VALOR_ADICIONAL_2);
		r.setVALOR_ADICIONAL_3(VALOR_ADICIONAL_3);
		r.setVALORNUEVOJATO(VALORNUEVOJATO);
		r.setVAUTALTO(VAUTALTO);
		r.setVAUTBAJO(VAUTBAJO);
		r.setVEBCALTO(VEBCALTO);
		r.setVEBCBAJO(VEBCBAJO);
		r.setVERSION(VERSION);
		return r;
	}
	public WS_Obj_CoberturaRest aisgnaWSObjCobRest(String codCobertura,String descripcion,String id_ema,String sumaAsegurada,String deducible){
		WS_Obj_CoberturaRest r = new WS_Obj_CoberturaRest();
		r.setCodCobertura(codCobertura);
		r.setDescripcion(descripcion);
		r.setId_ema(id_ema);
		r.setDeducible(deducible);
		r.setSumaAsegurada(sumaAsegurada);
		return r;
		
	}
	

	
	
}
