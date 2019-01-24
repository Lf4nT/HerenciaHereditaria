import java.awt.Color;

public class Barco extends Vehiculo {

	protected double eslora;

	public Barco(double velocidad, double direccion, Color color, double eslora) {
		super(velocidad, direccion, color);
		this.eslora = eslora;
	}

	public void mover() {
		System.out.println("girando las helices");
	}
}
