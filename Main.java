package representation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n = 4;
		GrapheOriente grapheOriente = new GrapheOriente();
		ArrayList<ArrayList<Integer>> adj = grapheOriente.creerListeAdjacence(n);
		grapheOriente.afficher(adj);

		/*
		 * int n = 5;
		 * GrapheNonOriente grapheNonOriente = new GrapheNonOriente();
		 * ArrayList<ArrayList<Integer>> adj = grapheNonOriente.creerListeAdjacence(n);
		 * grapheNonOriente.afficher(adj);
		 */

		// pass the path to the file as a parameter
		/*
		 * File file = new
		 * File("C:\\Users\\zeekzone\\Docs\\Graph Theory\\representation\\file.in");
		 * Scanner sc;
		 * 
		 * try {
		 * sc = new Scanner(file);
		 * int p = 8;
		 * int n = 5;
		 * EdgeList edgeList = new EdgeList(n, p);
		 * // Ajout
		 * for (int i = 0; i < p; i++) {
		 * System.out.println("Donner un lien (i, j , p) :");
		 * Edge e = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
		 * edgeList.addEdge(e);
		 * }
		 * 
		 * edgeList.printEdges();
		 * 
		 * } catch (FileNotFoundException e) {
		 * e.printStackTrace();
		 * }
		 */

		/*
		 * int n = 5, p=6;
		 * GrapheNonOriente grapheNonOriente = new GrapheNonOriente();
		 * int[][] adj = grapheNonOriente.creerMatriceIncidence(n, p);
		 * grapheNonOriente.afficher(adj);
		 */

		/*
		 * int n = 4, p = 4;
		 * GrapheOriente grapheOriente = new GrapheOriente();
		 * int[][] adj = grapheOriente.creerMatriceIncidence(n, p);
		 * 
		 * grapheOriente.afficher(adj);
		 */

		/*
		 * for (int index = 1; index < adj.length; index++) {
		 * int s = index;
		 * System.out.printf("Le degree de s(%d) est %d.\n", s, grapheOriente.degre(adj,
		 * s));
		 * }
		 */
	}
}
