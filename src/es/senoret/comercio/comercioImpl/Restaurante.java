package es.senoret.comercio.comercioImpl;

import java.util.List;

import es.senoret.comercio.Comercio;
import es.senoret.comercio.pedido.Producto;
import es.senoret.common.Persona;
import es.senoret.common.interfaces.Reservable;

/**
 * Implementacion basica de un restaurante, extendiendo la funcionalidad basica de la clase comercio
 */
public class Restaurante extends Comercio implements Reservable {

	private TipoRestaurante tipoRestaurante;

	public Restaurante(int iD, String nombre, List<Producto> productos, TipoRestaurante tipoRestaurante) {
		super(iD, nombre, productos);
		this.tipoRestaurante = tipoRestaurante;
	}

	public enum TipoRestaurante {
		ESPANOL, CHINO, MEXICANO;
	}

	public TipoRestaurante getTipoRestaurante() {
		return tipoRestaurante;
	}

	public void setTipoRestaurante(TipoRestaurante tipoRestaurante) {
		this.tipoRestaurante = tipoRestaurante;
	}

	@Override
	public void hacerReserva(Persona visitante, String fechaHora) {
		// TODO Auto-generated method stub

	}


}
