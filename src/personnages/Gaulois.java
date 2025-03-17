package personnages;

import village.Village;


	public Gaulois(String nom, int force) 
		this.nom = nom;
		this.force = force;
		this.village = null}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);
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
}

public static void main(String[] args) {
    Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
    Village village = new Village("Village des Irréductibles", 30, abraracourcix);
    abraracourcix.setVillage(village); // Définition du village du chef

    Gaulois asterix = new Gaulois("Astérix", 8);
    village.ajouterVillageois(asterix);
    asterix.setVillage(village); // Définition du village d'Astérix

    Gaulois obelix = new Gaulois("Obélix", 25);
    village.ajouterVillageois(obelix);
    obelix.setVillage(village); // Définition du village d'Obélix

    village.afficherVillageois(); // Vérification qu'Obélix apparaît bien

    Gaulois doublepolemix = new Gaulois("DoublePolémix", 4); // Pas de village

    // Présentation des Gaulois
    abraracourcix.sePresenter();
    asterix.sePresenter();
    doublepolemix.sePresenter();
}
