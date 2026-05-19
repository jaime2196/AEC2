package es.senoret.comercio.comercioImpl;

import java.util.List;

import es.senoret.comercio.Comercio;
import es.senoret.comercio.pedido.Producto;

public class Tienda extends Comercio {
	
	public String tematica;

	public Tienda(int iD, String nombre, List<Producto> productos) {
		super(iD, nombre, productos);
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	

}
