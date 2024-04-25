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
    int mozgas(){
        lepes = rnd.nextInt(0,4);
        osszlepes+=lepes;
        return lepes;
    }
}
