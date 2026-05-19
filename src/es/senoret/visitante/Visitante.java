package es.senoret.visitante;

import es.senoret.common.Persona;

public class Visitante extends Persona{

	private int edad;
	private int altura;
	private Boleto boleto;
	private TarjetaAcceso tarjetaAcceso;

	public Visitante(int edad, int altura, Boleto boleto,
			TarjetaAcceso tarjetaAcceso) {
		super();
		this.edad = edad;
		this.altura = altura;
		this.boleto = boleto;
		this.tarjetaAcceso = tarjetaAcceso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	public TarjetaAcceso getTarjetaAcceso() {
		return tarjetaAcceso;
	}

	public void setTarjetaAcceso(TarjetaAcceso tarjetaAcceso) {
		this.tarjetaAcceso = tarjetaAcceso;
	}

}
