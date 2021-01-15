/*
 * Peo eelarve
 * autor - Karl Karilaid
 * ülesanne 6.3
 * */

import java.util.Scanner;

public class test {
    //eelarve meetod
    static int eelarve(int kulalisteArv) {
        int summa = kulalisteArv * 10 + 55;
        return summa;
    }

    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Mitu inimest on kutsutud: ");
        int kutsutud = sisend.nextInt();
        System.out.println("Mitu inimest tuleb peole:");
        int kindel = sisend.nextInt();
        System.out.println("Maksimaalne eelarve: " + eelarve(kutsutud));
        System.out.println("Minimaalne eelarve: " + eelarve(kindel));
    }

}