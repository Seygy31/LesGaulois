package village;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int nbVillageoisMax;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(String nom, int nbVillageoisMax, Gaulois chef) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageoisMax;
		this.chef = chef;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMax) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		} else {
			System.out.println("Le village est plein !");
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= 0 || numVillageois > nbVillageois) {
			System.out.println("Il n’y a pas autant d'habitants dans notre village !");
			return null;
		} 
		return villageois[numVillageois - 1]; // Ajustement car l'index commence à 0
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
		System.out.println("vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);

		Gaulois gaulois = village.trouverVillageois(30); // Ne doit pas lever d'exception

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);

		gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);

		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);

		village.afficherVillageois();
	}
}
