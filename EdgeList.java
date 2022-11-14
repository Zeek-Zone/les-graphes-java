package representation;

import java.util.ArrayList;

public class EdgeList {
    private int n; // |X|
    private int p; // |E|
    private ArrayList<Edge> edges; // liste des liaisons

    public EdgeList(int n, int p) {
        this.n = n;
        this.p = p;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(int i, int j, int p) {
        this.edges.add(new Edge(i, j, p));
    }

    public void addEdge(Edge e) {
        this.edges.add(e);
    }

    public void printEdges() {
        for (Edge e : this.edges) {
            System.out.println("S"
                    + e.getI()
                    + " ----(" + e.getP()
                    + ")---- S" + e.getJ());
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "EdgeList [edges=" + edges + ", n=" + n + ", p=" + p + "]";
    }
}
