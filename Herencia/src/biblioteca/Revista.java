package biblioteca;

public class Revista extends Ejemplar {

	private int numero = 12;

	public Revista(String codigo, String titulo, int año) {
		super(codigo, titulo, año);

	}

	public Revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return super.toString() + " Revista [numero=" + numero + "]";
	}
}
