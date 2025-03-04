package village;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int nbVillageoisMax;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageois) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageois;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numVillaegois) {
		if (numVillaegois > nbVillageois) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village ");
			return null;
		} else
			return villageois[numVillaegois];
	}

	public static void main(String[] args) {
		Village tlse = new Village("Toulouse", 100);
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("obelix", 8);
		tlse.ajouterVillageois(asterix);
		tlse.ajouterVillageois(obelix);

		for (int i = 0; i < tlse.nbVillageois; i++) {
			System.out.println(tlse.villageois[i]);
		}

		tlse.trouverVillageois(5);
		tlse.trouverVillageois(1);

	}

}
