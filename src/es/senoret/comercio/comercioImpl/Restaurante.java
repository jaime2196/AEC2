package es.senoret.comercio.comercioImpl;

import java.util.List;

import es.senoret.comercio.Comercio;
import es.senoret.comercio.pedido.Producto;

public class Restaurante extends Comercio {

	private TipoRestaurante tipoRestaurante;

	public Restaurante(int iD, String nombre, List<Producto> productos) {
		super(iD, nombre, productos);
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

}
