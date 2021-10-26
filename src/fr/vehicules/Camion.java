package fr.vehicules;
import fr.motors.Moteur;

public class Camion extends Vehicule{

	
	//constructors
	public Camion() {
		
	}
	
	public Camion(String brand, String model, int price, Moteur engine) {
		super(brand, model, price, engine);
	}
	
	//method
	public void display() {
		System.out.print("Je suis un camion, j'ai un moteur");
		this.getEngine().display();
	}	
	
}