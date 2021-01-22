/*
 * 22.01
 * autor - Karl Karilaid
 * ülesanne 2
 * */

public class test {
    public static void main(String[] args) {
        KahanevLoendur loendur = new KahanevLoendur(100);

        loendur.valjastaVaartus();

        loendur.reset();
        loendur.valjastaVaartus();
        ;

        loendur.kahane();
        loendur.valjastaVaartus();
    }
}