package es.senoret.comercio.pedido;

import java.util.List;

import es.senoret.visitante.Visitante;

public class Pedido {

	public int ID;
	public Visitante cliente;
	public List<Producto> productos;
	public Pedido(int iD, Visitante cliente, List<Producto> productos) {
		super();
		ID = iD;
		this.cliente = cliente;
		this.productos = productos;
	}
	
	public void anadirProductoAlPedido(Producto producto) {
		//TODO: obtener la lista de productos y comprobar que no exista para añadirlo. Si existe se suman las cantidades
	}
	
	public double calcularTotal() {
		//TODO: obtener todos los productos del pedido y calcular su total...
		return -1;
	}
	
	public void eliminarProductoDelPedido(Producto producto, int cantidad) {
		//TODO: obtener la lista de productos y comprobar que dicho producto exista para substraer la cantidad del segundo argumento
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Visitante getCliente() {
		return cliente;
	}
	public void setCliente(Visitante cliente) {
		this.cliente = cliente;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
