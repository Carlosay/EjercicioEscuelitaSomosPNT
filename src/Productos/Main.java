package Productos;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static ArrayList<Productos> items = new ArrayList<Productos>();
	
	
	public static void main(String[] args) {
		
		bebidas Compra1 =  new bebidas("Coca-Cola Zero","1.5" ,1.5,20);
		Mercado Compra2 =  new Mercado("Coca-Cola","Litros: 1.5" ,1.5,18);
		Mercado Compra3 =  new Mercado("Shampoo Sedal","500ml",0.5,19);
		frutasYverduras Compra4 = new frutasYverduras("Frutillas","kilo",0,64);
		
		
		items.add(Compra1);
		items.add(Compra2);
		items.add(Compra3);
		items.add(Compra4);
		
		
		
		for (Productos item : items) {
			System.out.println(item.toString());
		}
		
		
		System.out.println("================================");
		
		
		Collections.sort(items);
			
		System.out.println("Producto mas caro: "+items.get(items.size()-1).getNombreProducto());
		System.out.println("Producto mas Bareto: "+items.get(0).getNombreProducto());		
				
	}
}	
			