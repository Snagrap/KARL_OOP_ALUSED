public class konto {
    // muutujad
    public String omanik;
    public Double bilanss;
    // meetodid

    public void lookonto(String omanikunimi, Double summa) {
        this.omanik = omanikunimi;
        this.bilanss = summa;
    }

    public boolean lisaraha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik lisada");
            return false;
        } else {
            this.bilanss = this.bilanss + summa;
            System.out.println("KOntole lisatud summa " + summa);
            return true;
        }
    }

    public void lisarahaselgitus(boolean tegevus) {
        if (tegevus == true) {
            System.out.println("Raha on lisatud");
        } else {
            System.out.println("Raha ei ole lisatud - negatiivne summa");
        }
    }

    public boolean votaraha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik lisada");
            return false;
        } else {
            if (summa <= this.bilanss) {
                this.bilanss = this.bilanss - summa;
                System.out.println("Kontost võetud maha " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }

    public boolean teeulekanne(konto teinekonto, Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik kanda üle");
            return false;
        } else {
            if (summa <= this.bilanss) {
                this.bilanss = this.bilanss - summa;
                teinekonto.bilanss = teinekonto.bilanss + summa;
                System.out.println("Kantud üle " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }
}
