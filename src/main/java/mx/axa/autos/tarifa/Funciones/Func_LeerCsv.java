package mx.axa.autos.tarifa.Funciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import mx.axa.autos.tarifa.Objetos.Obj_CargaArchivo_Cot;


public class Func_LeerCsv {
	
	public Obj_CargaArchivo_Cot[] leerArchivoCot(String ruta){
		Obj_CargaArchivo_Cot[] registros = new Obj_CargaArchivo_Cot[10000];
		Obj_CargaArchivo_Cot registro;
		BufferedReader lector = null;
		int i;
		try{
			lector = new BufferedReader(new FileReader(ruta));
			String linea = lector.readLine();
			i = 0;
			while (linea != null){
				String[] campos = linea.split(",");
				registro = new Obj_CargaArchivo_Cot();
				registro.setConsecutivo(campos[0]);
				registro.setApplication_date(campos[1]);
				registro.setLinea_negocio(campos[2]);
				registro.setProducto(campos[3]);
				registro.setTarifa(campos[4]);
				registro.setIdconvenio(campos[5]);
				registro.setIdversion(campos[6]);
				registro.setPrima_nivelada(campos[7]);
				registro.setGiro(campos[8]);
				registro.setSegmento(campos[9]);
				registro.setAgencia(campos[10]);
				registro.setCanal_de_venta(campos[11]);
				registro.setDescuento(campos[12]);
				registro.setCodigo_de_campana(campos[13]);
				registro.setTipocartera(campos[14]);
				registro.setAntiguedad_poliza(campos[15]);
				registro.setTipopoliza(campos[16]);
				registro.setDias_vig(campos[17]);
				registro.setMoneda(campos[18]);
				registro.setIndtar(campos[19]);
				registro.setCveveh(campos[20]);
				registro.setModelo(campos[21]);
				registro.setAgente(campos[22]);
				registro.setComision(campos[23]);
				registro.setCesion_com(campos[24]);
				registro.setFormapago(campos[25]);
				registro.setFraccpago(campos[26]);
				registro.setTipopersona(campos[27]);
				registro.setAuto_perfil(campos[28]);
				registro.setGenerocontratante(campos[29]);
				registro.setEdadcontratante(campos[30]);
				registro.setGeneroconductor(campos[31]);
				registro.setEdadconductor(campos[32]);
				registro.setCp(campos[33]);
				registro.setUso(campos[34]);
				registro.setServicio(campos[35]);
				registro.setDispositivo_prevencion(campos[36]);
				registro.setTipo_carga(campos[37]);
				registro.setZona_circulacion(campos[38]);
				registro.setPaquete(campos[39]);
				registro.setTipovalor(campos[40]);
				registro.setPctge_Sum_Aseg(campos[41]);
				registro.setValorconvenido(campos[42]);
				registro.setTipodeducible(campos[43]);
				registro.setDM_Ded(campos[44]);
				registro.setRT_Ded(campos[45]);
				registro.setRC_Ded(campos[46]);
				registro.setRC_SA(campos[47]);
				registro.setGMO_Aplica(campos[48]);
				registro.setGMO_SA(campos[49]);
				registro.setCRI_Ded(campos[50]);
				registro.setDL_Aplica(campos[51]);
				registro.setSERVAS_Aplica(campos[52]);
				registro.setACC_SA(campos[53]);
				registro.setEXTRC_Aplica(campos[54]);
				registro.setAMPLRC_Aplica(campos[55]);
				registro.setEE_SA(campos[56]);
				registro.setADC_SA(campos[57]);
				registro.setEDDP_Aplica(campos[58]);
				registro.setRCV_SA(campos[59]);
				registro.setPTCV_Ded(campos[60]);
				registro.setRCP_SA(campos[61]);
				registro.setASRT_Aplica(campos[62]);
				registro.setSCA_Aplica(campos[63]);
				registro.setRBIE_SA(campos[64]);
				registro.setGTR_Aplica(campos[65]);
				registro.setED3R_Aplica(campos[66]);
				registro.setRCCARGA_Aplica(campos[67]);
				registro.setDOBREMOL_Aplica(campos[68]);
				registro.setPMYC_Aplica(campos[69]);
				registro.setRCFOC_SA(campos[70]);
				registro.setRCADAP_Aplica(campos[71]);
				registro.setRCECO_Ded(campos[72]);
				registro.setRCECO_SA(campos[73]);
				registro.setRCEXTR_Aplica(campos[74]);
				registros[i] = registro;
				i ++;
				linea = lector.readLine();
			}
		}
		catch (IOException e) {
			  e.printStackTrace();
		} finally {
			  if (lector != null) {
				  try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
					return registros;
			  } 
		}
		return null;
	}
	
}