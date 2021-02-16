public class Opetaja {
    String nimi;
    String opetab;

    //õpetaja saab nime
    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    //õpetaja võtab klassist Opilane .opib meetodi ja õpetab õpilastele teemad
    public void opetab(Opilane opilane, String teema) {
        opilane.opib(teema);
    }
}
