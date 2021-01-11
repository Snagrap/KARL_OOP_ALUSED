/*
 * Tingimuslausete kasutamise näide
 * autor - Karl Karilaid
 * ülesanne 2.2
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //defineerime muutujad
        //lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        //selgitame kasutajale, mida tuleb sisestada
        System.out.println("Palun sisesta punktide summa: ");
        //salvestame kasutaja sisestatud väärtuse
        double punktid = sisend.nextDouble();
        //kontroll
        if (punktid >= 0 && punktid < 66) {
            System.out.println("Vähem kui kandideerimiseks võimalik");
        } else if (punktid >= 66 && punktid < 85) {
            System.out.println("Kandideerimine vastuvõtule");
        } else if (punktid >= 85 && punktid <= 100) {
            System.out.println("Vastuvõtt tagatud");
        } else if (punktid < 0 || punktid > 100) {
            System.out.println("Vigane punktisumma");
        }
    }
}