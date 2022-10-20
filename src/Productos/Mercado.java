package Productos;

public class Mercado extends Productos{
	
	
	public Mercado(String nombreProducto,String cantidad,double litros,int precio )
	{
		super(nombreProducto,cantidad,litros,precio);
	}
	
	
	public String toString() {
		return "Nombre: "+NombreProducto+" /// "+"Contenido: "+cantidad+" ///"+"Precio: $"+precio;
	}
}
