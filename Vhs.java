package heranca3;

public class Vhs extends Midia {
	
	private String titulo;
	
	public Vhs (int codigo, String descricao, float duracao, String gravadora, String titulo) {
		super (codigo, descricao, duracao, gravadora);
		setTitulo(titulo);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length()>0)
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vhs [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

	
}
