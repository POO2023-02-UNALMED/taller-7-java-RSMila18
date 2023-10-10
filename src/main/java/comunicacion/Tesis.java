package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public Tesis(String origen, String title, String by, int page, String idea, String[] argument, String conclusion, String reference, String interpretacion) {
		super(origen, title, by, page);
		this.idea = idea;
		Tesis.argumentos = argument;
		this.conclusion = conclusion;
		this.referencia = reference;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
		return idea;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public void setArgumentos(String[] argument) {
		Tesis.argumentos = argument;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public String getReferencias() {
		return referencia;
	}
	
	public void setReferencias(String reference) {
		this.referencia = reference;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	public int palabrasTotales(int count) {
		int cant = super.getPaginas() * count * 5;
		return cant;
	}
	
	public String interpretacion(){
		return interpretacion;
	}
	
	public String toString() {
		
		String m = super.getOrigen() + "\n"; 
				m +=super.getTitulo() + "\n";
				m +=super.getAutor() + "\n" ;
				m +=super.getPaginas() + "\n";
				m +=this.idea + "\n";
				m +=Tesis.argumentos.length + "\n";
				m +=this.conclusion + "\n";
				m +=this.referencia;
		return m;
	}
}
