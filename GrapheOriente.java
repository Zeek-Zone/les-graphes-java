package representation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class GrapheOriente {
	Scanner in = new Scanner(System.in);

	/**
	 * Creer et remplir la matrice
	 * 
	 * @param n order du graphe |X|
	 * @return matrice
	 */
	public int[][] creerMatriceAdjacence(int n) {
		n++; // pour commencer l'indice a 1
		int[][] adj = new int[n][n];

		// Ajout
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				System.out.printf("\nSi {%d, %d} appartient a E taper 1 sinon 0: \n", i, j);
				adj[i][j] = in.nextInt();
			}
		}

		return adj;
	}

	/**
	 * Creer et remplir la matrice
	 * 
	 * @param n order du graphe |X|
	 * @param p nombre de liaison
	 * @return matrice
	 */
	public int[][] creerMatriceIncidence(int n, int p) {
		n++;
		p++; // pour commencer l'indice a 1
		int[][] adj = new int[n][p];

		// pass the path to the file as a parameter
		File file = new File("C:\\Users\\zeekzone\\Docs\\Graph Theory\\representation\\file.in");
		Scanner sc;
		try {
			sc = new Scanner(file);

			// Ajout
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < p; j++) {
					System.out.printf("\nSi le sommet %d est une extremite initiale \n"
							+ "de l'arc e%d taper 1 \n"
							+ "Sinon si le sommet %d est une extremite finale \n"
							+ "de l'arc e%d taper -1\n"
							+ "sinon 0 :\n", i, j, i, j);
					adj[i][j] = sc.nextInt();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return adj;
	}

	/**
	 * Creer et remplir la list
	 * 
	 * @param n order du graphe |X|
	 * @return list
	 */
	public ArrayList<ArrayList<Integer>> creerListeAdjacence(int n) {
		n++; // pour commencer l'indice a 1
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}

		// pass the path to the file as a parameter
		File file = new File("C:\\Users\\zeekzone\\Docs\\Graph Theory\\representation\\file.in");
		Scanner sc;
		try {
			sc = new Scanner(file);
			int p;
			// Ajout
			for (int i = 1; i < n; i++) {
				System.out.printf("\nListe d'adjacence de S%d : Combien de voisins? \n", i);
				p = sc.nextInt();
				for (int j = 0; j < p; j++) {
					System.out.println("Donner un voisin:");
					adj.get(i).add(sc.nextInt());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return adj;
	}

	/**
	 * Calcul le degre de sommet s
	 * 
	 * @param s
	 * @return degre
	 */
	public int degre(int[][] adj, int s) {
		int d = 0;

		d = somme(adj, 2, s) + somme(adj, 1, s);

		return d;
	}

	/**
	 * Calcul la somme d'une ligne ou colonne
	 * 
	 * @param adj  matrice
	 * @param type ligne ou colonne (1 ou 2)
	 * @param s    sommet
	 * @return somme
	 */
	private int somme(int[][] adj, int type, int s) {
		int d = 0;

		if (type == 1) // ligne
			for (int j = 0; j < adj.length; j++) {
				d += adj[s][j];
			}
		else // colonne
			for (int i = 0; i < adj.length; i++) {
				d += adj[i][s];
			}

		return d;
	}

	/**
	 * Afficher matrice
	 * 
	 * @param adj matrice
	 *
	 */
	public void afficher(int[][] adj) {
		System.out.println("\nMatrcie : \n");
		for (int i = 1; i < adj.length; i++) {
			for (int j = 1; j < adj[i].length; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Afficher list
	 * 
	 * @param adj List
	 *
	 */
	public void afficher(ArrayList<ArrayList<Integer>> adj) {
		System.out.println("\nList : \n");
		for (int i = 1; i < adj.size(); i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + ", ");
			}
			System.out.println();
		}
	}

}
