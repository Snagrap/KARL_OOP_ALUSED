public class Inimene2 {
    private static int kasutatudJk = 0;
    private int jk = 0;
    private int id;

    public Inimene2() {
        this.id = kasutatudJk;
        this.jk = this.id;
        this.id = ++kasutatudJk;
    }

    public int getJk() {
        return jk;
    }

    public void SetJk(int jk) {
        this.jk = jk;
    }
}
