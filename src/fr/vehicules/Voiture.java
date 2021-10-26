package fr.vehicules;
import fr.motors.MoteurElectrique;

public class Voiture extends Vehicule{

	public Voiture() {
		
	}
	
	public Voiture(String brand, String model, int price, MoteurElectrique engine) {
		super(brand, model, price, engine);
	}
	
	//method
	public void display() {
		System.out.print("Je suis une voiture, j'ai un moteur");
		this.getEngine().display();
	}	
	
	
}
