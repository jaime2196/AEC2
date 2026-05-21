package es.senoret.common.interfaces;

import es.senoret.visitante.Visitante;

public interface Reservable {
	
	public void hacerReserva(Visitante visitante, String fechaHora);
}
