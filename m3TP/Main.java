class Main{

  public static void main(String[] args) {

    System.out.println("\nZébarti\n");

    //********** POINT *****************
    Point p1 = new Point("p1",-1,5);
    System.out.println(p1.description()+"\n");
    Point p2 = new Point("p2",3,10);
    System.out.println(p2.description()+"\n");

    //********** AXE *****************
    Axe a = new Axe("Axe test ", -2);
    // méthode toString() marche pareil pour Objet et Point
    System.out.println(a.description() + "\n" );
    //System.out.println("de taille:" + a.getTaille() + "\n");

    Droite d = new Droite("d", p1, p2 );
    System.out.println(d.description() + "\n" );



  }

}
