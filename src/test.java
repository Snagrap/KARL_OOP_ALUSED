/*
 * 10.02
 * autor - Karl Karilaid
 * Kodutöö Restoraan
 * */

public class test {
    public static void main(String[] args) {
        Restoraan restoraan1 = new Restoraan("Lore", "kala");
        Restoraan restoraan2 = new Restoraan("McDonalds", "burger");
        Restoraan restoraan3 = new Restoraan("Hesburger", "friikartul");

        restoraan1.avaRestoran();
        restoraan2.avaRestoran();
        restoraan3.avaRestoran();

        restoraan1.teenindatud();
        restoraan1.teenindatud();
        restoraan1.teenindatud();

        Restoraan Jaatis1 = new JaatiseKiosk("Jäätisekiosk", "Jäätised");
        Jaatis1.avaRestoran();
        //Jaatis1.lisaJaatis();
        Jaatis1.teenindatud();


    }

}