package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void queLaColaEsteVacia() {
			Supermercado supermercado = new Supermercado();
			Integer valorEsperado = 0;
			Integer valorObtenido = supermercado.cantidadEnColaComun();
			
			assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queAlLlegarGenteLaColaNoEsteVacia() {
		Supermercado supermercado = new Supermercado();
		Cliente cliente1 = new Cliente(1,5);
		Cliente cliente2 = new Cliente(2,2);
		Cliente cliente3 = new Cliente(3,15);
		Cliente cliente4 = new Cliente(4,8);
		Cliente cliente5 = new Cliente(5,23);
		
		assertTrue(supermercado.agregarALaCola(cliente1));
		assertTrue(supermercado.agregarALaCola(cliente2));
		assertTrue(supermercado.agregarALaCola(cliente3));
		assertTrue(supermercado.agregarALaCola(cliente4));
		assertTrue(supermercado.agregarALaCola(cliente5));
		
		Integer valorEsperado = 5;
		Integer valorObtenido = supermercado.cantidadEnColaComun();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queLaColaRapidaEsteVacia() {
		Supermercado supermercado = new Supermercado();
		Integer valorEsperado = 0;
		Integer valorObtenido = supermercado.cantidadEnColaRapida();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePasenClientesALaColaRapida() {
		Supermercado supermercado = new Supermercado();
		Cliente cliente1 = new Cliente(1,5);
		Cliente cliente2 = new Cliente(2,2);
		Cliente cliente3 = new Cliente(3,15);
		Cliente cliente4 = new Cliente(4,3);
		Cliente cliente5 = new Cliente(5,23);
		
		assertTrue(supermercado.agregarALaCola(cliente1));
		assertTrue(supermercado.agregarALaCola(cliente2));
		assertTrue(supermercado.agregarALaCola(cliente3));
		assertTrue(supermercado.agregarALaCola(cliente4));
		assertTrue(supermercado.agregarALaCola(cliente5));
		
		Integer valorEsperado = 2;
		
		supermercado.abrirColaRapida();
		Integer valorObtenido = supermercado.cantidadEnColaRapida();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePasenClientesALaColaRapidaYQueNoQuedenEnLaColaLenta() {
		Supermercado supermercado = new Supermercado();
		Cliente cliente1 = new Cliente(1,14);
		Cliente cliente2 = new Cliente(2,3);
		Cliente cliente3 = new Cliente(3,3);
		Cliente cliente4 = new Cliente(4,15);
		
		assertTrue(supermercado.agregarALaCola(cliente1));
		assertTrue(supermercado.agregarALaCola(cliente2));
		assertTrue(supermercado.agregarALaCola(cliente3));
		assertTrue(supermercado.agregarALaCola(cliente4));
		
		Integer valorEsperado = 2;
		
		supermercado.abrirColaRapida();
		
		Integer clientesEnColaRapida = supermercado.cantidadEnColaRapida();
		Integer clientesEnColaComun = supermercado.cantidadEnColaComun();
		
		assertEquals(valorEsperado,clientesEnColaRapida);
		assertEquals(valorEsperado,clientesEnColaComun);

	}

}
