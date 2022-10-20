package Productos;

public class frutasYverduras extends Productos{

	public frutasYverduras(String nombreProducto,String cantidad,double litros,int precio )
	{
		super(nombreProducto,cantidad,litros,precio);
	}
	
	public String toString() {
		return "Nombre: "+NombreProducto+" /// "+"Precio: $"+precio+" ///"+"cantidad: "+cantidad;

	}

}
