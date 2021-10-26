package fr.motors;
public class MoteurEssence extends Moteur{

	//attributs
	private static final String FUEL = "Essence";
	
	//constructors
	public MoteurEssence(){
		
	}
	
	public MoteurEssence(int speed, int kilometers, String fuel, int reservoir){
		super(speed, kilometers, FUEL, reservoir);
	}
	
	//method
	public void display() {
		System.out.println(" essence, je roule avec " + this.getFuel() + ", je roule à " + this.getSpeed() + "km/h, je peux faire " + this.getKilometers() + "km.");
	}
}
