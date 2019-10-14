package test;

import repere.*;
import repere.formes.*;

public class TestEnsembleElementRepere {

	public static void main(String[] args) {

		EnsembleElementRepere ens;

		//EnsembleElementRepere ens = new EnsembleElementRepere();
		// Liste chaînée
		ens = new EnsembleElementRepereChaine();

		long t0 = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			ens.ajouter(new Point("Point",Couleur.auHasard(),(int)(Math.random()*20),(int)(Math.random()*20)));
		}
		long t1 = System.currentTimeMillis();
		long time = t1 - t0;
		System.out.println(ens.nombreElements() + " éléments ajoutés en: " + time + " ms.");
	}

}
