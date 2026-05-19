package es.senoret.atraccion;

public class RequisitosAtraccion {

	//TODO: completar con los requisitos especificos...
	private int edadMinima;
	private int alturaMinima;
	
	public RequisitosAtraccion(int edadMinima, int alturaMinima) {
		super();
		this.edadMinima = edadMinima;
		this.alturaMinima = alturaMinima;
	}

	public int getEdadMinima() {
		return edadMinima;
	}



	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}



	public int getAlturaMinima() {
		return alturaMinima;
	}



	public void setAlturaMinima(int alturaMinima) {
		this.alturaMinima = alturaMinima;
	}



	public boolean isRequisitosMinimos() {
		
		return true;
	}
}
