package ejercicios;
import java.util.Date;
import ejercicios.EnumTipoDocumento;

public class Persona {

	private EnumTipoDocumento TipoDocumento;
	private int NroDocumento;
	private String Nombre;
	private String Apellido;
	private Date FechaNacimiento;
	
	public Persona() {
	}
	
	public Persona(EnumTipoDocumento tipoDocumento, int nroDocumento, String nombre, String apellido,
			Date fechaNacimiento) {
		
		TipoDocumento = tipoDocumento;
		NroDocumento = nroDocumento;
		Nombre = nombre;
		Apellido = apellido;
		FechaNacimiento = fechaNacimiento;
	}

	public EnumTipoDocumento getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(EnumTipoDocumento tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public int getNroDocumento() {
		return NroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		NroDocumento = nroDocumento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

}
