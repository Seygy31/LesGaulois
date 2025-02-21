package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain obelix = new Romain("Obélix", 16);

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);
		asterix.frapper(obelix);

	}
}
