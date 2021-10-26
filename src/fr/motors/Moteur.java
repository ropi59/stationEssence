package fr.motors;


public class Moteur {

	//attributs
	private int speed;
	private int kilometers;
	private String fuel;
	private int reservoir;
	
	//constructors
	public Moteur(){
		
	}
	
	public Moteur(int speed, int kilometers, String fuel, int reservoir){
		this.speed = speed;
		this.kilometers = kilometers;
		this.fuel = fuel;
		this.reservoir = reservoir;
	}
	
	//getters setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getReservoir() {
		return reservoir;
	}
	public void setReservoir(int reservoir) {
		this.reservoir = reservoir;
	}
	
	//method
	public void display() {
		System.out.println("Je suis un moteur, je roule à " + this.speed + " et je peux faire " + this.kilometers + " km");
	}
	
}
