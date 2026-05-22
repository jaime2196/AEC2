package es.senoret.comercio.pago;

/**
 * Clase abstracta basica con los datos fundamentales de un sistema de pago
 */
public abstract class SistemaPago {
	private int ID;
	private String cuentaOrigen;
	private String cuentaDestino;

	public abstract boolean procesarPago(double cantidad);

	public abstract boolean cancelarPago(int ID);

	public SistemaPago(int iD, String cuentaOrigen, String cuentaDestino) {
		super();
		ID = iD;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

}
