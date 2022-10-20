package Productos;

public class bebidas extends Productos{

	

	public bebidas(String nombreProducto,String cantidad,double litros,int precio )
	{
		super(nombreProducto,cantidad,litros,precio);
	}
		
	public String toString() {
		return "Nombre: "+NombreProducto+" /// Litros: "+litros+"///Precio: $"+precio;
	}
	
	
}
