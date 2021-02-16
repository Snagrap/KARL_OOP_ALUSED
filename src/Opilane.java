import java.util.ArrayList;

public class Opilane {
    String nimi;
    String unustatavTeema;
    //õpilaste teadmised
    ArrayList<String> teadmised = new ArrayList<>();

    //annab õpilasele nime
    public Opilane(String nimi) {
        this.nimi = nimi;
    }

    //jagab nime test.java failiga
    public String getNimi() {
        return nimi;
    }

    //lisab antud teema õpilase teadmiste hulka
    public void opib(String teema) {
        teadmised.add(teema);
    }

    //näitab praegu selgeid teemasid
    public ArrayList<String> getTeadmised() {
        return teadmised;
    }

    //unustab antud teema õpilaste teadmiste hulgast
    public void unusta(String teema) {
        teadmised.remove(teema);
    }
}
