package es.senoret.visitante;

import java.util.List;

public class TarjetaAcceso {
	private int ID;
	private List<String> preferenciasUsuario;

	public TarjetaAcceso(int iD, List<String> preferenciasUsuario) {
		super();
		ID = iD;
		this.preferenciasUsuario = preferenciasUsuario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<String> getPreferenciasUsuario() {
		return preferenciasUsuario;
	}

	public void setPreferenciasUsuario(List<String> preferenciasUsuario) {
		this.preferenciasUsuario = preferenciasUsuario;
	}

}
