package repere;

public class EnsembleElementRepereChaine implements EnsembleElementRepere{ 

	ElementRepereCell tete;

	// @Override
	public ElementRepere recuperer(int index) {
		ElementRepereCell c = tete;
		int cpt = 0;
		while (c != null) {
			if ( cpt== index)
				return c.valeur;
			++cpt;
			c = c.suivante;
		}
		return null;
	}

	// @Override
	public void ajouter(ElementRepere element) {
		tete = new ElementRepereCell(element, tete);
	}

	// @Override
	public int nombreElements(){
		ElementRepereCell c = tete;
		int cpt = 0;
		while (c != null) {
			++cpt;
			c = c.suivante;

		}
		return cpt;
	}
}

class ElementRepereCell  {

	ElementRepere valeur;

	ElementRepereCell suivante;

	ElementRepereCell(ElementRepere valeur, ElementRepereCell suivante) {
		this.valeur = valeur;
		this.suivante = suivante;
	}
}
