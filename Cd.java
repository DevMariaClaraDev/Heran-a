package heranca3;

public class Cd extends Midia {
	
	private int faixas;
	private String artistas;
	private String album;
	
	public Cd (int codigo, String descricao, float duracao, String gravadora, String artistas, int faixas, String album ) {
	super (codigo, descricao, duracao, gravadora);
	setArtistas(artistas);
	setFaixas(faixas);
	setAlbum(album);
	
}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		if (faixas > 0)
		this.faixas = faixas;
	}

	public String getArtistas() {
		return artistas;
	}

	public void setArtistas(String artistas) {
		if(artistas.length()>0)
		this.artistas = artistas;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		if (album.length()>0)
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cd [faixas=");
		builder.append(faixas);
		builder.append(", artistas=");
		builder.append(artistas);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
