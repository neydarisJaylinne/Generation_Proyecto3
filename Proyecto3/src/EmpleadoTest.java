import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpleadoTest {
	public List<Empleado> empleados = new ArrayList<>();
	double salario;

	public void agregar() {
		empleados.add(new Empleado("Luis", "Perez", 250.000, true));
		empleados.add(new Empleado("Pedro", "Perez", 250.000, false));
		empleados.add(new Empleado("Luis", "Perez", 250.000, true));
	}

	public void inactivos() {
		int count = 0;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).isActivo() == true) {
				count++;
			}
		}
		System.out.println("Hay " + count + " empleados activos");
	}

	public void aumento() {
		for (int i = 0; i < empleados.size(); i++) {
			empleados.get(i).setSalarioMensual((empleados.get(i).getSalarioMensual()) * 1.1);
			}
	}

	/*
	 * public void salarioAnual() { for(int i= 0; i<empleados.size(); i++) { salario
	 * = (empleados.get(i).getSalarioMensual())* 1.1; System.out.println(salario); }
	 * empleado1.setSalarioMensual(empleado1.getSalarioMensual()*12);
	 * empleado2.setSalarioMensual(empleado2.getSalarioMensual()*12);
	 * System.out.println("Salario anual Empleado 1: " +
	 * empleado1.getSalarioMensual());
	 * System.out.println("Salario anual Empleado 2: " +
	 * empleado2.getSalarioMensual()); }
	 */
	
	public void salarioAnual() { 
		for(int i= 0; i<empleados.size(); i++) {
			empleados.get(i).setSalarioMensual((empleados.get(i).getSalarioMensual())*12);
			if(empleados.get(i).isActivo() == true) {
				System.out.println("El salario anual de " + empleados.get(i).getNombre() + " " + empleados.get(i).getApellido()+ " es: "+ empleados.get(i).getSalarioMensual());
			}
		}
	}
	
	public static void main(String args[]) {
		EmpleadoTest empleadoTest = new EmpleadoTest();
		empleadoTest.agregar();
		empleadoTest.aumento();
		empleadoTest.salarioAnual();
		empleadoTest.inactivos();

	}
}
