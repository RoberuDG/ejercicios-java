package productos;

public class Blueray extends Video {
	// Variable
	private boolean extra;
	
	// Constructor
	public Blueray(String director, TipoVideo tipo, float duracion, float precio, String genero, boolean extra) {
		super(director, tipo, duracion, precio, genero);
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "Blueray [extra=" + extra + ", toString()=" + super.toString() + "]";
	}
	
}
