package fr.motors;
public class MoteurDiesel extends Moteur{

	//attributs
	private static final String FUEL = "Diesel";
	
	//constructors
	public MoteurDiesel(){
		super();
	}
	
	public MoteurDiesel(int speed, int kilometers, String fuel, int reservoir){
		super(speed, kilometers, FUEL, reservoir);
	}
	
	
	//method
	public void display() {
		System.out.println(" diesel, je roule avec " + this.getFuel() + ", je roule à " + this.getSpeed() + "km/h, je peux faire " + this.getKilometers() + "km.");
	}
}
