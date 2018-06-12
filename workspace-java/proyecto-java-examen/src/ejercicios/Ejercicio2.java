package ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

import ejercicios.Persona;
import ejercicios.EnumTipoDocumento;
/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setTipoDocumento(EnumTipoDocumento.dni);
		persona.setNroDocumento(39249660);
		persona.setFechaNacimiento(new GregorianCalendar(1996, Calendar.FEBRUARY, 16).getTime());
		
		System.out.println(persona.getTipoDocumento());
		System.out.println(persona.getNroDocumento());
		System.out.println(persona.getFechaNacimiento());
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		
	}

}
