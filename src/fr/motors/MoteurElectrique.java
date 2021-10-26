package fr.motors;
public class MoteurElectrique extends Moteur{

	//attributs
	private static final String FUEL = "Electricité";
	
	//constructors
	public MoteurElectrique(){
		
	}
	
	public MoteurElectrique(int speed, int kilometers, String fuel, int reservoir){
		super(speed, kilometers, FUEL, reservoir);
	}
	
	//method
	public void display() {
		System.out.println(" electrique, je roule avec " + this.getFuel() + ", je roule à " + this.getSpeed() + "km/h, je peux faire " + this.getKilometers() + "km.");
	}
}
