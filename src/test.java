/*
 * 01.02
 * autor - Karl Karilaid
 * Tunnitöö Loom
 * */

public class test {
    public static void main(String[] args) {
        Loom minuLoom = new Loom("Minu loom");
        System.out.println(minuLoom);
        minuLoom.jalutan();
        minuLoom.s66n();
        minuLoom.h22l();
        System.out.println("-------------------");
        Kass miisu = new Kass("Miisu", "Punane");
        System.out.println(miisu);
        miisu.jalutan();
        miisu.s66n();
        miisu.h22l();
    }
}