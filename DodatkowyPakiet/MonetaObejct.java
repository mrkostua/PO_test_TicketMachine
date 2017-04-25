package DodatkowyPakiet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class MonetaObejct{
	int moneta1 = 0;
	int moneta2 = 0;	
	int drobnaMoneta3 = 0;
	int drobnaMoneta4 = 0;
	int drobneMoneta5 =0;
	
	
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
	 * @param moneta1 the moneta1 to set
	 */
	public void setMoneta1(int moneta1) {
		this.moneta1 = moneta1;
	}
	/**
	 * @return the moneta2
	 */
	public int getMoneta2() {
		return moneta2;
	}
	/**
	 * @param moneta2 the moneta2 to set
	 */
	public void setMoneta2(int moneta2) {
		this.moneta2 = moneta2;
	}
	/**
	 * @return the drobnaMoneta3
	 */
	public int getDrobnaMoneta3() {
		return drobnaMoneta3;
	}
	/**
	 * @param drobnaMoneta3 the drobnaMoneta3 to set
	 */
	public void setDrobnaMoneta3(int drobnaMoneta3) {
		this.drobnaMoneta3 = drobnaMoneta3;
	}
	/**
	 * @return the drobnaMoneta4
	 */
	public int getDrobnaMoneta4() {
		return drobnaMoneta4;
	}
	/**
	 * @param drobnaMoneta4 the drobnaMoneta4 to set
	 */
	public void setDrobnaMoneta4(int drobnaMoneta4) {
		this.drobnaMoneta4 = drobnaMoneta4;
	}
	/**
	 * @return the drobneMoneta5
	 */
	public int getDrobneMoneta5() {
		return drobneMoneta5;
	}
	/**
	 * @param drobneMoneta5 the drobneMoneta5 to set
	 */
	public void setDrobneMoneta5(int drobneMoneta5) {
		this.drobneMoneta5 = drobneMoneta5;
	}

}
