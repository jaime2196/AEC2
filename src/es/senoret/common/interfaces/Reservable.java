package es.senoret.common.interfaces;

import es.senoret.common.Persona;
/**
 * Interfaz obliga a que una Atraccion o un Restaurante sea reservable
 */
public interface Reservable {
	
	public void hacerReserva(Persona visitante, String fechaHora);
}
