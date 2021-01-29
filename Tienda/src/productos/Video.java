package productos;

public abstract class Video implements Producto {
	// Variables
	private String director;
	private TipoVideo tipo;
	private String genero;
	private float duracion;
	private float precio;

	// Constructor
	public Video(String director, TipoVideo tipo, float duracion, float precio, String genero) {
		this.director = director;
		this.tipo = tipo;
		this.duracion = duracion;
		this.precio = precio;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", tipo=" + tipo.toString() + ", genero=" + genero + ", duracion=" + duracion
				+ ", precio=" + precio + "]";
	}

}
