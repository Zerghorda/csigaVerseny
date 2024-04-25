package csigaverseny;

import java.util.Random;
import java.util.Scanner;

public class Verseny {

    int korHosz = 5;
    Scanner sc = new Scanner(System.in, "latin2");
    Random rnd = new Random();
    Csiga csiga1 = new Csiga();
    Csiga csiga2 = new Csiga();
    Csiga csiga3 = new Csiga();
    Csiga[] csigak = {csiga1, csiga2, csiga3};

    void start() {
        System.out.println("Ön szerint ki fog nyerni?(Zöld,Piros,Kék)");
        String tipp = sc.nextLine();
        tipp = tipp.toLowerCase();

        for (int i = 0; i <= korHosz - 1; i++) {
            System.out.printf("%d.kör\n", i + 1);
            gyorsolas();
            csigaAllapot();
        }

        nyertesHirdetes();
    }

    private void gyorsolas() {
        double esely = Math.random();
        int valasztottCsiga = rnd.nextInt(1, 4);
        if (esely > 0.2 && esely < 0.3) {
            if (valasztottCsiga == 1) {
                System.out.println("Szalad csiga 1");
                csiga1.mozgas(2);
                csiga2.mozgas();
                csiga3.mozgas();
            } else if (valasztottCsiga == 2) {
                System.out.println("Szalad csiga 2");
                csiga1.mozgas();
                csiga2.mozgas(2);
                csiga3.mozgas();
            } else if (valasztottCsiga == 3) {
                System.out.println("Szalad csiga 3");
                csiga1.mozgas();
                csiga2.mozgas();
                csiga3.mozgas(2);
            }
        } else {
            csiga1.mozgas();
            csiga2.mozgas();
            csiga3.mozgas();
        }

    }

    private void csigaAllapot() {
        for (int i = 0; i <= csigak.length - 1; i++) {
            System.out.printf("csiga%d lépet %d és jelenleg ennyitment: %d\n", i + 1, csigak[i].getLepes(), csigak[i].getOsszlepes());
        }

    }

    private void nyertesHirdetes() {
    }

}
