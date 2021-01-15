/*
 * Banner
 * autor - Karl Karilaid
 * ülesanne 6.1
 * */

import java.util.Scanner;

public class test {
    //eelarve meetod
    static String banner(String lause) {
        String suur_lause = lause.toUpperCase();
        return suur_lause;
    }

    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Mitu korda soovite lauset näidata: ");
        int kord = sisend.nextInt();
        sisend = new Scanner(System.in);
        System.out.println("Mis lauset soovite näidata:");
        String lause = sisend.nextLine();
        while (kord > 0) {
            System.out.println(banner(lause));
            kord -= 1;
        }
    }

}