package BlietomatUpgrade;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import DodatkowyPakiet.WyliczacReszty;
import RodzajeBiletow.Normalny;
import RodzajeBiletow.Ulgowy;

/**
 * @author Konstantyn Prysiazhnyi
 *
 */
public class Biletomat {
	private static final String LOKALIZACJA_BILETU = "Biletomat2 Warszawska 24";
	private static int iloscSprzedanychBiletow =0;
	
	public  String[] rodzajeBiletow = {"20min","40min","dwuprzejazdowy","24god"}; 
	public double[] cenyBiletowNormalne = {1.90,2.40,3.20,14.20};
	public double[] cenyBiletowUlgowe = {1.40,1.90,2.40,8.20};
	
	private List<Bilet> listaBiletow = new  ArrayList<>();
	
	private WyliczacReszty wyliczacReszty = new WyliczacReszty();
	
	public Biletomat(){
		System.out.println(LOKALIZACJA_BILETU);
	}
	
	
	/**
	 * @param date
	 * @return
	 */
	public void wydrukujTransakcjeOkreslonaData(LocalDate date){
		String wyswietl = "";
		if(listaBiletow.size()==0 || listaBiletow == null){
			wyswietl = "zadne bilety nie zostale kupione lista jest pusata";
			}else{
				for(Bilet b : listaBiletow){
					if(date.equals(b.getDate()))
			wyswietl +="\n " + b;
				}				
		}
		System.out.println("	Wszystkie transakcje realizowane : "+ date+ " " + wyswietl);
	}
	
	
	/**
	 * @param rodzajBiletu
	 * @param iloscBiletow
	 * @param wrzuconoPieniadz
	 * @param date
	 * @return
	 */
	public String sprzedajUlgowyBilet(int rodzajBiletu, int iloscBiletow, double wrzuconoPieniadz,LocalDate date){
		double suma = 0.;
		if(!(iloscBiletow >0)){
			drukujBilet(false);
			return "";
		}
		suma = cenyBiletowUlgowe[rodzajBiletu] * iloscBiletow;
			if(!(sprawdzaCzyWystarczajacoPieniadz(wrzuconoPieniadz,suma))){
				drukujBilet(false);
				return "";
			}
			
			double reszta =wrzuconoPieniadz - suma;
		Bilet bilet = new Ulgowy(cenyBiletowUlgowe[rodzajBiletu], iloscBiletow, suma,date,reszta);
		
		listaBiletow.add(bilet);
		drukujBilet(true);
		wyliczacReszty.wyliczaJakieMonetyUzycDoWydaniaReszty(reszta);
		
		iloscSprzedanychBiletow ++;
		return "";
	}
	

	/**
	 * @param rodzajBiletu
	 * @param iloscBiletow
	 * @param wrzuconoPieniadz
	 * @param date
	 * @return
	 */
	public String sprzedajNormalnyBilet(int rodzajBiletu, int iloscBiletow, double wrzuconoPieniadz,LocalDate date){
		double suma = 0.;
		if(!(iloscBiletow >0))
			drukujBilet(false,"Ilosc biletow rowna sie 0");
		
		suma = cenyBiletowNormalne[rodzajBiletu] * iloscBiletow;
		if(!(sprawdzaCzyWystarczajacoPieniadz(wrzuconoPieniadz,suma))){
			drukujBilet(false,"Nie wystarczajaco srodkow do zakupu bileta/ow");
			return "";
		}
		//Przyklad dziedziczenia na podstawie klasy Bilet po ktorej dziedziczy Normalny
		//i Ulgowy posiadajac w swoim konstruktorze super() z odlowaniem do konstruktora 
		//Bilet i dodajac do konstruktora zmienna Typ biletu ( co wynniku pobiera dane z dwoch roznych tablic z cenami)  
		double reszta =wrzuconoPieniadz - suma;
		Bilet bilet = new Normalny(cenyBiletowNormalne[rodzajBiletu], iloscBiletow, suma,date,reszta);
		
		listaBiletow.add(bilet);
		drukujBilet(true);
		wyliczacReszty.wyliczaJakieMonetyUzycDoWydaniaReszty(reszta);
		iloscSprzedanychBiletow ++;
		return "";
	}
	
	
	private void drukujBilet(Boolean result){
		if(result)
		System.out.println(listaBiletow.get(listaBiletow.size()  - 1));
	}
	
	private void drukujBilet(Boolean result,String bladPowiadomienie){
		if(!result)
			System.out.println("data : " + LocalDate.now() +" godzina : " + LocalTime.now() + " " + bladPowiadomienie);
		else
		System.out.println(listaBiletow.get(listaBiletow.size()  - 1));
	}
	
	
	
//Wydruk informacj o wszystkich sprzedanych biletach 	
	@Override
	public String toString() {
		double dochod = 0.;
	String wyswietl = "";
	if(listaBiletow.size()==0 || listaBiletow == null){
		wyswietl = "zadne bilety nie zostale kupione lista jest pusata";
		}else{
			for(Bilet b : listaBiletow){
		wyswietl +="\n " + b;
		dochod += b.getSuma();
			}
	}
	return String.format("	Wszystkie sprzedane bilety %s \n Ilosc spzedanych biletow za ostatni czas"
			+ " wynosi : %d \n dochod : %4.2f", wyswietl,iloscSprzedanychBiletow,dochod);
	} 


	private Boolean sprawdzaCzyWystarczajacoPieniadz(double wrzucono, double doZaplaty){
	if(wrzucono < doZaplaty)
		return false;
	else
		return true;
	}
}