import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTestJUnitTest {

	public static Empleado empleado1 = new Empleado("Juan","Perez", 250.000, false);
	
	@Test
	void testMain() {
		EmpleadoTest empleadoTest = new EmpleadoTest();
		empleadoTest.main(null);
		
		assertEquals("Salario Empleado 1: 250.0\r\n"
				+ "Salario Empleado 2: 2250.0\r\n"
				+ "Salario aumentado Empleado 1: 275.0\r\n"
				+ "Salario aumentado Empleado 2: 2475.0\r\n"
				+ "Salario anual Empleado 1: 3300.0\r\n"
				+ "Salario anual Empleado 2: 29700.0", "Salario Empleado 1: 250.0\r\n"
						+ "Salario Empleado 2: 2250.0\r\n"
						+ "Salario aumentado Empleado 1: 275.0\r\n"
						+ "Salario aumentado Empleado 2: 2475.0\r\n"
						+ "Salario anual Empleado 1: 3300.0\r\n"
						+ "Salario anual Empleado 2: 29700.0");
	}

}
