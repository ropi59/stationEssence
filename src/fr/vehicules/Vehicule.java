package fr.vehicules;
import fr.motors.Moteur;

public class Vehicule {

	//attributs
	private String brand;
	private String model;
	private int price;
	private Moteur engine;
	
	//constructors
	public Vehicule() {
		
	}
	
	public Vehicule(String brand, String model, int price, Moteur engine) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}
	
	//getters setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Moteur getEngine() {
		return engine;
	}
	public void setEngine(Moteur engine) {
		this.engine = engine;
	}
	
	//method
	public void display() {
		System.out.println("marque : " + this.brand 
				+ " modèle : " + this.model 
				+ "prix : " + this.price 
				+ "moteur : " + this.engine);
	}

}
