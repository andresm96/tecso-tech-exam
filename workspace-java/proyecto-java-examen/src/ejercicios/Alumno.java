package ejercicios;

public class Alumno {

	private Persona Persona;
	private Integer Legajo;
	
	public Alumno() {
	}
	
	public Alumno(ejercicios.Persona persona, Integer legajo) {
		super();
		Persona = persona;
		Legajo = legajo;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}

	public Integer getLegajo() {
		return Legajo;
	}

	public void setLegajo(Integer legajo) {
		Legajo = legajo;
	}

	

}
