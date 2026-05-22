package es.senoret.mantenimiento;

/**
 * Clase para registrar las incidencias que se produzcan en el parque
 */
public class Incidencia {
	private int ID;
	private String titulo;
	private String descripcion;
	private String fecha;

	public Incidencia(int iD, String titulo, String descripcion, String fecha) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
