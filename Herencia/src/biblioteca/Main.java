package biblioteca;

public class Main {

	public static void main(String[] args) {
		Libro libro = new Libro("123", "El Quijote", 1605);
		System.out.println(libro);
		Ejemplar e = libro;
		((Libro) e).prestar();
		Prestable p = libro;
		p.prestar();
	}
}
