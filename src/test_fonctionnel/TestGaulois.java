package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain obelix = new Romain("Ob�lix", 16);

		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");
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
