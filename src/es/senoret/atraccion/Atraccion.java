package es.senoret.atraccion;

import java.time.Duration;

import es.senoret.visitante.Visitante;

/**
 * Clase Atraccion con sus atributos minimos, esta clase se puede instanciar por si misma o 
 * crear una clase que herede de esta para ampliar su funcionalidad si fuera necesario
 */
public class Atraccion {
	
	private int ID;
	private String nombre;
	private String descripcion;
	private TipoAtraccion tipoAtraccion;
	private int capacidadPorTurno;
	private int capacidadActual=0;
	private Duration duracion;
	private RequisitosAtraccion requisitosAtraccion;
	
	public enum TipoAtraccion {
		MONTANA_RUSA, ATRACCION_ACUATICA, CASA_DEL_TERROR;
	}

	public Atraccion(int iD, String nombre, String descripcion, TipoAtraccion tipoAtraccion, int capacidadPorTurno,
			Duration duracion, RequisitosAtraccion requisitosAtraccion) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoAtraccion = tipoAtraccion;
		this.capacidadPorTurno = capacidadPorTurno;
		this.duracion = duracion;
		this.requisitosAtraccion = requisitosAtraccion;
	}
	
	/**
	 * Permite a un usuario utilizar una atracion, comprobando que haya huecos libres en la atraccion y que el visitante se apto para utilizarla
	 * @param visitante que usa la atraccion
	 * @return true, si el visitante ha usado la atraccion correctamente, false en caso contrario
	 */
	public boolean usarAtraccion(Visitante visitante) {
		if(!comprobarAtraccionLibre()) {
			return false;
		}
		if(!comprobarRequisitos(visitante)) {
			return false;
		}
		capacidadActual++;
		return true;
	}
	
	/**
	 * Devulve true si el visitante es apto para usar la atraccion, false en cualquier otro caso
	 * @param visitante visitante del que se comprueban los requisitos
	 * @return
	 */
	private boolean comprobarRequisitos(Visitante visitante) {
		// Comprobar los parametros del visitante con los requisitos de la a atraccion
		return true;
	}
	
	/**
	 * Comprueba que haya huecos libres para el usuario en la atraccion
	 * @return
	 */
	private boolean comprobarAtraccionLibre() {
		if(capacidadActual>=capacidadPorTurno) {
			return false;
		}
		return true;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}

	public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
		this.tipoAtraccion = tipoAtraccion;
	}

	public int getCapacidadPorTurno() {
		return capacidadPorTurno;
	}

	public void setCapacidadPorTurno(int capacidadPorTurno) {
		this.capacidadPorTurno = capacidadPorTurno;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public RequisitosAtraccion getRequisitosAtraccion() {
		return requisitosAtraccion;
	}

	public void setRequisitosAtraccion(RequisitosAtraccion requisitosAtraccion) {
		this.requisitosAtraccion = requisitosAtraccion;
	}
	
	

}
