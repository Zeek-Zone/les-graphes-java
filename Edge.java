package representation;

public class Edge {
    private int i; // Sommet
    private int j; // Sommet
    private int p; // Poids

    public Edge(int i, int j) {
        this.i = i;
        this.j = j;
        this.p = 1;
    }

    public Edge(int i, int j, Integer p) {
        this.i = i;
        this.j = j;

        if (p == null)
            this.p = 1;
        else
            this.p = p;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Edge [i=" + i + ", j=" + j + ", p=" + p + "]";
    }
}
