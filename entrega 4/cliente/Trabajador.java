package cliente;

public class Trabajador extends Persona{
	//atributos
	private int salario;
	//constructores
	public Trabajador() {
		super();
		this.salario=0;
	}

	public Trabajador(int telefono, String apellido, int edad, int salario) {
		super(telefono, apellido, edad);
		this.salario=salario;
	}
	//getters y setters
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	//main
	public static void main(String[] args) {
		
		Trabajador raul = new Trabajador(1234567890,"raul",54, 1234);
		
		System.out.println(raul.getApellido());
		System.out.println(raul.getEdad());
		System.out.println(raul.getTelefono());
		System.out.println(raul.getSalario());
		
	}
	
	
}
