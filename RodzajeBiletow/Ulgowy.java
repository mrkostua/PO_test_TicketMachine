package RodzajeBiletow;

import java.time.LocalDate;

import BlietomatUpgrade.Bilet;

public class Ulgowy extends Bilet {
	private  static String rodzajBiletu = "ulgowy"; 
	 
	/**
	 * @param cenaBiletu
	 * @param iloscBiletow
	 * @param suma
	 * @param date
	 * @param reszta
	 */
	public Ulgowy( double cenaBiletu, int iloscBiletow, double suma,LocalDate date,double reszta) {
		super(rodzajBiletu, cenaBiletu, iloscBiletow, suma,date,reszta);
	}

	
}
