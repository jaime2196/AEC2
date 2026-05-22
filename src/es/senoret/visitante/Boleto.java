package es.senoret.visitante;

/**
 * Clase para gestionar la venta de boletos del parque
 */
public class Boleto {

	private int ID;
	private int precio;
	private CategoriaBoleto categoriaBoleto;
	private boolean isValido;
	private boolean visitaCompletada;

	public enum CategoriaBoleto {
		ADULTO, NINO, DISCAPACITADO;
	}

	public Boleto(int iD, int precio, CategoriaBoleto categoriaBoleto) {
		super();
		ID = iD;
		this.precio = precio;
		this.categoriaBoleto = categoriaBoleto;
		this.isValido = true;
		this.visitaCompletada = false;
	}
	
	public void cierreDeVisita() {
		this.setVisitaCompletada(true);
		this.soliciarRetroalimentacion();
	}
	
	/**
	 * Este metodo solicita la retroalimentacion al usuario.
	 */
	public void soliciarRetroalimentacion() {
		// TODO: implementar logica, mostrar formulario para preguntar al usuario sobre su experiencia
	}

	/**
	 * Devuelve true si el boleto es valido, false en cuaquier otro caso
	 * @return
	 */
	public boolean validarBoleto() {
		// TODO: implementar logica, el boleto es valido y no ha sido usado todavia
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

	public boolean isVisitaCompletada() {
		return visitaCompletada;
	}

	public void setVisitaCompletada(boolean visitaCompletada) {
		this.visitaCompletada = visitaCompletada;
	}

}
