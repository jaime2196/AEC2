package es.senoret.comercio.pago.pagoImpl;

import es.senoret.comercio.pago.SistemaPago;
/**
 * Implementacion de sistema de pago mediante bizum
 */
public class PagoBizum extends SistemaPago {

	private String numTelefono;

	public PagoBizum(int iD, String cuentaOrigen, String cuentaDestino) {
		super(iD, cuentaOrigen, cuentaDestino);
		// TODO Auto-generated constructor stub
	}

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

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

}
