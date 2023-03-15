public class Empleado {

	public String nombre;
	public String apellido;
	public double salarioMensual;
	public boolean activo;
	
	public Empleado(String nombre, String apellido, double salarioMensual, boolean activo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
		this.activo = activo;
	}	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
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
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
}
