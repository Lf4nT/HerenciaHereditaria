import java.awt.Color;

public class Coche extends Vehiculo {

	protected int numeroRuedas;

	public Coche(double velocidad, double direccion, Color color, int numeroRuedas) {
		super(velocidad, direccion, color);
		this.numeroRuedas = numeroRuedas;
	}

	public Coche(int numeroRuedas) {
		super(100, 90, Color.BLUE);
		this.numeroRuedas = numeroRuedas;
	}

	public Coche() {
		this(100, 90, Color.BLUE, 4);
	}

	public Coche(double velocidad, double direccion, Color color) {
		super(velocidad, direccion, color);
		this.numeroRuedas = 4;
	}

	public void tocarClaxon() {
		System.out.println("estoy tocando el claxooooooon(tocando el claxooooon)");
	}

	public void mover() {
		System.out.println("girando las ruedas");
	}
}
