/*
 * 25.01
 * autor - Karl Karilaid
 * Kapseldus, getterid, setterid ja toString()
 * */

public class test {
    public static void main(String[] args) {
        Ristkylik r1 = new Ristkylik();

        r1.setLaius(2.0);
        r1.setKorgus(4.0);
        System.out.println(r1);
        System.out.println("-------------");

        Ristkylik r2 = new Ristkylik();
        r2.setLaius(4.2);
        r2.setKorgus(3.6);
        System.out.println(r2);
        System.out.println("------------");

        Ristkylik r3 = new Ristkylik();
        r3.setKorgus(6.2);
        r3.setLaius(5.4);
        System.out.println(r3);
        System.out.println("-------------");

    }
}
