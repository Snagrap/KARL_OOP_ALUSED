public class Toode {
    public String nimetus;
    public Double hind;
    public int kogus;

    public Toode(String nimetus, Double hind, int kogus) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }

    public void valjastaToode(String tooteNimetus, Double hindSisestus, int kogusSisestus) {
        this.nimetus = tooteNimetus;
        this.hind = hindSisestus;
        this.kogus = kogusSisestus;
    }
}
