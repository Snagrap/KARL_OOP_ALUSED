public class Ristkylik {
    private Double laius;
    private Double korgus;

    public Double getLaius() {
        return laius;
    }

    public void setLaius(Double newLaius) {
        this.laius = this.vaartuseKontroll(newLaius);
    }

    public Double getKorgus() {
        return korgus;
    }

    public void setKorgus(Double newKorgus) {
        this.korgus = this.vaartuseKontroll(newKorgus);
    }

    public Double vaartuseKontroll(Double vaartus) {
        if (vaartus < 0.0) {
            vaartus = Math.abs(vaartus);
            return vaartus;
        }
        return vaartus;
    }

    @Override
    public String toString() {
        return "Ristkylik: " + this.laius + " x " + this.korgus;
    }
}
