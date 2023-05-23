package supermercado;

import java.util.Iterator;
import java.util.LinkedList;

public class Supermercado {

	private LinkedList<Cliente> cola = new LinkedList<Cliente>();
	private LinkedList<Cliente> colaRapida = new LinkedList<Cliente>();
	
	public Integer cantidadEnColaComun() {
		return this.cola.size();
	}
	public Boolean agregarALaCola(Cliente cliente) {
			return this.cola.add(cliente);
	}
	public Integer cantidadEnColaRapida() {
		
		return this.colaRapida.size();
	}
	
//	public void abrirColaRapida() {
//		
//		Integer movidos = 0;
//		
//		for(Cliente cliente : this.cola) {
//			if(cliente.getCantProductos() < 5) {
//				cliente.setPosicion(movidos + 1);
//				this.colaRapida.add(cliente);
//				movidos++;
//			}else {
//				cliente.setPosicion(cliente.getPosicion() - movidos);
//			}
//		}
//		this.cola.removeAll(this.colaRapida);
//	}
	
	public void abrirColaRapida() {
		
		Integer movidos = 0;
		
		Iterator<Cliente> iterador = this.cola.iterator();
		
		while( iterador.hasNext() ) {
			  Cliente cliente = iterador.next();
			  if(cliente.getCantProductos() < 5) {
					cliente.setPosicion(movidos + 1);
					this.colaRapida.add(cliente);
					movidos++;
					iterador.remove();
				}else {
					cliente.setPosicion(cliente.getPosicion() - movidos);
				}
			}
	}

}
