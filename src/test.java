/*
 * Õunamahla tegemine
 * autor - Karl Karilaid
 * ülesanne 6.2
 * */

import java.util.Scanner;

public class test {
    static int mahlapakkidearv(double õun) {
        int mahlapakkidearv = (int) Math.round(õun * 0.4 / 3);
        return mahlapakkidearv;
    }

    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage õunte kogus kilogrammides: ");
        double õun = sisend.nextDouble();
        System.out.println(mahlapakkidearv(õun));

    }
}