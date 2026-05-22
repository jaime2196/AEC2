package es.senoret.common;

/**
 * Datos basico de una persona, de momento usada por la clase Visitante y EmpleadoEvento 
 */
public class Persona {
	private int ID;
	private String nombre;
	private String apellido;
	private String sexo;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
