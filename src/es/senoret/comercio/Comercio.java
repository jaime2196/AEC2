package es.senoret.comercio;

import java.util.List;

import es.senoret.comercio.pedido.Producto;
import es.senoret.visitante.Visitante;

/**
 * Clase abstracta de comercio, implementa su funcionalidad basica
 */
public abstract class Comercio {

	private int ID;
	private String nombre;

	private List<Producto> productos;

	public Comercio(int iD, String nombre, List<Producto> productos) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.productos = productos;
	}
	
	/**
	 * Administra un producto a un visitante
	 * @param visitante que usa el producto
	 * @param producto a usar
	 */
	public void usarProducto(Visitante visitante, Producto producto) {
		// Buscar el producto en la lista de productos del comercio y producto.cantidad--
		
	}
	
	/**
	 * Obtiene las recomendaciones en funcion del visitante
	 * @param visitante que obtiene las recomentaciones
	 * @return
	 */
	public String obtenerRecomendaciones(Visitante visitante) {
		//Genera las recomendaciones en funcion de los parametros del visitantes
		return "recomendaciones generadas";
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
