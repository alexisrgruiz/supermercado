package supermercado;

public class Cliente {

	private Integer posicion;
	private Integer cantProductos;

	public Cliente(Integer posicion, Integer cantProductos) {
		this.posicion = posicion;
		this.cantProductos = cantProductos;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getCantProductos() {
		return cantProductos;
	}

	public void setCantProductos(Integer cantProductos) {
		this.cantProductos = cantProductos;
	}
	
	

}
