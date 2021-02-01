public class Kass extends Loom {
    private String karvavarv;

    public Kass(String nimi, String karvavarv) {
        super(nimi);
        this.karvavarv = karvavarv;
    }

    @Override
    public void h22l() {
        super.h22l();
        System.out.println("Mjäuu Mjäuu!");
    }

    @Override
    public String toString() {
        return super.toString() + " ja olen " + this.karvavarv;
    }
}
