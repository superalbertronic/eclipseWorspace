package examenejercicio2;

public class Musica extends Biblioteca{
	 private String artista;
	  private String album;
	  private String generoMusical;

	  public Musica(String nombre, String ubicacion, String artista, String album, String generoMusical) {
	    super(nombre, ubicacion);
	    this.artista = artista;
	    this.album = album;
	    this.generoMusical = generoMusical;
	  }

	  public String getArtista() {
	    return artista;
	  }

	  public void setArtista(String artista) {
	    this.artista = artista;
	  }

	  public String getAlbum() {
	    return album;
	  }

	  public void setAlbum(String album) {
	    this.album = album;
	  }

	  public String getGeneroMusical() {
	    return generoMusical;
	  }

	  public void setGeneroMusical(String generoMusical) {
	    this.generoMusical = generoMusical;
	  }

	  @Override
	  public void mostrarInformacion() {
	    System.out.println("**M�sica:**");
	    System.out.println(super.toString());
	    System.out.println("Artista: " + artista);
	    System.out.println("�lbum: " + album);
	    System.out.println("G�nero musical: " + generoMusical);
	  }

	  @Override
	  public void prestar() {
	    System.out.println("M�sica prestada");
	  }

	  @Override
	  public void devolver() {
	    System.out.println("M�sica devuelta");
	  }
	}