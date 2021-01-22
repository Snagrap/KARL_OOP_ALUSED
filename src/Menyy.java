import java.util.ArrayList;

public class Menyy {

    private ArrayList<String> soogid;

    public Menyy() {
        this.soogid = new ArrayList<String>();
    }

    public void lisaSook(String sook) {
        if (!soogid.contains(sook)) {
            this.soogid.add(sook);
        } else {
            System.out.println("Antud toit on juba menüüs olemas");
        }
    }

    public void valjastaMenyy() {
        System.out.println(this.soogid);
    }

    public void puhastaMenyy() {
        this.soogid.clear();
    }
}
