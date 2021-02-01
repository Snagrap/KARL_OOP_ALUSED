public class Loom {
    private int jalgadeArv = 4;
    private String nimi;

    public Loom(String nimi) {
        this.nimi = nimi;
    }

    public void jalutan() {
        System.out.println("Mina liigun");
    }

    public void s66n() {
        System.out.println("Mina söön");
    }

    public void h22l() {
        System.out.println("Minul on hääl");
    }

    @Override
    public String toString() {
        return "Olen " + this.nimi + " ja minul on " + this.jalgadeArv + " jalga";
    }
}
