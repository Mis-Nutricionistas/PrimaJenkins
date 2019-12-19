import static org.junit.Assert.*;
import org.junit.Test;
import calcularPrima.Conductor;


public class ConductorTest {

	@Test
	public void testNodos() {
		/* Cobertura de NODOS Y DECISIONES */
		Conductor cond = new Conductor(18, 25);
		assertEquals(18, cond.getEdad());
		assertEquals(25, cond.getPuntosLic());
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(24);
		cond.setPuntosLic(29);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1350.0, cond.calcularPrima(), 0);
		
		cond.setEdad(26);
		cond.setPuntosLic(27);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(850.0, cond.calcularPrima(), 0);
		
		cond.setEdad(33);
		cond.setPuntosLic(26);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(900.0, cond.calcularPrima(), 0);
		
		cond.setEdad(37);
		cond.setPuntosLic(28);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(40);
		cond.setPuntosLic(21);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(500.0, cond.calcularPrima(), 0);
		
		cond.setEdad(50);
		cond.setPuntosLic(30);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(250.0, cond.calcularPrima(), 0);
		
		cond.setEdad(64);
		cond.setPuntosLic(22);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(65);
		cond.setPuntosLic(29);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(550.0, cond.calcularPrima(), 0);
		
		cond.setEdad(90);
		cond.setPuntosLic(24);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(750.0, cond.calcularPrima(), 0);
		
		cond.setEdad(19);
		cond.setPuntosLic(0);
		assertTrue(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());
		
		/* Cobertura de RECORRIDOS */
		cond.setEdad(18);
		cond.setPuntosLic(29);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1350.0, cond.calcularPrima(), 0);
		
		cond.setEdad(18);
		cond.setPuntosLic(28);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(25);
		cond.setPuntosLic(27);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(850.0, cond.calcularPrima(), 0);
		
		cond.setEdad(25);
		cond.setPuntosLic(26);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(900.0, cond.calcularPrima(), 0);
		
		cond.setEdad(35);
		cond.setPuntosLic(25);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(35);
		cond.setPuntosLic(24);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(500.0, cond.calcularPrima(), 0);
		
		cond.setEdad(45);
		cond.setPuntosLic(23);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(250.0, cond.calcularPrima(), 0);
		
		cond.setEdad(45);
		cond.setPuntosLic(22);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(65);
		cond.setPuntosLic(25);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(550.0, cond.calcularPrima(), 0);
		
		cond.setEdad(65);
		cond.setPuntosLic(24);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(750.0, cond.calcularPrima(), 0);
		
		cond.setEdad(17);
		cond.setPuntosLic(0);
		assertFalse(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());
		
		cond.setEdad(18);
		cond.setPuntosLic(0);
		assertTrue(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());

		
		cond.setEdad(18);
		cond.setPuntosLic(31);
		assertTrue(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());

		
		cond.setEdad(91);
		cond.setPuntosLic(29);
		assertFalse(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
	}
	
	@Test
	public void testRecorridos() {
		/* Cobertura de RECORRIDOS */
		Conductor cond = new Conductor(18, 29);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1350.0, cond.calcularPrima(), 0);
		
		cond.setEdad(18);
		cond.setPuntosLic(28);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(1400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(25);
		cond.setPuntosLic(27);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(850.0, cond.calcularPrima(), 0);
		
		cond.setEdad(25);
		cond.setPuntosLic(26);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(900.0, cond.calcularPrima(), 0);
		
		cond.setEdad(35);
		cond.setPuntosLic(25);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(35);
		cond.setPuntosLic(24);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(500.0, cond.calcularPrima(), 0);
		
		cond.setEdad(45);
		cond.setPuntosLic(23);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(250.0, cond.calcularPrima(), 0);
		
		cond.setEdad(45);
		cond.setPuntosLic(22);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(400.0, cond.calcularPrima(), 0);
		
		cond.setEdad(65);
		cond.setPuntosLic(25);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(550.0, cond.calcularPrima(), 0);
		
		cond.setEdad(65);
		cond.setPuntosLic(24);
		assertTrue(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
		assertEquals(750.0, cond.calcularPrima(), 0);
		
		cond.setEdad(17);
		cond.setPuntosLic(0);
		assertFalse(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());
		
		cond.setEdad(18);
		cond.setPuntosLic(0);
		assertTrue(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());

		
		cond.setEdad(18);
		cond.setPuntosLic(31);
		assertTrue(cond.puedeAsegurarse());
		assertFalse(cond.puedeConducir());

		
		cond.setEdad(91);
		cond.setPuntosLic(29);
		assertFalse(cond.puedeAsegurarse());
		assertTrue(cond.puedeConducir());
	}
}
