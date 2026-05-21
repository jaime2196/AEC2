package es.senoret.atraccion.atraccionImpl;

import java.time.Duration;

import es.senoret.atraccion.Atraccion;
import es.senoret.atraccion.RequisitosAtraccion;
import es.senoret.atraccion.interfaces.MantenimientoEspecial;
import es.senoret.atraccion.interfaces.SeguridadEspecial;
import es.senoret.common.interfaces.Reservable;
import es.senoret.visitante.Visitante;

public class MontanaRusa extends Atraccion implements MantenimientoEspecial, SeguridadEspecial, Reservable{

	public MontanaRusa(int iD, String nombre, String descripcion, TipoAtraccion tipoAtraccion, int capacidadPorTurno,
			Duration duracion, RequisitosAtraccion requisitosAtraccion) {
		super(iD, nombre, descripcion, tipoAtraccion, capacidadPorTurno, duracion, requisitosAtraccion);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void realizarChequeoSeguridadAdicional() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarMantenimientoEspecial() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hacerReserva(Visitante visitante, String fechaHora) {
		// TODO implementar la logica para almacenar la reserva
		
	}




}
