package csigaverseny;

import java.util.Random;

public class Csiga {

    public static int getLepes() {
        return lepes;
    }

    public static int getOsszlepes() {
        return osszlepes;
    }

    public static String getSzin() {
        return szin;
    }

    private static int lepes;
    private static int osszlepes;
    private static String szin;
    static Random rnd = new Random();

    void mozgas(int szam) {
        lepes = szam * rnd.nextInt(0, 4);
        osszlepes += lepes;

    }

    void mozgas() {
        int szam = 1;
        mozgas(szam);
    }
}
