package cliente;

public class Persona {
	private int telefono;
	private String apellido;
	private int edad;
	
	public Persona() {
		this.telefono=0;
		this.apellido="";
		this.edad=0;
	}
	public Persona(int telefono, String apellido, int edad) {
		this.telefono = telefono;
		this.apellido = apellido;
		this.edad = edad;
	}

	

	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
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



}
