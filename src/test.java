/*
 * Male
 * autor - Karl Karilaid
 * ülesanne 3.4c
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage täisarv: ");
        int ruutudeArv = sisend.nextInt();
        int kord = 1;
        int nisu = 1;
        while (kord < ruutudeArv) {
            nisu = nisu * 2;
            kord++;
        }
        System.out.println("Nisuteri " + ruutudeArv + ". ruudu eest: " + nisu);
    }
}