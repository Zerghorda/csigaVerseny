package csigaverseny;

import java.util.Random;
import java.util.Scanner;

public class Verseny {

    int korHosz;
    Scanner sc = new Scanner(System.in, "latin2");
    Random rnd = new Random();

    void start() {
        System.out.println("Ön szerint ki fogg nyerni?");
        String tipp = sc.nextLine();
        Csiga csiga1 = new Csiga();
        Csiga csiga2 = new Csiga();
        Csiga csiga3 = new Csiga();
        for (int i = 0; i <= korHosz; i++) {
            gyorsolas();
            csiga1.mozgas();
            csiga2.mozgas();
            csiga3.mozgas();
            csigaAllapot();
        }

        nyertesHirdetes();
        csigaAllapot();
    }

    private void gyorsolas() {
        double esely = Math.random();
        int valasztottCsiga = rnd.nextInt(1, 4);
        if (esely == 0.2) {
            if (valasztottCsiga == 1) {
                csiga1.mozgas(2);
            } else if (valasztottCsiga == 2) {
                csiga2.mozgas(2);
            } else if (valasztottCsiga == 3) {
                csiga3.mozgas(2);
            }
        }

    }

    private void nyertesHirdetes() {
    }

    private void csigaAllapot() {
    }
}
