package personnages;

import objets.Equipement;
import village.Village;

public class Gaulois {
	private String nom;
	private int force;
	private Village village;
	private int nbTrophees;
	private Equipement[] loot = new Equipement[100];
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.village = null;
	}

	public String getNom() {
		return nom;
	}

	private void setVillage(Village village2) {
		// TODO Auto-generated method stub

	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] loot = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; loot != null && i < loot.length; i++, nbTrophees++) {
			this.loot[nbTrophees] = loot[i];
		}

	}

	public void sePresenter() {
		System.out.print("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ");
		if (village == null) {
			System.out.println("Je voyage de villages en villages.\"");
		} else if (village.getChef() == this) {
			System.out.println("Je suis le chef du village " + village.getNom() + ".\"");
		} else {
			System.out.println("J'habite le village " + village.getNom() + ".\"");
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		abraracourcix.setVillage(village);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		asterix.setVillage(village);

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		obelix.setVillage(village);

		village.afficherVillageois();

		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);

		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
	}

}