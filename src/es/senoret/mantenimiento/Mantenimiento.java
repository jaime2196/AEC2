package es.senoret.mantenimiento;

import es.senoret.atraccion.Atraccion;
import es.senoret.common.Persona;

/**
 * Clase para gestionar le mantenimiento de las atracciones del parque
 */
public class Mantenimiento {

	private int ID;
	private TipoMantenimiento tipoMantenimiento;
	private String fechaMantenimiento;
	private String comentarios;
	private Atraccion atraccion;
	private Persona personaMantenimiento;

	public enum TipoMantenimiento {
		PREVENTIVO, CORRECTIVO, RUTINARIO;
	}

	public Mantenimiento(int iD, TipoMantenimiento tipoMantenimiento, String fechaMantenimiento, String comentarios,
			Atraccion atraccion, Persona personaMantenimiento) {
		super();
		ID = iD;
		this.tipoMantenimiento = tipoMantenimiento;
		this.fechaMantenimiento = fechaMantenimiento;
		this.comentarios = comentarios;
		this.atraccion = atraccion;
		this.personaMantenimiento = personaMantenimiento;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public TipoMantenimiento getTipoMantenimiento() {
		return tipoMantenimiento;
	}

	public void setTipoMantenimiento(TipoMantenimiento tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}

	public String getFechaMantenimiento() {
		return fechaMantenimiento;
	}

	public void setFechaMantenimiento(String fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Persona getPersonaMantenimiento() {
		return personaMantenimiento;
	}

	public void setPersonaMantenimiento(Persona personaMantenimiento) {
		this.personaMantenimiento = personaMantenimiento;
	}

	public Atraccion getAtraccion() {
		return atraccion;
	}

	public void setAtraccion(Atraccion atraccion) {
		this.atraccion = atraccion;
	}

}
