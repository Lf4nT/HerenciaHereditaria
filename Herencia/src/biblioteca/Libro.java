package biblioteca;

public class Libro extends Ejemplar implements Prestable {

	private boolean prestado = false;/* Cambiar respecto estado del libro */

	public Libro(String codigo, String titulo, int año) {
		super(codigo, titulo, año);

	}

	public Libro(String codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return super.toString() + " Libro [prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {

	}

	@Override
	public void devolver() {

	}

	@Override
	public boolean prestado() {
		return prestado;
	}
}
