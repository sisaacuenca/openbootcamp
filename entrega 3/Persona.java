package personas;

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

	public static void main(String[] args) {
		
		
		Persona cacho = new Persona();
		System.out.println(cacho.getApellido());
		System.out.println(cacho.getEdad());
		System.out.println(cacho.getTelefono());
		System.out.println("datos antes de Settearlos");
		cacho.setEdad(23);
		cacho.setTelefono(1234567890);
		cacho.setApellido("Cacho");
		System.out.println("datos despues de Settearlos");
		System.out.println(cacho.getApellido());
		System.out.println(cacho.getEdad());
		System.out.println(cacho.getTelefono());
	}

}
