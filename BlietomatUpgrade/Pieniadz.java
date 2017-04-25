package BlietomatUpgrade;

/**
 * @author Konstantyn Prysiazhnyi
 *
 */
public class Pieniadz {
	
private static final String PLN = "zlotych";
private double pieniadzy = 0.;
		
/**
 * @param pieniadzy
 */
public Pieniadz(double pieniadzy) {
	super();
	this.pieniadzy = pieniadzy;
}

	@Override
	public String toString() {
		return String.format("%4.2f %s",pieniadzy,PLN);
	}
	

}