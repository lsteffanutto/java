package test;

import repere.formes.*;
import repere.*;

public class Main{

  public static void main(String[] args) {

    System.out.println("\nZébarti\n");

    //********** POINT *****************
    Point p1 = new Point("p1",Couleur.noir(),-1,5);
    Point p2 = new Point("p2",Couleur.noir(),10,9);
    System.out.println(p1.description()+"\n");
    // Point p2 = new Point("p2",3,10);
    // System.out.println(p2.description()+"\n");

    //********** AXE *****************
    Axe a = new Axe("Axe test ", -2);
    // méthode toString() marche pareil pour Objet et Point
    System.out.println(a.description() + "\n" );
    System.out.println("de taille:" + a.getTaille() + "\n");

    Droite d = new Droite("d", Couleur.noir(), p1, p2 );
    System.out.println(d.description() + "\n" );

    Couleur c = new Couleur(-12,258,13);
    System.out.println(c.description() + "\n" );

    c.auHasard();

    System.out.println(c.description() + "\n" );



  }

}
