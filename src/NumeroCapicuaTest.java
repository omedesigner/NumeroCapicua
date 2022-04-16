import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class NumeroCapicuaTest {
//dar la vuelta
	@Test
	void test8() {
		int numero=8;
		int esperado= 8;
		int resultado= NumeroCapicua.darLaVuelta(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test1331() {
		int numero=1331;
		int esperado= 1331;
		int resultado= NumeroCapicua.darLaVuelta(numero);
		assertEquals(esperado,resultado);
	}
	@Test
	void test2418() {
		int numero=2418;
		int esperado= 8142;
		int resultado= NumeroCapicua.darLaVuelta(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test151() {
		int numero=151;
		int esperado= 151;
		int resultado= NumeroCapicua.darLaVuelta(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test55555() {
		int numero=55555;
		int esperado= 55555;
		int resultado= NumeroCapicua.darLaVuelta(numero);
		assertEquals(esperado,resultado);	
	}
// es capicua
	@Test
	void testCapicua8() {
		int numero=8;
		boolean esperado= true;
		boolean resultado= NumeroCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	@Test
	void testCapicua151() {
		int numero=151;
		boolean esperado= true;
		boolean resultado= NumeroCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	@Test
	void testCapicua1331() {
		int numero=1331;
		boolean esperado= true;
		boolean resultado= NumeroCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}		
	@Test
	void testCapicua2418() {
		int numero=2418;
		boolean esperado= false;
		boolean resultado= NumeroCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
	@Test
	void testCapicua55555() {
		int numero=55555;
		boolean esperado= true;
		boolean resultado= NumeroCapicua.esCapicua(numero);
		assertEquals(esperado,resultado);
	}
// crea capicua
		@Test
		void testCreaCapicua2418() {
			int numero=2418;
			String esperado="24188142";
			String resultado= NumeroCapicua.crearCapicua(numero);
			assertEquals(esperado,resultado);
		}
		
		@Test
		void testCreaCapicua37() {
			int numero=37;
			String esperado= "3773";
			String resultado= NumeroCapicua.crearCapicua(numero);
			assertEquals(esperado,resultado);
		}
}
