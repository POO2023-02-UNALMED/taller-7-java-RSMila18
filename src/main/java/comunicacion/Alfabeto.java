package comunicacion;

public class Alfabeto extends Pictograma{
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letter, String interpretacion) {
		super(origen);
		Alfabeto.letras = letter;
		this.interpretacion = interpretacion;
	}

	public void setLetras(String[] letter) {
		Alfabeto.letras = letter;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String m = "";
		for(int i = 0; i < Alfabeto.letras.length; i++) {
			if (i < Alfabeto.letras.length-1) {
				m += Alfabeto.letras[i] + ", ";
			}
			else {
				m += Alfabeto.letras[i];
			}
		}
		return m;
	}
}