/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csigaverseny;

import java.util.Random;

public class Csiga {

    int lepes, osszlepes;
    String szin;
    Random rnd = new Random();

    void mozgas() {
        lepes = rnd.nextInt(0, 4);
        osszlepes += lepes;
        String[] szinek = {"Zöld", "Piros", "Kék"};
        szin = szinek[rnd.nextInt(0, szinek.length)];
        return lepes;
    }
    
    
    public int getOsszlepes() {
        return osszlepes;
    }

    public String getSzin() {
        return szin;
    }


    }

