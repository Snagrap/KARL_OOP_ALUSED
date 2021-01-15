/*
 * Tervitused mõtisklusega
 * autor - Karl Karilaid
 * ülesanne 6.4a
 * */

import java.util.Scanner;

public class test {
    static Object tervitus(int külalised) {
        System.out.println("Võõrustaja: Tere!");
        System.out.println("Täna " + külalised + ". korda tervitada, mõtiskleb võõrustaja.");
        System.out.println("Külaline: Tere, suur tänu kutse eest!");
        return null;
    }

    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage külaliste arv: ");
        int külalised = sisend.nextInt();
        int kord = 1;
        while (külalised >= kord) {
            tervitus(kord);
            kord++;
        }

    }
}