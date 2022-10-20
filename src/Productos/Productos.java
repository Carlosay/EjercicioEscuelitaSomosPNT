package Productos;

public class Productos implements Comparable <Productos>{
	
	protected String NombreProducto;
	protected double litros;
	protected String cantidad;
	protected int precio;
	
	public Productos() {
		
	}
	
	public Productos (String NombreProducto,String cantidad,double litros,int precio) {
		this.NombreProducto=NombreProducto;
		this.litros=litros;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public String getcantidad() {
		return cantidad;
	}
	public void setcantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int compareTo(Productos producto) {          
	    return (this.getPrecio() - producto.getPrecio());
	}

}
