package fr;
import fr.motors.MoteurDiesel;
import fr.motors.MoteurElectrique;
import fr.motors.MoteurEssence;
import fr.stationEssence.StationEssence;
import fr.vehicules.Camion;
import fr.vehicules.Moto;
import fr.vehicules.Voiture;

public class Main {

	public static void main(String[] args) {
		
		MoteurDiesel d1 = new MoteurDiesel(90, 300000, "diesel", 200);
		Camion c1 = new Camion("Fiat", "Ducato", 25000, d1);
		c1.display();
		
		
		MoteurEssence e1 = new MoteurEssence(250, 100000, "essence", 5);
		Moto m1 = new Moto("Suzuki", "GSXR-1000", 15000, e1);
		m1.display();
		
		MoteurElectrique el1 = new MoteurElectrique(240, 1000000, "electrique", 80);
		Voiture v1 = new Voiture("Tesla", "Model S", 80000, el1);
		v1.display();

		StationEssence se1 = new StationEssence();
		se1.verifCarburant(c1);
		se1.verifCarburant(m1);
		se1.verifCarburant(v1);
		
		se1.faireLePlein(c1);
		se1.faireLePlein(m1);
		se1.faireLePlein(v1);
	}

}
