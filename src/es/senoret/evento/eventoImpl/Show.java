package es.senoret.evento.eventoImpl;

import java.util.List;

import es.senoret.evento.EmpleadoEvento;
import es.senoret.evento.Evento;

public class Show extends Evento{

	public Show(int iD, String nombre, String fecha, List<EmpleadoEvento> empleados, int idLugar) {
		super(iD, nombre, fecha, empleados, idLugar);
		// TODO Auto-generated constructor stub
	}

}
