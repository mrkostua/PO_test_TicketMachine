package DodatkowyPakiet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class WyliczacReszty{
	//max wrzucone 10
	public String wyliczaJakieMonetyUzycDoWydaniaReszty(double reszta){
		if(reszta>10){
			System.out.println("nie nie");
			return "";
		}
		
		MonetaObejct monetaObejct = null;
		int cale = 0;
		int moneta1 = 0;
		int moneta2 = 0;	
		int drobnaMoneta3 = 0;
		int drobnaMoneta4 = 0;
		int drobneMoneta5 =0;
		
		if(reszta >= 1){
			 cale = (int) reszta;
			 
			 monetaObejct = wyliczaJakieDuzeMonetyUzycDoWydaniaReszty(cale);
			  moneta1 = monetaObejct.getMoneta1();
			  moneta2 = monetaObejct.getMoneta2();
			 	 
			 cale = (monetaObejct.getMoneta1() + monetaObejct.getMoneta2());
			if((reszta - cale ) == 0.0){
				System.out.println("\n dziala zwaraca dwie monety" + "przypadek kiedy reszta nie ma drobnych");
				System.out.println("\n moneta1 :" + moneta1
				+ "\n moneta2 :" + moneta2);
			}
			else
			{
				System.out.println("\n dziala zwaraca 2 duzych i 3 drobnych");
				reszta = reszta - cale;
				monetaObejct = wyliczaJakieDrobneMonetyUzycDoWydaniaReszty(reszta);
				 drobnaMoneta3 = monetaObejct.getDrobnaMoneta3();
				 drobnaMoneta4 = monetaObejct.getDrobnaMoneta4() ;
				 drobneMoneta5 =monetaObejct.getDrobneMoneta5();
				 System.out.println("\n dziala zwaraca dwie monety" + "przypadek kiedy reszta nie ma drobnych");
					System.out.println("\n moneta1 :" + moneta1
					+ "\n moneta2 :" + moneta2 
					+"\n drobnaMoneta3, :" +drobnaMoneta3
					+ "\n drobnaMoneta4 :" + drobnaMoneta4
					+ "\n drobneMoneta5 :" + drobneMoneta5);	
			}
		}	
		else{
			monetaObejct = wyliczaJakieDrobneMonetyUzycDoWydaniaReszty(reszta);
			System.out.println("\n reszta tylko drobne w wyniku mamy 3 monety " + "2 moga byc 0");
			System.out.println("\n drobnaMoneta3, :" +monetaObejct.getDrobnaMoneta3()
			+ "\n drobnaMoneta4 :" + monetaObejct.getDrobnaMoneta4() 
			+ "\n drobneMoneta5 :" + monetaObejct.getDrobneMoneta5());
		}
		return "";
	}


private MonetaObejct wyliczaJakieDrobneMonetyUzycDoWydaniaReszty(double reszta){
	int drobnaMoneta3 = 0;
	int drobnaMoneta4 = 0;
	int drobneMoneta5 =0;
	
	int drobneReszta =(int) (reszta *10);
	switch(drobneReszta){
	case 1:
		drobnaMoneta3 = 10;
		break;
	case 2:
		drobnaMoneta3 = 20;
		break;
	case 3:
		drobnaMoneta3 = 20;
		drobnaMoneta4 = 10;
		break;
	case 4:
		drobnaMoneta3 = 20;
		drobnaMoneta4 = 20;
		break;
	case 5:
		drobnaMoneta3 = 50;
		break;
	case 6:
		drobnaMoneta3 = 50;
		drobnaMoneta4 = 10;
		break;
	case 7:
		drobnaMoneta3 = 50;
		drobnaMoneta4 = 20;
		break;
	case 8:
		drobnaMoneta3 = 50;
		drobnaMoneta4 = 20;
		drobneMoneta5 = 10;
		break;
	case 9:
		drobnaMoneta3 = 50;
		drobnaMoneta4 = 20;
		drobneMoneta5 = 20;
		break;
	}
	
	return new MonetaObejct(drobnaMoneta3, drobnaMoneta4, drobneMoneta5);
}

private MonetaObejct wyliczaJakieDuzeMonetyUzycDoWydaniaReszty(int cale){
	int moneta1 = 0;
	int moneta2 = 0;
	
		if(cale>5){
			moneta1=5;
			if(cale%5 ==0){
				moneta2 =5;
			}
			switch(cale%5){
			case 1:
				moneta2=1;
				break;
			case 2:
				moneta2=2;
				break;
			case 3:
				moneta2=3;
				break;
			case 4:
				moneta2=4;
				break;
			}
		}
		switch(cale){
		case 1:
			moneta1 = 1;
			break;
		case 2:
			moneta1 = 2;
			break;
		case 3:
			moneta1 =2;
			moneta2 =1;
			break;
		case 4:
			moneta1 =2;
			moneta2=2;
			break;
		case 5:
			moneta1=5;
			break;
		}
		return new MonetaObejct(moneta1, moneta2);
	}

}