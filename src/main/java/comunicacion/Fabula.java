package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String title, String by, int page, String ensenanza, String interpretacion) {
		super(origen, title, by, page);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int count) {
		int cant = super.getPaginas() * count * 1;
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
		m += this.ensenanza;
		return m;
	}
}
