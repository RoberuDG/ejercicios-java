package tienda;

import java.util.ArrayList;
import java.util.List;

import productos.Blueray;
import productos.CD;
import productos.DVD;
import productos.Producto;
import productos.TipoVideo;

public class Tienda {
	// Variables
	private List<Producto> productos = new ArrayList<Producto>();
	
	public static void main(String[] args) {
		Tienda tienda = new Tienda();
		CD cd1 = new CD("Chivi", 20, "metal jartu", 20);
		DVD dvd1 = new DVD("Leo", TipoVideo.ANIME, 126, 20, "porno");
		Blueray blueray1 = new Blueray("Mario", TipoVideo.SERIE, 300, 50, "fisting", true);
		tienda.añadirLista(blueray1);
		tienda.añadirLista(cd1);
		tienda.añadirLista(dvd1);
		tienda.listarProductos();
	}
	public void listarProductos() {
		productos.forEach(p -> System.out.println(p.toString()));
	}
	public void añadirLista(Producto p) {
		productos.add(p);
	}
}
