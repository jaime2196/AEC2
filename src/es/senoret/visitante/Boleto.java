package es.senoret.visitante;

public class Boleto {

	private int ID;
	private int precio;
	private CategoriaBoleto categoriaBoleto;
	private boolean isValido;

	public enum CategoriaBoleto {
		ADULTO, NINO, DISCAPACITADO;
	}

	public Boleto(int iD, int precio, CategoriaBoleto categoriaBoleto) {
		super();
		ID = iD;
		this.precio = precio;
		this.categoriaBoleto = categoriaBoleto;
		this.isValido = true;
	}

	public boolean validarBoleto() {
		//TODO: implementar logica
		return false;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public CategoriaBoleto getCategoriaBoleto() {
		return categoriaBoleto;
	}

	public void setCategoriaBoleto(CategoriaBoleto categoriaBoleto) {
		this.categoriaBoleto = categoriaBoleto;
	}

	public boolean isValido() {
		return isValido;
	}

	public void setValido(boolean isValido) {
		this.isValido = isValido;
	}
	
	

}
