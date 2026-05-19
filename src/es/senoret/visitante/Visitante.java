package es.senoret.visitante;

public class Visitante {

	private int ID;
	private String nombre;
	private String apellido;
	private int edad;
	private int altura;
	private Boleto boleto;
	private TarjetaAcceso tarjetaAcceso;

	public Visitante(int iD, String nombre, String apellido, int edad, int altura, Boleto boleto,
			TarjetaAcceso tarjetaAcceso) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.boleto = boleto;
		this.tarjetaAcceso = tarjetaAcceso;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
