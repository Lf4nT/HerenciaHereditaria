import java.awt.Color;

public abstract class Vehiculo {
	protected double velocidad;
	protected Color color;
	protected double direccion;

	public Vehiculo(double velocidad, double direccion, Color color) {
		this.velocidad = velocidad;
		this.direccion = direccion;
		this.color = color;
	}

	public void diHola() {
		System.out.println("Hola");
	}

	public abstract void mover();

}
