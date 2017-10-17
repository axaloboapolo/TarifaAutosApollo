package mx.axa.tarifa.Objetos_Servicios;

public class WS_DatosGenerales {
	private WS_Moneda moneda;
	private WS_producto producto;
	private WS_Cartera cartera;
	private WS_TipoVigencia tipovigencia;
	private WS_SegmentoMercado segmentomercado;
	public WS_Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(WS_Moneda moneda) {
		this.moneda = moneda;
	}
	public WS_producto getProducto() {
		return producto;
	}
	public void setProducto(WS_producto producto) {
		this.producto = producto;
	}
	public WS_Cartera getCartera() {
		return cartera;
	}
	public void setCartera(WS_Cartera cartera) {
		this.cartera = cartera;
	}
	public WS_TipoVigencia getTipovigencia() {
		return tipovigencia;
	}
	public void setTipovigencia(WS_TipoVigencia tipovigencia) {
		this.tipovigencia = tipovigencia;
	}
	public WS_SegmentoMercado getSegmentomercado() {
		return segmentomercado;
	}
	public void setSegmentomercado(WS_SegmentoMercado segmentomercado) {
		this.segmentomercado = segmentomercado;
	}
}
