import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoJUnitTest {
	Empleado empleado = new Empleado("Juan","Lopez",250.0, false);
	@Test
	void testGetNombre() {
		
		String total = empleado.getNombre();
		assertEquals("Juan", total);
	}

	@Test
	void testSetNombre() {
        empleado.setNombre("Juan");
        assertTrue(empleado.getNombre() == "Juan");
	}

	@Test
	void testGetApellido() {
		String total = empleado.getApellido();
		assertEquals("Lopez", total);
	}

	@Test
	void testSetApellido() {
        empleado.setApellido("Lopez");
        assertTrue(empleado.getApellido() == "Lopez");
	}

	@Test
	void testGetSalarioMensual() {
		double total = empleado.getSalarioMensual();
		assertEquals(250.0, total);
	}

	@Test
	void testSetSalarioMensual() {
        empleado.setSalarioMensual(250);
        assertTrue(empleado.getSalarioMensual() == 250);
	}

}
