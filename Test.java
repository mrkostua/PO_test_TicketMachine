import BlietomatUpgrade.Biletomat;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //przyklad Kompozycji
        Biletomat biletomat = new Biletomat();
        System.out.println("\n		Rodzaje biletow i ich cene");
        for(int i = 0; i<biletomat.rodzajeBiletow.length; i++){
            System.out.println(biletomat.rodzajeBiletow[i]+ "=" + " cena norm :" + biletomat.cenyBiletowNormalne[i] + " cena ulg :" + biletomat.cenyBiletowUlgowe[i]);
        }

        System.out.println("\n \n");

        biletomat.sprzedajNormalnyBilet(2, 2, 3.20, LocalDate.now());
        biletomat.sprzedajNormalnyBilet(1, 3, 8.90, LocalDate.now().minusDays(2));
        biletomat.sprzedajUlgowyBilet(3, 1, 10, LocalDate.now());
        biletomat.sprzedajNormalnyBilet(0, 1, 3, LocalDate.now());
        biletomat.sprzedajUlgowyBilet(0, 1, 2, LocalDate.now().minusDays(2));

        System.out.println("\n \n");
        biletomat.wydrukujTransakcjeOkreslonaData(LocalDate.now().minusDays(2));
        System.out.println("\n \n");
        System.out.println(biletomat);
    }
}
