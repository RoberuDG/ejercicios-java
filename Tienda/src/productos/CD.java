package productos;

public class CD implements Producto {
	// Variables
	private String autor;
	private float duracion;
	private String genero;
	private float precio;

	// Constructor
	public CD (String autorCD, float duracionCD, String generoCD, float precioCD) {
		this.autor = autorCD;
		this.duracion = duracionCD;
		this.genero = generoCD;
		this.precio = precioCD;
	}

	@Override
	public String toString() {
		return "CD [autor=" + autor + ", duracion=" + duracion + ", genero=" + genero + ", precio=" + precio + "]";
	}
	

}
