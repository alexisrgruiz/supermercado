package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void queUnClienteSepaSuPosicion() {
		
		final Integer posicionEsperada = 5;
		//posicion y cant de productos
		Cliente cliente = new Cliente(posicionEsperada,5);
		
		Integer posicionObtenida = cliente.getPosicion();
		assertTrue(posicionObtenida.equals(posicionEsperada));
	}

}
