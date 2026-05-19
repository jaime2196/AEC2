package es.senoret.comercio.pago.pagoImpl;

import es.senoret.comercio.pago.SistemaPago;

public class PagoTarjeta extends SistemaPago{
	
	

	private String empresa;

	@Override
	public boolean procesarPago(double cantidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelarPago(int ID) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public PagoTarjeta(int iD, String cuentaOrigen, String cuentaDestino) {
		super(iD, cuentaOrigen, cuentaDestino);
		// TODO Auto-generated constructor stub
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	

}
