package biblioteca;

public class Revista extends Ejemplar {

	private int numero = 12;

	public Revista(String codigo, String titulo, int a�o) {
		super(codigo, titulo, a�o);

	}

	public Revista(String codigo, String titulo, int a�o, int numero) {
		super(codigo, titulo, a�o);
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
