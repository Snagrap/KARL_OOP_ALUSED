public class Restoraan {
    public String restoraniNimi;
    public String soogiTyyp;

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
}
