package fr.vehicules;
import fr.motors.MoteurEssence;

public class Moto extends Vehicule{

	public Moto() {
		
	}
	
	public Moto(String brand, String model, int price, MoteurEssence engine) {
		super(brand, model, price, engine);
	}
	
	//method
	public void display() {
		System.out.print("Je suis une moto, j'ai un moteur");
		this.getEngine().display();
	}	


}
