package BlietomatUpgrade;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Konstantyn Prysiazhnyi
 *
 */
public class Bilet {
	
	 private String rodzajBiletu = "";
	 private double cenaBiletu = 0.;
	 private int iloscBiletow = 0;
	 private double suma = 0.;
	 private double reszta = 0.;
	 private LocalDate date;

	/**
	 * @param rodzajBiletu
	 * @param cenaBiletu
	 * @param iloscBiletow
	 * @param suma
	 * @param date
	 * @param reszta
	 */
	public Bilet(String rodzajBiletu, double cenaBiletu, int iloscBiletow, double suma, LocalDate date, double reszta) {
		this.rodzajBiletu = rodzajBiletu;
		this.cenaBiletu = cenaBiletu;
		this.iloscBiletow = iloscBiletow;
		this.suma = suma;
		this.date = date;
		this.reszta = reszta;
	}

	/**
	 *
	 * @return
	 */
	@Override
public String toString() {
	return "Bilet [date : " + date + " " + LocalTime.now() + " "
			+ ", rodzajBiletu : " + rodzajBiletu + " "
			+ String.format(", cenaBiletu : %s , iloscBiletow : %d , suma : %s , reszta : %s",
					new Pieniadz(cenaBiletu),iloscBiletow,new Pieniadz(suma),new Pieniadz(reszta)) +" ]";
}


/**
* @return the date
*/
public LocalDate getDate() {
	return date;
}
/**
 * @return the suma
 */
public double getSuma() {
	return suma;
}










 

}
