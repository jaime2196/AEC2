package es.senoret;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import es.senoret.visitante.Boleto;
import es.senoret.visitante.Visitante;
import es.senoret.visitante.Boleto.CategoriaBoleto;
import es.senoret.visitante.TarjetaAcceso;
import es.senoret.atraccion.*;
import es.senoret.atraccion.Atraccion.TipoAtraccion;
import es.senoret.atraccion.atraccionImpl.MontanaRusa;
import es.senoret.comercio.*;
import es.senoret.comercio.comercioImpl.Restaurante;
import es.senoret.comercio.comercioImpl.Restaurante.TipoRestaurante;
import es.senoret.comercio.comercioImpl.Tienda;
import es.senoret.comercio.pedido.Producto;

public class Test {

	public static void main(String[] args) {
		// 1) Adquisición de Boletos:
		Visitante visitante = new Visitante(30, 170, null, null);
		Boleto boleto = new Boleto(1234, 20, CategoriaBoleto.ADULTO);
		List<String> preferenciasUsuario = new ArrayList<>();
		preferenciasUsuario.add("Restaurantes favoritos: Goiko");
		preferenciasUsuario.add("Atracciones favoritas: montaña rusa");
		TarjetaAcceso targetAcceso = new TarjetaAcceso(4321, preferenciasUsuario);
		
		visitante.setBoleto(boleto);
		visitante.setTarjetaAcceso(targetAcceso);
		
		// 2) Planificación de la Visita
		MontanaRusa montanaRusa = new MontanaRusa(2134, "Super Monataña Rusa", "Muy emocionante", TipoAtraccion.MONTANA_RUSA, 20, Duration.ofHours(1), new RequisitosAtraccion(15, 170));
		List<Producto> productosGoiko = new ArrayList<>();
		Producto hamburguesaNormal = new Producto(3412, "Hamburguesa normal", 100, 15);
		productosGoiko.add(hamburguesaNormal);
		Producto hamburguesaSinGluten = new Producto(3412, "Hamburguesa sin gluten", 100, 20);
		productosGoiko.add(hamburguesaSinGluten);
		Restaurante goiko = new Restaurante(1243, "Goiko", productosGoiko, TipoRestaurante.ESPANOL);
		
		montanaRusa.hacerReserva(visitante, "21/05/2026 a las 11:00");
		goiko.hacerReserva(visitante, "21/05/2026 a las 14:00");
		goiko.obtenerRecomendaciones(visitante);
		
		// 3) Acceso y Registro en Atracciones
		//Logica de requisitos y usuarios de la atracion, dentro del metodo usarAtraccion
		montanaRusa.usarAtraccion(visitante);
		
		// 4) Servicios Complementarios
		goiko.usarProducto(visitante, hamburguesaSinGluten);
		
		List<Producto> productosTiendaSouvenirs = new ArrayList<>();
		Producto peluche = new Producto(4123, "Peluche", 500, 5);
		productosTiendaSouvenirs.add(peluche);
		Comercio tiendaSouvenirs = new Tienda(0, "Tienda de souvenirs", productosTiendaSouvenirs);
		tiendaSouvenirs.usarProducto(visitante, peluche);
		
		// 5) Retroalimentación y Cierre de Visita

	}

}
