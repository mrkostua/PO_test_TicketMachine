package RodzajeBiletow;

import java.time.LocalDate;

import BlietomatUpgrade.Bilet;

public class Normalny extends Bilet{
	
	private  static String rodzajBiletu = "normalny"; 
	/**
	 * @param cenaBiletu
	 * @param iloscBiletow
	 * @param suma
	 * @param date
	 * @param reszta
	 */
	public Normalny( double cenaBiletu, int iloscBiletow, double suma,LocalDate date,double reszta) {
		super(rodzajBiletu, cenaBiletu, iloscBiletow, suma,date,reszta);
	}


}
