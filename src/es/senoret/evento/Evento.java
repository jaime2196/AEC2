package es.senoret.evento;

import java.util.List;

/**
 * Clase para gestionar los eventos del parque
 */
public class Evento {
	private int ID;
	private String nombre;
	private String fecha;
	private List<EmpleadoEvento> empleados;
	private int IdLugar;

	public Evento(int iD, String nombre, String fecha, List<EmpleadoEvento> empleados, int idLugar) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.fecha = fecha;
		this.empleados = empleados;
		IdLugar = idLugar;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<EmpleadoEvento> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoEvento> empleados) {
		this.empleados = empleados;
	}

	public int getIdLugar() {
		return IdLugar;
	}

	public void setIdLugar(int idLugar) {
		IdLugar = idLugar;
	}

	public boolean isLugarDisponible() {
		// TODO comprobar las disponibilidad del lugar usando Id lugar
		return true;
	}
}
