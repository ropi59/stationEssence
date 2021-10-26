package fr.stationEssence;
import fr.motors.MoteurDiesel;
import fr.motors.MoteurEssence;
import fr.vehicules.Vehicule;

public class StationEssence {

	//attributs
	private double dieselPrice = 1.5;
	private double essencePrice = 1.8;
	private double electricitePrice = 0.1;
	String fuel = "inconnu";
	
	//getters setters
	public double getDieselPrice() {
		return dieselPrice;
	}

	public void setDieselPrice(double dieselPrice) {
		this.dieselPrice = dieselPrice;
	}

	public double getEssencePrice() {
		return essencePrice;
	}

	public void setEssencePrice(double essencePrice) {
		this.essencePrice = essencePrice;
	}

	public double getElectricitePrice() {
		return electricitePrice;
	}

	public void setElectricitePrice(double electricitePrice) {
		this.electricitePrice = electricitePrice;
	}
	
	//method
	public String verifCarburant(Vehicule v) {
		if(v.getEngine() instanceof MoteurDiesel) {
			fuel = "Diesel";
		} else if(v.getEngine() instanceof MoteurEssence) {
			fuel = "Essence";
		}else {
			fuel = "Electricité";
		}
		System.out.println("Ce vehicule roule avec " + fuel);
		return fuel;
	}
	
	public void  faireLePlein(Vehicule v) {
		if (v.getEngine() instanceof MoteurDiesel) {
			fuel = "Diesel";
			System.out.println("On fait le plein de " + fuel);
			System.out.println("Le plein est de " + v.getEngine().getReservoir() + "L. Cela coute " + (v.getEngine().getReservoir()) * dieselPrice + " euros");
		} else if (v.getEngine() instanceof MoteurEssence) {
			fuel = "Essence";
			System.out.println("On fait le plein de " + fuel);
			System.out.println("Le plein est de " + v.getEngine().getReservoir() + "L. Cela coute " + (v.getEngine().getReservoir()) * essencePrice + " euros");		
		}else {
			fuel = "Electricité";
			System.out.println("On fait le plein de " + fuel);
			System.out.println("Le plein est de " + v.getEngine().getReservoir() + "Kw. Cela coute " + (v.getEngine().getReservoir()) * electricitePrice + " euros");
		}
	}


}
