package csigaverseny;

import java.util.Random;

public class Csiga {

    int lepes, osszlepes;
    String szin;
    Random rnd = new Random();

    void mozgas(int szam) {
        lepes = szam * rnd.nextInt(0, 4);
        osszlepes += lepes;
        String[] szinek = {"Zöld", "Piros", "Kék"};
        szin = szinek[rnd.nextInt(0, szinek.length)];
    }

    private int getOsszlepes() {
        return osszlepes;
    }

    private String getSzin() {
        return szin;
    }

    void mozgas() {
        int szam = 1;
        mozgas(szam);
    }
}
