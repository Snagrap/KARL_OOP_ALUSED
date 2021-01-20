/*
 * Panga ülesanne
 * autor - Karl Karilaid
 * ülesanne -
 * */

public class test {
    public static void main(String[] args) {
        // loo konto tüüpi objekt nimega, annakonto
        konto annakontoSEB = new konto();
        konto annakontoSWED = new konto();
        // lisan konkreetsed väärtused
        annakontoSEB.lookonto("Anna", 0.0);
        annakontoSWED.lookonto("Anna", 0.0);

        annakontoSEB.lisaraha(20.0);
        annakontoSWED.lisaraha(-50.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + annakontoSEB.omanik);
        System.out.println("Konto bilanss = " + annakontoSEB.bilanss);
        annakontoSEB.votaraha(10.0);
        System.out.println("Konto bilanss = " + annakontoSEB.bilanss);
        annakontoSEB.votaraha(20.0);
        System.out.println("Konto bilanss = " + annakontoSEB.bilanss);
        annakontoSEB.teeulekanne(annakontoSWED, 10.0);
        System.out.println("Konto bilanss = " + annakontoSEB.bilanss);
        annakontoSEB.teeulekanne(annakontoSWED, 10.0);
        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + annakontoSWED.omanik);
        System.out.println("Konto bilanss = " + annakontoSWED.bilanss);
    }
}