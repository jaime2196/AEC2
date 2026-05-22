package es.senoret.evento;

import es.senoret.common.Persona;

/**
 * Clase para administra las personas implicadas en un evento
 */
public class EmpleadoEvento extends Persona {

	private boolean disponibilidad;

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
