package DodatkowyPakiet;

public class MonetaObejct{
	private int moneta1 = 0;
	private int moneta2 = 0;
	private int drobnaMoneta3 = 0;
	private int drobnaMoneta4 = 0;
	private int drobneMoneta5 =0;
	
	
	/**
	 * @param moneta1
	 * @param moneta2
	 */
	public MonetaObejct(int moneta1, int moneta2) {
		this.moneta1 = moneta1;
		this.moneta2 = moneta2;
	}
	
	/**
	 * @param drobnaMoneta3
	 * @param drobnaMoneta4
	 * @param drobneMoneta5
	 */
	public MonetaObejct(int drobnaMoneta3, int drobnaMoneta4, int drobneMoneta5) {
		this.drobnaMoneta3 = drobnaMoneta3;
		this.drobnaMoneta4 = drobnaMoneta4;
		this.drobneMoneta5 = drobneMoneta5;
	}
	
	/**
	 * @return the moneta1
	 */
	public int getMoneta1() {
		return moneta1;
	}
	/**
	 * @return the moneta2
	 */
	public int getMoneta2() {
		return moneta2;
	}
	/**
	 * @return the drobnaMoneta3
	 */
	public int getDrobnaMoneta3() {
		return drobnaMoneta3;
	}
	/**
	 * @return the drobnaMoneta4
	 */
	public int getDrobnaMoneta4() {
		return drobnaMoneta4;
	}
	/**
	 * @return the drobneMoneta5
	 */
	public int getDrobneMoneta5() {
		return drobneMoneta5;
	}
}
