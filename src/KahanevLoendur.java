public class KahanevLoendur {
    private int vaartus;
    private int algvaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
        this.algvaartus = vaartus;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        if (vaartus > 0) {
            this.vaartus = vaartus - 1;
        } else {
            System.out.println("Loendur ei saa minna negatiivseks");
        }
    }

    public void reset() {
        this.vaartus = 0;
    }

    public void algvaartusta() {
        this.vaartus = algvaartus;
    }
}

