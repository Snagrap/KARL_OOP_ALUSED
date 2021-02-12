public class Restoraan {
    private String restoraniNimi;
    private String soogiTyyp;
    private int kylalised = 0;

    public Restoraan(String restoraniNimi, String soogiTyyp) {
        this.restoraniNimi = restoraniNimi;
        this.soogiTyyp = soogiTyyp;
    }

    @Override
    public String toString() {
        return "Restoraan " + restoraniNimi + " on laialdase " + soogiTyyp + " valikuga restoraan.";
    }

    public void avaRestoran() {
        System.out.println("Restoraan on nüüd avatud!");
    }

    public void teenindatud() {
        this.kylalised++;
        System.out.println("Täna on külastatud meid " + this.kylalised + " korda");
    }
}
