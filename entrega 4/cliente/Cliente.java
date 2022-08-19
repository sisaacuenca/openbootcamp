package cliente;

public class Cliente extends Persona {
	private int credito;

	public Cliente() {
		super(0, "", 0);
		this.credito = 0;
	}
	

	public int getCredito() {
		return credito;
	}


	public void setCredito(int credito) {
		this.credito = credito;
	}


	public Cliente(int telefono, String nombre, int edad, int credito) {
		super(telefono, nombre, edad);
		this.credito = credito;
	}
	
	public static void main(String[] args) {
		Cliente ernesto = new Cliente(1234567890,"ernesto",54, 1234);
		System.out.println(ernesto.getApellido());
		System.out.println(ernesto.getEdad());
		System.out.println(ernesto.getTelefono());
		System.out.println(ernesto.getCredito());
	}
}