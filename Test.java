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
    //maks wrzucono pieniadz 10 zl
        biletomat.sprzedajUlgowyBilet(0, 1, 8, LocalDate.now().minusDays(2));
        biletomat.sprzedajNormalnyBilet(0, 3, 7.30, LocalDate.now().minusDays(2));
        biletomat.sprzedajUlgowyBilet(3, 1, 10, LocalDate.now());
        biletomat.sprzedajNormalnyBilet(0, 1, 8, LocalDate.now());
        biletomat.sprzedajUlgowyBilet(0, 1, 8, LocalDate.now().minusDays(2));
        biletomat.sprzedajUlgowyBilet(0, 1, 6.60, LocalDate.now().minusDays(2));

        System.out.println("\n \n");
        biletomat.wydrukujTransakcjeOkreslonaData(LocalDate.now().minusDays(2));
        System.out.println("\n \n");
        System.out.println(biletomat);
    }
}
