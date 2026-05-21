package es.senoret.comercio.comercioImpl;

import java.util.List;

import es.senoret.comercio.Comercio;
import es.senoret.comercio.pedido.Producto;
import es.senoret.common.interfaces.Reservable;
import es.senoret.visitante.Visitante;

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
	public void hacerReserva(Visitante visitante, String fechaHora) {
		// TODO Auto-generated method stub

	}


}
