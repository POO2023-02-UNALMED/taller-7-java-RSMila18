package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String title, String by, int page, String date, String primicia, String interpretacion) {
		super(origen, title, by, page);
		this.fecha = date;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String date) {
		this.fecha = date;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int count) {
		int cant = super.getPaginas() * count * 10;
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
		m += this.fecha + "\n";
		m += this.primicia;
		return m;
	}
}
