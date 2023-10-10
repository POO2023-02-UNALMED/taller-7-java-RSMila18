package comunicacion;

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String title, String by, int page, String co, String editorial, String edicion, String interpretacion) {
		super(origen, title, by, page);
		this.co_autor = co;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setCo_autor(String co) {
		this.co_autor = co;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int count) {
		int cant = super.getPaginas() * count * 2;
		return cant;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String m = super.getOrigen() + "\n";
		m += super.getTitulo() + "\n";
		m += super.getAutor() + "\n";
		m += super.getPaginas() + "\n";
		m += this.co_autor + "\n";
		m += this.editorial + "\n";
		m += this.edicion;
		return m;
	}
}
