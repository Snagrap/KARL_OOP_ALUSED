/*
 * Jänesevanemate mure
 * autor - Karl Karilaid
 * ülesanne 3.2
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta ringide arv: ");
        int ringideArv = sisend.nextInt();
        int joostud = 0;
        int porgandid = 0;
        int mitu = 2;
        while (joostud < ringideArv) {
            if (joostud % 2 == 0) {
                porgandid += mitu;
                mitu += 2;

            }
            joostud++;
        }
        System.out.println(porgandid);
    }
}